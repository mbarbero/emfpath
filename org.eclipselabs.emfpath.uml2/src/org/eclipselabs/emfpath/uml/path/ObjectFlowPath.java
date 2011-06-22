package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectFlow;

/**
 * @generated
 */
public class ObjectFlowPath extends ActivityEdgePath {

	/**
	 * @generated
	 */
	private ObjectFlowPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#isMulticast()
	 * @generated
	 */
	public static final Predicate<ObjectFlow> isMulticast = new Predicate<ObjectFlow>() {
		public boolean apply(ObjectFlow s) {
			return s.isMulticast();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#isMultireceive()
	 * @generated
	 */
	public static final Predicate<ObjectFlow> isMultireceive = new Predicate<ObjectFlow>() {
		public boolean apply(ObjectFlow s) {
			return s.isMultireceive();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#getTransformation()
	 * @generated
	 */
	public static final Function<ObjectFlow, Behavior> transformation = new Function<ObjectFlow, Behavior>() {
		public Behavior apply(ObjectFlow s) {
			return s.getTransformation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#getSelection()
	 * @generated
	 */
	public static final Function<ObjectFlow, Behavior> selection = new Function<ObjectFlow, Behavior>() {
		public Behavior apply(ObjectFlow s) {
			return s.getSelection();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateNoActions()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateNoActions(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateNoActions(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateCompatibleTypes()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateCompatibleTypes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateCompatibleTypes(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateSameUpperBounds()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateSameUpperBounds(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateSameUpperBounds(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateTarget()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateTarget(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateTarget(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateTransformationBehaviour()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateTransformationBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateTransformationBehaviour(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateSelectionBehaviour()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateSelectionBehaviour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateSelectionBehaviour(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateInputAndOutputParameter()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateInputAndOutputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateInputAndOutputParameter(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectFlow#validateIsMulticastOrIsMultireceive()
	 * @generated
	 */
	public static Predicate<ObjectFlow> validateIsMulticastOrIsMultireceive(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectFlow>() {
			public boolean apply(ObjectFlow s) {
				return s.validateIsMulticastOrIsMultireceive(diagnostics, context);
			}
		};
	}

}
