A set of functions and predicates (as defined by Google Collections / Guava libraries) along with a set of utility methods to help navigating and editing Eclipse EMF models.

EMFPath depends on [Google Guava](http://code.google.com/p/guava-libraries/). Guava is available as OSGi bundles from the [guava-osgi](http://code.google.com/p/guava-osgi/) project.

## The 0.4.0 release is available ##

The simple Jars are available in ZIP on the **[download page](http://code.google.com/a/eclipselabs.org/p/emfpath/downloads/list)**

The OSGi bundles are available from the P2 repository (update site): **http://svn.codespot.com/a/eclipselabs.org/emfpath/trunk/repository/**

The "[how to install](Installation.md)" is available in the wiki section.

## Minimum requirements ##

  * [Java 5 (J2SE 1.5)](http://www.oracle.com/technetwork/java/index.html).
  * [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/modeling/emf/) 2.4 (tested on 2.4.2, 2.5.0 and 2.6.0 - 2.6.1 is coming),
  * [Guava libraries](http://code.google.com/p/guava-libraries/) [r05](http://code.google.com/p/guava-libraries/downloads/detail?name=guava-r05.zip). For Eclipse users, Guava is also available in an [update site](http://guava-osgi.googlecode.com/svn/trunk/repository/) from the [guava-osgi](http://code.google.com/p/guava-osgi/) project. The [r05](https://code.google.com/p/emfpath/source/detail?r=05) Guava release [corresponds to](http://code.google.com/p/guava-osgi/#Note) OSGi bundle v5.0.0.

## Warnings ##

**This framework is in Beta stage** (Beta will last as long as it will be necessary and will stop when 1.0.0 will be released). All APIs are subject to change meaning that there is **no compatibility guarantees between pre-1.0.0 releases**.

The post-1.0.0 releases will contain no more source- or binary-incompatible changes, except those that can be performed via a minimum 18-month-long deprecation window.

After the 1.0.0 release, the versionning scheme (in the form of Major.Minor.Micro) will follow those rules:

  * the 'Major' segment (the first) will change for non-backwards-compatible changes;
  * the 'Minor' segment (the middle) will change for feature enhancements that are backwards compatible;
  * the 'Micro' segment (the last) will change for bug-fixes that do not produce visible feature changes.

&lt;wiki:gadget url="http://www.ohloh.net/p/485370/widgets/project\_thin\_badge.xml" height="36" border="0"/&gt;
&lt;wiki:gadget url="http://www.ohloh.net/p/485370/widgets/project\_factoids.xml" border="0" height="155" width="340"/&gt;