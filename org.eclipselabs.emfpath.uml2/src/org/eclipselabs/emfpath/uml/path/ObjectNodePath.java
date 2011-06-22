package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.ObjectNodeOrderingKind;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * @generated
 */
public class ObjectNodePath extends ActivityNodePath {

	/**
	 * @generated
	 */
	 ObjectNodePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.TypedElement#getType()
	 * @generated
	 */
	public static final Function<TypedElement, Type> type = TypedElementPath.type;

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#getOrdering()
	 * @generated
	 */
	public static final Function<ObjectNode, ObjectNodeOrderingKind> ordering = new Function<ObjectNode, ObjectNodeOrderingKind>() {
		public ObjectNodeOrderingKind apply(ObjectNode s) {
			return s.getOrdering();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#isControlType()
	 * @generated
	 */
	public static final Predicate<ObjectNode> isControlType = new Predicate<ObjectNode>() {
		public boolean apply(ObjectNode s) {
			return s.isControlType();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#getUpperBound()
	 * @generated
	 */
	public static final Function<ObjectNode, ValueSpecification> upperBound = new Function<ObjectNode, ValueSpecification>() {
		public ValueSpecification apply(ObjectNode s) {
			return s.getUpperBound();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#getInStates()
	 * @generated
	 */
	public static final Function<ObjectNode, EList<State>> inState = new Function<ObjectNode, EList<State>>() {
		public EList<State> apply(ObjectNode s) {
			return s.getInStates();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#getSelection()
	 * @generated
	 */
	public static final Function<ObjectNode, Behavior> selection = new Function<ObjectNode, Behavior>() {
		public Behavior apply(ObjectNode s) {
			return s.getSelection();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#validateObjectFlowEdges()
	 * @generated
	 */
	public static Predicate<ObjectNode> validateObjectFlowEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectNode>() {
			public boolean apply(ObjectNode s) {
				return s.validateObjectFlowEdges(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#validateNotUnique()
	 * @generated
	 */
	public static Predicate<ObjectNode> validateNotUnique(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectNode>() {
			public boolean apply(ObjectNode s) {
				return s.validateNotUnique(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#validateSelectionBehavior()
	 * @generated
	 */
	public static Predicate<ObjectNode> validateSelectionBehavior(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectNode>() {
			public boolean apply(ObjectNode s) {
				return s.validateSelectionBehavior(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ObjectNode#validateInputOutputParameter()
	 * @generated
	 */
	public static Predicate<ObjectNode> validateInputOutputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ObjectNode>() {
			public boolean apply(ObjectNode s) {
				return s.validateInputOutputParameter(diagnostics, context);
			}
		};
	}

}
