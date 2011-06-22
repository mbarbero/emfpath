package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Signal;

/**
 * @generated
 */
public class ReceptionPath extends BehavioralFeaturePath {

	/**
	 * @generated
	 */
	private ReceptionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Reception#getSignal()
	 * @generated
	 */
	public static final Function<Reception, Signal> signal = new Function<Reception, Signal>() {
		public Signal apply(Reception s) {
			return s.getSignal();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Reception#validateNotQuery()
	 * @generated
	 */
	public static Predicate<Reception> validateNotQuery(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Reception>() {
			public boolean apply(Reception s) {
				return s.validateNotQuery(diagnostics, context);
			}
		};
	}

}
