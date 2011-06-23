package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadSelfAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadSelfAction ReadSelfAction} in a functional way.
 * <p>
 * A read self action is an action that retrieves the host object of an action. 
 * @see org.eclipse.uml2.uml.ReadSelfAction
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
	 * Gives the output pin on which the hosting object is placed. 
	 * @see org.eclipse.uml2.uml.ReadSelfAction#getResult()
	 * @generated
	 */
	public static final Function<ReadSelfAction, OutputPin> result = new Function<ReadSelfAction, OutputPin>() {
		public OutputPin apply(ReadSelfAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * The action must be contained in an behavior that has a host classifier.
	self.context->size()
	 * = 1 
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateContained(DiagnosticChain, Map)
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
	 * If the action is contained in an behavior that is acting as the body of a method,
	 * then the operation of the method must not be static.
	true 
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateNotStatic(DiagnosticChain, Map)
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
	 * The type of the result output pin is the host classifier.
	self.result.type = self.context
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateType(DiagnosticChain, Map)
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
	 * The multiplicity of the result output pin is 1..1.
	self.result.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.ReadSelfAction#validateMultiplicity(DiagnosticChain, Map)
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
