package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ClassifierTemplateParameter;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ClassifierTemplateParameter ClassifierTemplateParameter} in a functional way.
 * <p>
 * A classifier template parameter exposes a classifier as a formal template parameter.
 * @see org.eclipse.uml2.uml.ClassifierTemplateParameter
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
	 * Constrains the required relationship between an actual parameter and the parameteredElement
	 * for this formal parameter. 
	 * @see org.eclipse.uml2.uml.ClassifierTemplateParameter#isAllowSubstitutable()
	 * @generated
	 */
	public static final Predicate<ClassifierTemplateParameter> isAllowSubstitutable = new Predicate<ClassifierTemplateParameter>() {
		public boolean apply(ClassifierTemplateParameter s) {
			return s.isAllowSubstitutable();
		}
	};

	/**
	 * The classifiers that constrain the argument that can be used for the parameter. If
	 * the allowSubstitutable attribute is true, then any classifier that is compatible with
	 * this constraining classifier can be substituted; otherwise, it must be either this
	 * classifier or one of its subclasses. If this property is empty, there are no constraints
	 * on the classifier that can be used as an argument. 
	 * @see org.eclipse.uml2.uml.ClassifierTemplateParameter#getConstrainingClassifiers()
	 * @generated
	 */
	public static final Function<ClassifierTemplateParameter, EList<Classifier>> constrainingClassifier = new Function<ClassifierTemplateParameter, EList<Classifier>>() {
		public EList<Classifier> apply(ClassifierTemplateParameter s) {
			return s.getConstrainingClassifiers();
		}
	};
	
	/**
	 * If "allowSubstitutable" is true, then there must be a constrainingClassifier.
	allowSubstitutable
	 * implies constrainingClassifier->notEmpty() 
	 * @see org.eclipse.uml2.uml.ClassifierTemplateParameter#validateHasConstrainingClassifier(DiagnosticChain, Map)
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
