package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;

/**
 * @generated
 */
public class ParameterSetPath extends NamedElementPath {

	/**
	 * @generated
	 */
	private ParameterSetPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ParameterSet#getParameters()
	 * @generated
	 */
	public static final Function<ParameterSet, EList<Parameter>> parameter = new Function<ParameterSet, EList<Parameter>>() {
		public EList<Parameter> apply(ParameterSet s) {
			return s.getParameters();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ParameterSet#getConditions()
	 * @generated
	 */
	public static final Function<ParameterSet, EList<Constraint>> condition = new Function<ParameterSet, EList<Constraint>>() {
		public EList<Constraint> apply(ParameterSet s) {
			return s.getConditions();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ParameterSet#validateSameParameterizedEntity()
	 * @generated
	 */
	public static Predicate<ParameterSet> validateSameParameterizedEntity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ParameterSet>() {
			public boolean apply(ParameterSet s) {
				return s.validateSameParameterizedEntity(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ParameterSet#validateInput()
	 * @generated
	 */
	public static Predicate<ParameterSet> validateInput(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ParameterSet>() {
			public boolean apply(ParameterSet s) {
				return s.validateInput(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ParameterSet#validateTwoParameterSets()
	 * @generated
	 */
	public static Predicate<ParameterSet> validateTwoParameterSets(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ParameterSet>() {
			public boolean apply(ParameterSet s) {
				return s.validateTwoParameterSets(diagnostics, context);
			}
		};
	}

}
