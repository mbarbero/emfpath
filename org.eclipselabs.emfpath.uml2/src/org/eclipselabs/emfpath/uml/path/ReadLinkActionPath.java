package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadLinkAction;

/**
 * @generated
 */
public class ReadLinkActionPath extends LinkActionPath {

	/**
	 * @generated
	 */
	private ReadLinkActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkAction#getResult()
	 * @generated
	 */
	public static final Function<ReadLinkAction, OutputPin> result = new Function<ReadLinkAction, OutputPin>() {
		public OutputPin apply(ReadLinkAction s) {
			return s.getResult();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateOneOpenEnd()
	 * @generated
	 */
	public static Predicate<ReadLinkAction> validateOneOpenEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkAction>() {
			public boolean apply(ReadLinkAction s) {
				return s.validateOneOpenEnd(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateTypeAndOrdering()
	 * @generated
	 */
	public static Predicate<ReadLinkAction> validateTypeAndOrdering(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkAction>() {
			public boolean apply(ReadLinkAction s) {
				return s.validateTypeAndOrdering(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateCompatibleMultiplicity()
	 * @generated
	 */
	public static Predicate<ReadLinkAction> validateCompatibleMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkAction>() {
			public boolean apply(ReadLinkAction s) {
				return s.validateCompatibleMultiplicity(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateNavigableOpenEnd()
	 * @generated
	 */
	public static Predicate<ReadLinkAction> validateNavigableOpenEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkAction>() {
			public boolean apply(ReadLinkAction s) {
				return s.validateNavigableOpenEnd(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadLinkAction#validateVisibility()
	 * @generated
	 */
	public static Predicate<ReadLinkAction> validateVisibility(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadLinkAction>() {
			public boolean apply(ReadLinkAction s) {
				return s.validateVisibility(diagnostics, context);
			}
		};
	}

}
