package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.Signal;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Reception Reception} in a functional way.
 * <p>
 * A reception is a declaration stating that a classifier is prepared to react to the
 * receipt of a signal. A reception designates a signal and specifies the expected behavioral
 * response. The details of handling a signal are specified by the behavior associated
 * with the reception or the classifier itself. 
 * @see org.eclipse.uml2.uml.Reception
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
	 * The signal that this reception handles. 
	 * @see org.eclipse.uml2.uml.Reception#getSignal()
	 * @generated
	 */
	public static final Function<Reception, Signal> signal = new Function<Reception, Signal>() {
		public Signal apply(Reception s) {
			return s.getSignal();
		}
	};
	
	/**
	 * A Reception can not be a query.
	not self.isQuery 
	 * @see org.eclipse.uml2.uml.Reception#validateNotQuery(DiagnosticChain, Map)
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
