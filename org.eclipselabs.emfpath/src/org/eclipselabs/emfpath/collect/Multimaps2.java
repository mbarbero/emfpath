/*******************************************************************************
 * Copyright (c) 2009, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfpath.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;

/**
 * Provides additionnal static methods to {@link Multimaps} acting on or generating a {@link Multimap}.
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @see Multimaps
 * @since 0.4.0
 */
public class Multimaps2 {

	/**
	 * Creates an index {@code ImmutableMultimap} that contains the results of applying a specified function to each
	 * item in an {@code Iterable} of values. Each value will be stored as one or more value in the resulting multimap,
	 * yielding a multimap with the same or bigger size as the input iterable. The keys used to store that value in the
	 * multimap will be the result of calling the function on that value. The resulting multimap is created as an
	 * immutable snapshot, it does <em>not</em> reflect subsequent changes on the input iterable.
	 * <p>
	 * For example,
	 * 
	 * <pre class="code">
	 *  List<String> badGuys
	 *      = Arrays.asList("Inky", "Blinky", "Pinky", "Pinky", "Clyde");
	 *  Function<String, Iterable<Integer>> stringLengthLessThanFunction = ...;
	 *  Multimap<Integer, String> index
	 *      = Multimaps2.index(badGuys, stringLengthLessThanFunction);
	 *  System.out.println(index);}
	 * </pre>
	 * 
	 * prints
	 * 
	 * <pre class="code">
	 *  {1=[Inky, Blinky, Pinky, Clyde], 2=[Inky, Blinky, Pinky, Clyde], 3=[Inky, Blinky, Pinky, Clyde],
	 *  4=[Blinky, Pinky, Clyde], 5=[Blinky]}
	 * </pre>
	 * <p>
	 * The returned multimap is serializable if its keys and values are all serializable.
	 * 
	 * @param <K> key type
	 * @param <V> value type
	 * @param values the values to use when constructing the {@code ImmutableMultimap}
	 * @param keyFunction the function used to produce the key for each value
	 * @return {@code ImmutableMultimap} mapping the result of evaluating the function {@code keyFunction} on each value
	 *         in the input collection to that value
	 * @throws NullPointerException if any of the following cases is true:
	 *         <ul>
	 *         <li> {@code values} is null</li>
	 *         <li> {@code keyFunction} is null</li>
	 *         <li> An element in {@code values} is null</li>
	 *         <li> {@code keyFunction} returns null for any element of {@code values}</li>
	 *         </ul>
	 * @see Multimaps#index(Iterable, Function)
	 */
	public static <K, V> ImmutableListMultimap<K, V> index(Iterable<V> values, Function<? super V, Iterable<? extends K>> keyFunction) {
		Preconditions.checkNotNull(keyFunction);
		ImmutableListMultimap.Builder<K, V> builder = ImmutableListMultimap.builder();
		for (V value : values) {
			Preconditions.checkNotNull(value, values);
			for (K k : keyFunction.apply(value)) {
				builder.put(k, value);
			}
		}
		return builder.build();
	}
}
