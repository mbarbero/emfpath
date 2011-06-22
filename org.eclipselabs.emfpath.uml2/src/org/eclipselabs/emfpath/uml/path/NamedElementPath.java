package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.Usage;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * @generated
 */
public class NamedElementPath extends ElementPath {

	/**
	 * @generated
	 */
	 NamedElementPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getName()
	 * @generated
	 */
	public static final Function<NamedElement, String> name = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getName();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getVisibility()
	 * @generated
	 */
	public static final Function<NamedElement, VisibilityKind> visibility = new Function<NamedElement, VisibilityKind>() {
		public VisibilityKind apply(NamedElement s) {
			return s.getVisibility();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getQualifiedName()
	 * @generated
	 */
	public static final Function<NamedElement, String> qualifiedName = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getQualifiedName();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getClientDependencies()
	 * @generated
	 */
	public static final Function<NamedElement, EList<Dependency>> clientDependency = new Function<NamedElement, EList<Dependency>>() {
		public EList<Dependency> apply(NamedElement s) {
			return s.getClientDependencies();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getNamespace()
	 * @generated
	 */
	public static final Function<NamedElement, Namespace> namespace = new Function<NamedElement, Namespace>() {
		public Namespace apply(NamedElement s) {
			return s.getNamespace();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getNameExpression()
	 * @generated
	 */
	public static final Function<NamedElement, StringExpression> nameExpression = new Function<NamedElement, StringExpression>() {
		public StringExpression apply(NamedElement s) {
			return s.getNameExpression();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.NamedElement#validateHasNoQualifiedName()
	 * @generated
	 */
	public static Predicate<NamedElement> validateHasNoQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.validateHasNoQualifiedName(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#validateHasQualifiedName()
	 * @generated
	 */
	public static Predicate<NamedElement> validateHasQualifiedName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.validateHasQualifiedName(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#validateVisibilityNeedsOwnership()
	 * @generated
	 */
	public static Predicate<NamedElement> validateVisibilityNeedsOwnership(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.validateVisibilityNeedsOwnership(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#createDependency()
	 * @generated
	 */
	public static Function<NamedElement, Dependency> createDependency(final NamedElement supplier) {
		return new Function<NamedElement, Dependency>() {
			public Dependency apply(NamedElement s) {
				return s.createDependency(supplier);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getLabel()
	 * @generated
	 */
	public static final Function<NamedElement, String> getLabel = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getLabel();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getLabel()
	 * @generated
	 */
	public static Function<NamedElement, String> getLabel(final boolean localize) {
		return new Function<NamedElement, String>() {
			public String apply(NamedElement s) {
				return s.getLabel(localize);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#createUsage()
	 * @generated
	 */
	public static Function<NamedElement, Usage> createUsage(final NamedElement supplier) {
		return new Function<NamedElement, Usage>() {
			public Usage apply(NamedElement s) {
				return s.createUsage(supplier);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#getQualifiedName()
	 * @generated
	 */
	public static final Function<NamedElement, String> getQualifiedName = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.getQualifiedName();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#allNamespaces()
	 * @generated
	 */
	public static final Function<NamedElement, EList<Namespace>> allNamespaces = new Function<NamedElement, EList<Namespace>>() {
		public EList<Namespace> apply(NamedElement s) {
			return s.allNamespaces();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#isDistinguishableFrom()
	 * @generated
	 */
	public static Predicate<NamedElement> isDistinguishableFrom(final NamedElement n, final Namespace ns) {
		return new Predicate<NamedElement>() {
			public boolean apply(NamedElement s) {
				return s.isDistinguishableFrom(n, ns);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#separator()
	 * @generated
	 */
	public static final Function<NamedElement, String> separator = new Function<NamedElement, String>() {
		public String apply(NamedElement s) {
			return s.separator();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.NamedElement#allOwningPackages()
	 * @generated
	 */
	public static final Function<NamedElement, EList<Package>> allOwningPackages = new Function<NamedElement, EList<Package>>() {
		public EList<Package> apply(NamedElement s) {
			return s.allOwningPackages();
		}
	};

}
