package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.Constraint#getConstrainedElements()
	 * @generated
	 */
	public static final Function<Constraint, EList<Element>> constrainedElement = new Function<Constraint, EList<Element>>() {
		public EList<Element> apply(Constraint s) {
			return s.getConstrainedElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Constraint#getSpecification()
	 * @generated
	 */
	public static final Function<Constraint, ValueSpecification> specification = new Function<Constraint, ValueSpecification>() {
		public ValueSpecification apply(Constraint s) {
			return s.getSpecification();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Constraint#getContext()
	 * @generated
	 */
	public static final Function<Constraint, Namespace> context = new Function<Constraint, Namespace>() {
		public Namespace apply(Constraint s) {
			return s.getContext();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Constraint#validateNotApplyToSelf()
	 * @generated
	 */
	public static Predicate<Constraint> validateNotApplyToSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Constraint>() {
			public boolean apply(Constraint s) {
				return s.validateNotApplyToSelf(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Constraint#validateValueSpecificationBoolean()
	 * @generated
	 */
	public static Predicate<Constraint> validateValueSpecificationBoolean(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Constraint>() {
			public boolean apply(Constraint s) {
				return s.validateValueSpecificationBoolean(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Constraint#validateBooleanValue()
	 * @generated
	 */
	public static Predicate<Constraint> validateBooleanValue(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Constraint>() {
			public boolean apply(Constraint s) {
				return s.validateBooleanValue(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Constraint#validateNoSideEffects()
	 * @generated
	 */
	public static Predicate<Constraint> validateNoSideEffects(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Constraint>() {
			public boolean apply(Constraint s) {
				return s.validateNoSideEffects(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Constraint#validateNotAppliedToSelf()
	 * @generated
	 */
	public static Predicate<Constraint> validateNotAppliedToSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Constraint>() {
			public boolean apply(Constraint s) {
				return s.validateNotAppliedToSelf(diagnostics, context);
			}
		};
	}

}
