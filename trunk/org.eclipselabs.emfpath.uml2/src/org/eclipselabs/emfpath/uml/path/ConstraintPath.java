package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Constraint Constraint} in a functional way.
 * <p>
 * A constraint is a condition or restriction expressed in natural language text or in
 * a machine readable language for the purpose of declaring some of the semantics of
 * an element. 
 * @see org.eclipse.uml2.uml.Constraint
 * @generated
 */
public class ConstraintPath extends PackageableElementPath {

	/**
	 * @generated
	 */
	 ConstraintPath() {
    super();
  }

	/**
	 * The ordered set of Elements referenced by this Constraint. 
	 * @see org.eclipse.uml2.uml.Constraint#getConstrainedElements()
	 * @generated
	 */
	public static final Function<Constraint, EList<Element>> constrainedElement = new Function<Constraint, EList<Element>>() {
    public EList<Element> apply(Constraint s) {
      return s.getConstrainedElements();
    }
  };

	/**
	 * A condition that must be true when evaluated in order for the constraint to be satisfied.
	 * @see org.eclipse.uml2.uml.Constraint#getSpecification()
	 * @generated
	 */
	public static final Function<Constraint, ValueSpecification> specification = new Function<Constraint, ValueSpecification>() {
    public ValueSpecification apply(Constraint s) {
      return s.getSpecification();
    }
  };

	/**
	 * Specifies the namespace that owns the NamedElement. 
	 * @see org.eclipse.uml2.uml.Constraint#getContext()
	 * @generated
	 */
	public static final Function<Constraint, Namespace> context = new Function<Constraint, Namespace>() {
    public Namespace apply(Constraint s) {
      return s.getContext();
    }
  };
	
	/**
	 * A constraint cannot be applied to itself.
	not constrainedElement->includes(self)
	 * @see org.eclipse.uml2.uml.Constraint#validateNotApplyToSelf(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Constraint> validateNotApplyToSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Constraint>() {
      public boolean apply(Constraint s) {
        return s.validateNotApplyToSelf(diagnostics, context);
      }
    };
  }

	/**
	 * The value specification for a constraint must evaluate to a Boolean value.
	self.specification().booleanValue().isOclKindOf(Boolean)
	 * @see org.eclipse.uml2.uml.Constraint#validateValueSpecificationBoolean(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Constraint> validateValueSpecificationBoolean(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Constraint>() {
      public boolean apply(Constraint s) {
        return s.validateValueSpecificationBoolean(diagnostics, context);
      }
    };
  }

	/**
	 * The value specification for a constraint must evaluate to a Boolean value.
	true 
	 * @see org.eclipse.uml2.uml.Constraint#validateBooleanValue(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Constraint> validateBooleanValue(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Constraint>() {
      public boolean apply(Constraint s) {
        return s.validateBooleanValue(diagnostics, context);
      }
    };
  }

	/**
	 * Evaluating the value specification for a constraint must not have side effects.
	true
	 * @see org.eclipse.uml2.uml.Constraint#validateNoSideEffects(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Constraint> validateNoSideEffects(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Constraint>() {
      public boolean apply(Constraint s) {
        return s.validateNoSideEffects(diagnostics, context);
      }
    };
  }

	/**
	 * A constraint cannot be applied to itself.
	not constrainedElement->includes(self)
	 * @see org.eclipse.uml2.uml.Constraint#validateNotAppliedToSelf(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Constraint> validateNotAppliedToSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Constraint>() {
      public boolean apply(Constraint s) {
        return s.validateNotAppliedToSelf(diagnostics, context);
      }
    };
  }

}
