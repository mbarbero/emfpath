package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.TestIdentityAction;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TestIdentityAction TestIdentityAction} in a functional way.
 * <p>
 * A test identity action is an action that tests if two values are identical objects.
 * @see org.eclipse.uml2.uml.TestIdentityAction
 * @generated
 */
public class TestIdentityActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private TestIdentityActionPath() {
		super();
	}

	/**
	 * Gives the pin on which an object is placed. 
	 * @see org.eclipse.uml2.uml.TestIdentityAction#getFirst()
	 * @generated
	 */
	public static final Function<TestIdentityAction, InputPin> first = new Function<TestIdentityAction, InputPin>() {
		public InputPin apply(TestIdentityAction s) {
			return s.getFirst();
		}
	};

	/**
	 * Gives the pin on which an object is placed. 
	 * @see org.eclipse.uml2.uml.TestIdentityAction#getSecond()
	 * @generated
	 */
	public static final Function<TestIdentityAction, InputPin> second = new Function<TestIdentityAction, InputPin>() {
		public InputPin apply(TestIdentityAction s) {
			return s.getSecond();
		}
	};

	/**
	 * Tells whether the two input objects are identical. 
	 * @see org.eclipse.uml2.uml.TestIdentityAction#getResult()
	 * @generated
	 */
	public static final Function<TestIdentityAction, OutputPin> result = new Function<TestIdentityAction, OutputPin>() {
		public OutputPin apply(TestIdentityAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * The input pins have no type.
	self.first.type->size() = 0
	and self.second.type->size()
	 * = 0
	 
	 * @see org.eclipse.uml2.uml.TestIdentityAction#validateNoType(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TestIdentityAction> validateNoType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TestIdentityAction>() {
			public boolean apply(TestIdentityAction s) {
				return s.validateNoType(diagnostics, context);
			}
		};
	}

	/**
	 * The multiplicity of the input pins is 1..1.
	self.first.multiplicity.is(1,1)
	and self.second.multiplicity.is(1,1)
	
	 * @see org.eclipse.uml2.uml.TestIdentityAction#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TestIdentityAction> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TestIdentityAction>() {
			public boolean apply(TestIdentityAction s) {
				return s.validateMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * The type of the result is Boolean.
	self.result.type.oclIsTypeOf(Boolean) 
	 * @see org.eclipse.uml2.uml.TestIdentityAction#validateResultIsBoolean(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TestIdentityAction> validateResultIsBoolean(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TestIdentityAction>() {
			public boolean apply(TestIdentityAction s) {
				return s.validateResultIsBoolean(diagnostics, context);
			}
		};
	}

}
