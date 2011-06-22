package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DurationConstraint;

/**
 * @generated
 */
public class DurationConstraintPath extends IntervalConstraintPath {

	/**
	 * @generated
	 */
	private DurationConstraintPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.DurationConstraint#getFirstEvents()
	 * @generated
	 */
	public static final Function<DurationConstraint, EList<java.lang.Boolean>> firstEvent = new Function<DurationConstraint, EList<java.lang.Boolean>>() {
		public EList<java.lang.Boolean> apply(DurationConstraint s) {
			return s.getFirstEvents();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.DurationConstraint#validateFirstEventMultiplicity()
	 * @generated
	 */
	public static Predicate<DurationConstraint> validateFirstEventMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DurationConstraint>() {
			public boolean apply(DurationConstraint s) {
				return s.validateFirstEventMultiplicity(diagnostics, context);
			}
		};
	}

}
