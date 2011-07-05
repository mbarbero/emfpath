package org.eclipselabs.emfpath.trans;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;

final class CartesianProduct {

	private CartesianProduct() {
		// prevents instantiation
	}
	
	public static <K, B> Iterable<Map<K, B>> cartesianProduct(ImmutableMap<K, ? extends Iterable<? extends B>> iterables) {
		CartesianSet<K, B> cartesianSet = new CartesianSet<K, B>(iterables);
		return Iterables.isEmpty(cartesianSet) ? ImmutableSet.<Map<K, B>> of() : cartesianSet;
	}
	
	public static <K, B> BlockingIterable<Map<K, B>> blockingCartesianProduct(ImmutableMap<K, ? extends BlockingQueue<? extends B>> iterables) {
		BlockingCartesianSet<K, B> cartesianSet = new BlockingCartesianSet<K, B>(iterables);
		return Iterables.isEmpty(cartesianSet) ? BlockingIterables.<Map<K, B>> of() : cartesianSet;
	}

	private static class CartesianSet<K, B> implements Iterable<Map<K, B>> {
		final ImmutableList<IAxis<K, B>> axes;
		int size;

		CartesianSet(ImmutableMap<K, ? extends Iterable<? extends B>> entries) {
			long dividend = 1;
			ImmutableList.Builder<IAxis<K, B>> builder = ImmutableList.builder();
			for (Entry<K, ? extends Iterable<? extends B>> entry : entries.entrySet()) {
				K key = entry.getKey();
				Iterable<? extends B> iterable = entry.getValue();
				
				IAxis<K, B> axis = null;
				if (iterable instanceof RandomAccess) {
					axis = new RandomAccessAxis(key, iterable, (int)dividend); // check overflow at end
				} else {
					axis = new Axis(key, iterable, (int) dividend); // check overflow at end
				}
				
				builder.add(axis);
				dividend *= axis.size();
			}
			this.axes = builder.build();
			
			
			size = Ints.checkedCast(dividend);
		}

		public UnmodifiableIterator<Map<K, B>> iterator() {
			return new UnmodifiableIterator<Map<K, B>>() {
				long dividend = 1;
				int index;

				public boolean hasNext() {
					return index < size;
				}

				public Map<K, B> next() {
					if (!hasNext()) {
						throw new NoSuchElementException();
					}

					int nbAxis = axes.size();
					CartesianTupleSet<K, B> tupleSet = new CartesianTupleSet<K, B>(nbAxis);
					dividend = 1;
					for (int i = 0; i < nbAxis; i++) {
						IAxis<K, B> axis = axes.get(i);
						tupleSet.put(axis.getKey(), axis.getForIndex(index));
						axis.setDividend((int)dividend); // check overflow at end
						dividend *= axis.size(); 
					}
					
					size = Ints.checkedCast(dividend);
					index++;

					return tupleSet;
				}
			};
		}

		@Override
		public boolean equals(Object object) {
			// Warning: this is broken if size() == 0, so it is critical that we
			// substitute an empty ImmutableSet to the user in place of this
			if (object instanceof CartesianSet) {
				CartesianSet<?, ?> that = (CartesianSet<?, ?>) object;
				return this.axes.equals(that.axes);
			}
			return super.equals(object);
		}

		@Override
		public int hashCode() {
			// Warning: this is broken if size() == 0, so it is critical that we
			// substitute an empty ImmutableSet to the user in place of this

			// It's a weird formula, but tests prove it works.
			int adjust = size - 1;
			for (int i = 0; i < axes.size(); i++) {
				adjust *= 31;
			}
			return axes.hashCode() + adjust;
		}
		
		private class RandomAccessAxis implements IAxis<K, B> {

			private final Iterable<? extends B> choices;
			private K key;
			private int dividend;
			
			RandomAccessAxis(K key, Iterable<? extends B> iterable, int dividend) {
				choices = iterable;
				this.key = key;
				this.setDividend(dividend);
			}
			
			public K getKey() {
				return key;
			}
			
			public int size() {
				return Iterables.size(choices);
			}

			public int getDividend() {
				return dividend;
			}
			
			public void setDividend(int dividend) {
				this.dividend = dividend;
			}

			public B getForIndex(int index) {
				int realIndex = index / getDividend() % size();
				return Iterables.get(choices, realIndex);
			}

			@Override
			public boolean equals(Object obj) {
				if (obj instanceof CartesianSet.RandomAccessAxis) {
					CartesianSet<?,?>.RandomAccessAxis that = (CartesianSet<?,?>.RandomAccessAxis) obj; //javac may rejects "CartesianSet<?>.Axis"
					return this.choices.equals(that.choices);
					// dividends must be equal or we wouldn't have gotten this far
				}
				return false;
			}

			@Override
			public int hashCode() {
				// Because Axis instances are not exposed, we can
				// opportunistically choose whatever bizarre formula happens
				// to make CartesianSet.hashCode() as simple as possible.
				return size / size() * choices.hashCode();
			}
			
		}
		
		private class Axis implements IAxis<K, B> {
			private final Iterator<? extends B> choicesIterator;
			private final List<B> choicesList;
			private K key;
			private int dividend;
			ReadWriteLock lock = new ReentrantReadWriteLock();

			Axis(K key, Iterable<? extends B> iterable, int dividend) {
				choicesIterator = iterable.iterator();
				choicesList = Lists.newArrayList();
				this.key = key;
				this.setDividend(dividend);
			}

			public K getKey() {
				return key;
			}
			
			public int size() {
				int ret;
				if (choicesList.isEmpty()) {
					lock.writeLock().lock();
					ret = choicesIterator.hasNext() ? 1 : 0;
					lock.writeLock().unlock();
				} else {
					lock.writeLock().lock();
					if (choicesIterator.hasNext()) {
						ret = choicesList.size() + 1;	
					} else {
						ret = choicesList.size();
					}
					lock.writeLock().unlock();
				}
				
				return ret;
			}

			public int getDividend() {
				return dividend;
			}
			
			public void setDividend(int dividend) {
				this.dividend = dividend;
			}

			public B getForIndex(int index) {
				int realIndex = index / getDividend() % size();
				B ret = null;
				
				if(realIndex < choicesList.size()) {
					ret = choicesList.get(realIndex);
				} else {
					lock.writeLock().lock();
					ret = choicesIterator.next();
					lock.writeLock().unlock();
					choicesList.add(realIndex, ret);
				}
				
				return ret;
			}

			@Override
			public boolean equals(Object obj) {
				if (obj instanceof CartesianSet.Axis) {
					CartesianSet<?,?>.Axis that = (CartesianSet<?,?>.Axis) obj;
					return this.choicesIterator.equals(that.choicesIterator);
					// dividends must be equal or we wouldn't have gotten this far
				}
				return false;
			}

			@Override
			public int hashCode() {
				// Because Axis instances are not exposed, we can
				// opportunistically choose whatever bizarre formula happens
				// to make CartesianSet.hashCode() as simple as possible.
				return size / size() * choicesIterator.hashCode();
			}
		}
	}
	
	private static interface IAxis<K, B> {
		K getKey();
		int size();
		int getDividend();
		void setDividend(int d);
		B getForIndex(int i);
	}

	private static class CartesianTupleSet<K,V> extends AbstractMap<K, V> {
		
		private Entry<K,V>[] backingArray;
		private int size;

		@SuppressWarnings("unchecked")
		public CartesianTupleSet(int capacity) {
			backingArray = (Entry<K, V>[]) new Entry<?,?>[capacity];
		}
		
		public V put(K key, final V newValue) {
			Preconditions.checkState(size() < backingArray.length, "backing array has reach its limit");
			Preconditions.checkArgument(key != null, "Key must not be null");
			Preconditions.checkArgument(newValue != null, "value must not be null");
			backingArray[size()] = Maps.immutableEntry(key, newValue);
			size++;
			return newValue;
		}
		
		@Override
		public V get(Object key) {
			V ret = null;
			for (Entry<K, V> entry : backingArray) {
				if(key.equals(entry.getKey())) {
					ret = entry.getValue();
					break;
				}
			}
			return ret;
		}
		
		@Override
		public int size() {
			return size;
		}
		
		@Override
		public void clear() {
			Arrays.fill(backingArray, null);
			size = 0;
		}
		
		@Override
		public boolean containsKey(Object key) {
			boolean ret = false;
			if (key != null) {
				for (Entry<K, V> entry : backingArray) {
					if(key.equals(entry.getKey())) {
						ret = true;
						break;
					}
				}
			}
			return ret;
		}
		
		@Override
		public boolean containsValue(Object value) {
			boolean ret = false;
			if (value != null) {
				for (Entry<K, V> entry : backingArray) {
					if(value.equals(entry.getValue())) {
						ret = true;
						break;
					}
				}
			}
			return ret;
		}
		
		@Override
		public V remove(Object key) {
			throw new UnsupportedOperationException("remove operation is unsupported by cartesian tuple set");
		}
		
		@Override
		public Set<Entry<K, V>> entrySet() {
			return new AbstractSet<Entry<K,V>>() {
				@Override
				public boolean add(Entry<K, V> o) {
					return put(o.getKey(), o.getValue()) == o.getValue();
				}
				
				@Override
				public Iterator<Entry<K, V>> iterator() {
					return new AbstractIterator<Entry<K,V>>() {
						private int i = 0;
						@Override
						protected Entry<K, V> computeNext() {
							if (backingArray.length <= i) {
								return endOfData();
							}
							Entry<K, V> next = backingArray[i];
							i++;
							return next;
						}
					};
				}

				@Override
				public int size() {
					return backingArray.length;
				}
				
			};
		}
		
		
		public boolean equals(Object o) {
			if (o == this)
				return true;

			if (!(o instanceof Map<?,?>))
				return false;
			
			Map<?, ?> t = (Map<?, ?>) o;
			if (t.size() != size())
				return false;

			try {
				for (int i = 0; i < size(); i++) {
					Entry<K, V> e = backingArray[i];
					K key = e.getKey();
					V value = e.getValue();
					// value will never be null by contract (see put(K, V))
					if (!value.equals(t.get(key))) 
						return false;
				}
			} catch (ClassCastException unused) {
				return false;
			} catch (NullPointerException unused) {
				return false;
			}

			return true;
		}
	}

	private static class BlockingCartesianSet<K, B> implements BlockingIterable<Map<K, B>> {
		final ImmutableList<BlockingAxis> axes;
		int size;

		BlockingCartesianSet(ImmutableMap<K, ? extends BlockingQueue<? extends B>> entries) {
			long dividend = 1;
			ImmutableList.Builder<BlockingAxis> builder = ImmutableList.builder();
			for (Entry<K, ? extends BlockingQueue<? extends B>> entry : entries.entrySet()) {
				K key = entry.getKey();
				BlockingQueue<? extends B> iterable = entry.getValue();
				
				BlockingAxis axis = new BlockingAxis(key, iterable, (int) dividend); // check overflow at end
				
				builder.add(axis);
				dividend *= axis.size();
			}
			this.axes = builder.build();
			
			
			size = Ints.checkedCast(dividend);
		}
		
		private class BlockingAxis implements IAxis<K, B> {
			private final BlockingQueue<? extends B> choicesQueue;
			private final List<B> choicesList;
			private K key;
			private int dividend;

			BlockingAxis(K key, BlockingQueue<? extends B> queue, int dividend) {
				choicesQueue = queue;
				choicesList = Lists.newArrayList();
				this.key = key;
				this.setDividend(dividend);
			}

			public K getKey() {
				return key;
			}
			
			public int size() {
				int ret;
				if (choicesList.isEmpty()) {
					ret = choicesQueue.isEmpty() ? 0 : 1;
				} else {
					if (choicesQueue.peek() != null) {
						ret = choicesList.size() + 1;	
					} else {
						ret = choicesList.size();
					}
				}
				
				return ret;
			}

			public int getDividend() {
				return dividend;
			}
			
			public void setDividend(int dividend) {
				this.dividend = dividend;
			}

			public B getForIndex(int index) {
				int realIndex = index / getDividend() % size();
				B ret = null;
				
				if(realIndex < choicesList.size()) {
					ret = choicesList.get(realIndex);
				} else {
					try {
						ret = choicesQueue.take();
						choicesList.add(realIndex, ret);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				return ret;
			}

			@Override
			public boolean equals(Object obj) {
				if (obj instanceof CartesianSet.Axis) {
					CartesianSet<?,?>.Axis that = (CartesianSet<?,?>.Axis) obj;
					return this.choicesQueue.equals(that.choicesIterator);
					// dividends must be equal or we wouldn't have gotten this far
				}
				return false;
			}

			@Override
			public int hashCode() {
				// Because Axis instances are not exposed, we can
				// opportunistically choose whatever bizarre formula happens
				// to make CartesianSet.hashCode() as simple as possible.
				return size / size() * choicesQueue.hashCode();
			}
			
		}

		public Iterator<Map<K, B>> iterator() {
			return new UnmodifiableIterator<Map<K, B>>() {
				long dividend = 1;
				int index;

				public boolean hasNext() {
					return index < size;
				}

				public Map<K, B> next() {
					if (!hasNext()) {
						throw new NoSuchElementException();
					}

					int nbAxis = axes.size();
					CartesianTupleSet<K, B> tupleSet = new CartesianTupleSet<K, B>(nbAxis);
					dividend = 1;
					for (int i = 0; i < nbAxis; i++) {
						IAxis<K, B> axis = axes.get(i);
						tupleSet.put(axis.getKey(), axis.getForIndex(index));
						axis.setDividend((int)dividend); // check overflow at end
						dividend *= axis.size(); 
					}
					
					size = Ints.checkedCast(dividend);
					index++;

					return tupleSet;
				}
			};
		}
	}
}
