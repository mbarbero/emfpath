package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadSelfAction;

/**
 * @generated
 */
public class ReadSelfActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReadSelfActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadSelfAction#getResult()
	 * @generated
	 */
	public static final Function<ReadSelfAction, OutputPin> result = new Function<ReadSelfAction, OutputPin>() {
		public OutputPin apply(ReadSelfAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateContained()
	 * @generated
	 */
	public static Predicate<ReadSelfAction> validateContained(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadSelfAction>() {
			public boolean apply(ReadSelfAction s) {
				return s.validateContained(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateNotStatic()
	 * @generated
	 */
	public static Predicate<ReadSelfAction> validateNotStatic(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadSelfAction>() {
			public boolean apply(ReadSelfAction s) {
				return s.validateNotStatic(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateType()
	 * @generated
	 */
	public static Predicate<ReadSelfAction> validateType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadSelfAction>() {
			public boolean apply(ReadSelfAction s) {
				return s.validateType(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateMultiplicity()
	 * @generated
	 */
	public static Predicate<ReadSelfAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadSelfAction>() {
			public boolean apply(ReadSelfAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

}
