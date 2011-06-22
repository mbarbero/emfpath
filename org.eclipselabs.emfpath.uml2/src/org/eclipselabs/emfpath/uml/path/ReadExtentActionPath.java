package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadExtentAction;

/**
 * @generated
 */
public class ReadExtentActionPath extends ActionPath {

	/**
	 * @generated
	 */
	private ReadExtentActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadExtentAction#getResult()
	 * @generated
	 */
	public static final Function<ReadExtentAction, OutputPin> result = new Function<ReadExtentAction, OutputPin>() {
		public OutputPin apply(ReadExtentAction s) {
			return s.getResult();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ReadExtentAction#getClassifier()
	 * @generated
	 */
	public static final Function<ReadExtentAction, Classifier> classifier = new Function<ReadExtentAction, Classifier>() {
		public Classifier apply(ReadExtentAction s) {
			return s.getClassifier();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ReadExtentAction#validateTypeIsClassifier()
	 * @generated
	 */
	public static Predicate<ReadExtentAction> validateTypeIsClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadExtentAction>() {
			public boolean apply(ReadExtentAction s) {
				return s.validateTypeIsClassifier(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ReadExtentAction#validateMultiplicityOfResult()
	 * @generated
	 */
	public static Predicate<ReadExtentAction> validateMultiplicityOfResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ReadExtentAction>() {
			public boolean apply(ReadExtentAction s) {
				return s.validateMultiplicityOfResult(diagnostics, context);
			}
		};
	}

}
