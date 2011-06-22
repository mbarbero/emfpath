package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;

/**
 * @generated
 */
public class ClassifierTemplateParameterPath extends TemplateParameterPath {

	/**
	 * @generated
	 */
	private ClassifierTemplateParameterPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ClassifierTemplateParameter#isAllowSubstitutable()
	 * @generated
	 */
	public static final Predicate<ClassifierTemplateParameter> isAllowSubstitutable = new Predicate<ClassifierTemplateParameter>() {
		public boolean apply(ClassifierTemplateParameter s) {
			return s.isAllowSubstitutable();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ClassifierTemplateParameter#getConstrainingClassifiers()
	 * @generated
	 */
	public static final Function<ClassifierTemplateParameter, EList<Classifier>> constrainingClassifier = new Function<ClassifierTemplateParameter, EList<Classifier>>() {
		public EList<Classifier> apply(ClassifierTemplateParameter s) {
			return s.getConstrainingClassifiers();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ClassifierTemplateParameter#validateHasConstrainingClassifier()
	 * @generated
	 */
	public static Predicate<ClassifierTemplateParameter> validateHasConstrainingClassifier(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ClassifierTemplateParameter>() {
			public boolean apply(ClassifierTemplateParameter s) {
				return s.validateHasConstrainingClassifier(diagnostics, context);
			}
		};
	}

}
