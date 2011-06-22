package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.TestIdentityAction;

/**
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
	 * @see org.eclipse.uml2.uml.TestIdentityAction#getFirst()
	 * @generated
	 */
	public static final Function<TestIdentityAction, InputPin> first = new Function<TestIdentityAction, InputPin>() {
		public InputPin apply(TestIdentityAction s) {
			return s.getFirst();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TestIdentityAction#getSecond()
	 * @generated
	 */
	public static final Function<TestIdentityAction, InputPin> second = new Function<TestIdentityAction, InputPin>() {
		public InputPin apply(TestIdentityAction s) {
			return s.getSecond();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TestIdentityAction#getResult()
	 * @generated
	 */
	public static final Function<TestIdentityAction, OutputPin> result = new Function<TestIdentityAction, OutputPin>() {
		public OutputPin apply(TestIdentityAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TestIdentityAction#validateNoType()
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
	 * @see org.eclipse.uml2.uml.TestIdentityAction#validateMultiplicity()
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
	 * @see org.eclipse.uml2.uml.TestIdentityAction#validateResultIsBoolean()
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
