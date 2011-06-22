package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.PartDecomposition;

/**
 * @generated
 */
public class PartDecompositionPath extends InteractionUsePath {

	/**
	 * @generated
	 */
	private PartDecompositionPath() {
		super();
	}

	
	
	/**
	 * @see org.eclipse.uml2.uml.PartDecomposition#validatePartsOfInternalStructures()
	 * @generated
	 */
	public static Predicate<PartDecomposition> validatePartsOfInternalStructures(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<PartDecomposition>() {
			public boolean apply(PartDecomposition s) {
				return s.validatePartsOfInternalStructures(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.PartDecomposition#validateAssume()
	 * @generated
	 */
	public static Predicate<PartDecomposition> validateAssume(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<PartDecomposition>() {
			public boolean apply(PartDecomposition s) {
				return s.validateAssume(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.PartDecomposition#validateCommutativityOfDecomposition()
	 * @generated
	 */
	public static Predicate<PartDecomposition> validateCommutativityOfDecomposition(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<PartDecomposition>() {
			public boolean apply(PartDecomposition s) {
				return s.validateCommutativityOfDecomposition(diagnostics, context);
			}
		};
	}

}
