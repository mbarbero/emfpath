package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.NamedElement;

/**
 * @generated
 */
public class DurationObservationPath extends ObservationPath {

	/**
	 * @generated
	 */
	private DurationObservationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.DurationObservation#getEvents()
	 * @generated
	 */
	public static final Function<DurationObservation, EList<NamedElement>> event = new Function<DurationObservation, EList<NamedElement>>() {
		public EList<NamedElement> apply(DurationObservation s) {
			return s.getEvents();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.DurationObservation#getFirstEvents()
	 * @generated
	 */
	public static final Function<DurationObservation, EList<java.lang.Boolean>> firstEvent = new Function<DurationObservation, EList<java.lang.Boolean>>() {
		public EList<java.lang.Boolean> apply(DurationObservation s) {
			return s.getFirstEvents();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.DurationObservation#validateFirstEventMultiplicity()
	 * @generated
	 */
	public static Predicate<DurationObservation> validateFirstEventMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<DurationObservation>() {
			public boolean apply(DurationObservation s) {
				return s.validateFirstEventMultiplicity(diagnostics, context);
			}
		};
	}

}
