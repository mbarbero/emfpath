# About Google Collections #

Google Collections (GCol) is a set of optimized extensions of java.util.Collection and helper methods to help manipulating collections. The most noticeable part of GCol is composed of two interfaces: `com.google.common.Predicate` and `com.google.common.base.Function`.

EMFPath is mainly composed of implementations of Predicate and Function. This is the reason why you should know and understand these GCol concepts to use EMFPath effectively.
`Function<F,T>` interface describes "a transformation from one object to another. For example, a StringToIntegerFunction may implement Function<String,Integer> and transform integers in String format to Integer format. The transformation on the source object does not necessarily result in an object of a different type. For example, a FarenheitToCelsiusFunction may implement `Function<Float,Float>`." It has a `Float apply(Float)` method in which we need to implement the behavior of the function.
`Predicate<T>` interface "determines a true or false value for a given input. For example, a `RegexPredicate` might implement `Predicate<String>`, and return true for any string that matches its given regular expression. It has a `boolean apply(String)` method in which we need to implement the behavior of the predicate.

Implementing `Predicate` and `Function` let us use helper methods from `com.google.common.collect.Iterables`. The benefit of using `Iterable` instead of `Collection` whenever it is possible is to avoid the creation of the whole collection in memory but only when the navigation occurs.

In Iterables, the two mains helper methods are filter and transform:
  * `filter` returns an iterable with elements satisfying the predicate
  * `transform` returns an iterable that applies the function to each elements

If you need to iterate more than once on an iterable, it may be interresting to create a List from the `Iterable` to avoid applying predicates and functions multiple times. To create a `List` from an `Iterable`, have a look on `Lists.newArrayList(Iterable)` and `ImmutableList.copyOf(Iterable)`.

Last but not least, if you get an `Iterable<Iterable<T>>` during your development (by applying a `Function<T, Iterable<T>>` for instance), you can view it as a simple one by calling `Iterables.concat(Iterable<Iterable<T>>)`.