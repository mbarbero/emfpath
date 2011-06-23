package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.RedefinableElement RedefinableElement} in a functional way.
 * <p>
 * A redefinable element is an element that, when defined in the context of a classifier,
 * can be redefined more specifically or differently in the context of another classifier
 * that specializes (directly or indirectly) the context classifier. 
 * @see org.eclipse.uml2.uml.RedefinableElement
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
	 * Indicates whether it is possible to further specialize a RedefinableElement. If the
	 * value is true, then it is not possible to further specialize the RedefinableElement.
	 * @see org.eclipse.uml2.uml.RedefinableElement#isLeaf()
	 * @generated
	 */
	public static final Predicate<RedefinableElement> isLeaf = new Predicate<RedefinableElement>() {
		public boolean apply(RedefinableElement s) {
			return s.isLeaf();
		}
	};

	/**
	 * The redefinable element that is being redefined by this element. 
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinedElements()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<RedefinableElement>> redefinedElement = new Function<RedefinableElement, EList<RedefinableElement>>() {
		public EList<RedefinableElement> apply(RedefinableElement s) {
			return s.getRedefinedElements();
		}
	};

	/**
	 * References the contexts that this element may be redefined from. 
	 * @see org.eclipse.uml2.uml.RedefinableElement#getRedefinitionContexts()
	 * @generated
	 */
	public static final Function<RedefinableElement, EList<Classifier>> redefinitionContext = new Function<RedefinableElement, EList<Classifier>>() {
		public EList<Classifier> apply(RedefinableElement s) {
			return s.getRedefinitionContexts();
		}
	};
	
	/**
	 * At least one of the redefinition contexts of the redefining element must be a specialization
	 * of at least one of the redefinition contexts for each redefined element.
	self.redefinedElement->forAll(e
	 * | self.isRedefinitionContextValid(e)) 
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionContextValid(DiagnosticChain, Map)
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
	 * A redefining element must be consistent with each redefined element.
	self.redefinedElement->forAll(re
	 * | re.isConsistentWith(self)) 
	 * @see org.eclipse.uml2.uml.RedefinableElement#validateRedefinitionConsistent(DiagnosticChain, Map)
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
	 * The query isConsistentWith() specifies, for any two RedefinableElements in a context
	 * in which redefinition is possible, whether redefinition would be logically consistent.
	 * By default, this is false; this operation must be overridden for subclasses of RedefinableElement
	 * to define the consistency conditions.
	redefinee.isRedefinitionContextValid(self)
	result
	 * = false 
	 * @see org.eclipse.uml2.uml.RedefinableElement#isConsistentWith(RedefinableElement)
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
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts
	 * of this RedefinableElement are properly related to the redefinition contexts of the
	 * specified RedefinableElement to allow this element to redefine the other. By default
	 * at least one of the redefinition contexts of this element must be a specialization
	 * of at least one of the redefinition contexts of the specified element.
	result = redefinitionContext->exists(c
	 * | c.allParents()->includes(redefined.redefinitionContext))) 
	 * @see org.eclipse.uml2.uml.RedefinableElement#isRedefinitionContextValid(RedefinableElement)
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
