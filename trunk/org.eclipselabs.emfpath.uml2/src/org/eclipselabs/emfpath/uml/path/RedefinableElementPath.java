package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;

/**
 * @generated
 */
public class RedefinableElementPath extends NamedElementPath {

	/**
	 * @generated
	 */
	 RedefinableElementPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = new Predicate<RedefinableElement>() {
		public boolean apply(RedefinableElement s) {
			return s.isLeaf();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = new Function<RedefinableElement, EList<RedefinableElement>>() {
		public EList<RedefinableElement> apply(RedefinableElement s) {
			return s.getRedefinedElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = new Function<RedefinableElement, EList<Classifier>>() {
		public EList<Classifier> apply(RedefinableElement s) {
			return s.getRedefinitionContexts();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionContextValid(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<RedefinableElement>() {
			public boolean apply(RedefinableElement s) {
				return s.validateRedefinitionContextValid(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent()
	 * @generated
	 */
	public static Predicate<RedefinableElement> validateRedefinitionConsistent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<RedefinableElement>() {
			public boolean apply(RedefinableElement s) {
				return s.validateRedefinitionConsistent(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isConsistentWith(final RedefinableElement redefinee) {
		return new Predicate<RedefinableElement>() {
			public boolean apply(RedefinableElement s) {
				return s.isConsistentWith(redefinee);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid()
	 * @generated
	 */
	public static Predicate<RedefinableElement> isRedefinitionContextValid(final RedefinableElement redefined) {
		return new Predicate<RedefinableElement>() {
			public boolean apply(RedefinableElement s) {
				return s.isRedefinitionContextValid(redefined);
			}
		};
	}

}
