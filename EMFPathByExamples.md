# Index all EObjects in a Resource by their EClass #

Our index will be an instance of the [Multimap](http://guava-libraries.googlecode.com/svn/trunk/javadoc/com/google/common/collect/Multimap.html) class of Google Collections (basically, it is an abstraction of `Map<K, Collection<V>>`).

**Beware, this index is statically built and then can be greedy in memory**

Let's say we have an EMF [Resource](http://download.eclipse.org/modeling/emf/emf/javadoc/2.5.0/org/eclipse/emf/ecore/resource/Resource.html) named `eResource`.

First, we get the whole contents in an `Iterable` and we give it to the index() method of the Multimaps class and the EObjects.eClass Function as the indexing function.

```
Iterable<EObject> descendants = descendant.of(eResource);
Multimap<EClass, EObject> descendantsByEClass = Multimaps.index(descendants, EObjects.eClass);
```

This is a strict index that does not index elements regarding their EClass supertypes' hierarchy. For instance if have an EClass referenced by a variable named b\_EClass, `descendantsByEClass.get(b_EClass)` will return all elements having b\_EClass as their EClass, but it will not return elements having a subclass of b\_EClass as their own EClass:

```
EClass a, b; // b inherits from a
descendantsByEClass.get(b); // will return elements of type b but not a
```

To do so, we have to substitute the indexing function EObjects.eClass by a composite one. This composite Function get the EClass of the current EObject and return this EClass and all its supertypes. To put all indexes into the Multimap, we have to change to call of Multimaps.index to Multimaps2.index to create an index of all elements by kind:

```
Iterable<EObject> descendants = descendant.of(eResource);
Multimap<EClass, EObject> descendantsByKind = Multimaps2.index(descendants, Functions.compose(EClasses.eAllSuperTypesAndSelf, EObjects.eClass));
```

Now, descendantsByEClass.get() will return elements of type b and its supertypes.

```
EClass a, b; // b inherits from a
descendantsByEClass.get(b); // will return elements of type b and a
```

An equivalent without EMFPath nor Google Collections would be:

```
TreeIterator<EObject> it = eResource.getAllContents();
Map<EClass, List<EObject>> index = new HashMap<EClass, List<EObject>>();
while(it.hasNext()) {
	EObject current = it.next();
	EClass eClass = current.eClass();
	addValueToMap(index, eClass, current);
	for (EClass supertype : eClass.getEAllSuperTypes()) {
		addValueToMap(index, supertype, current);
	}
}

public static void addValueToMap(Map<EClass, List<EObject>> index, EClass k, EObject v) {
	List<EObject> values = index.get(k);
	if (values == null) {
		values = new ArrayList<EObject>();
		index.put(k, values);
	}
	values.add(v);
}
```

No comment ;)