package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.RedefinableTemplateSignature;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * @generated
 */
public class RedefinableTemplateSignaturePath extends RedefinableElementPath {

	/**
	 * @generated
	 */
	private RedefinableTemplateSignaturePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.TemplateSignature#getParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> parameter = TemplateSignaturePath.parameter;

	/**
	 * @see org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> ownedParameter = TemplateSignaturePath.ownedParameter;

	/**
	 * @see org.eclipse.uml2.uml.TemplateSignature#getTemplate()
	 * @generated
	 */
	public static final Function<TemplateSignature, TemplateableElement> template = TemplateSignaturePath.template;

	/**
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getExtendedSignatures()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, EList<RedefinableTemplateSignature>> extendedSignature = new Function<RedefinableTemplateSignature, EList<RedefinableTemplateSignature>>() {
		public EList<RedefinableTemplateSignature> apply(RedefinableTemplateSignature s) {
			return s.getExtendedSignatures();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getInheritedParameters()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, EList<TemplateParameter>> inheritedParameter = new Function<RedefinableTemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(RedefinableTemplateSignature s) {
			return s.getInheritedParameters();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getClassifier()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, Classifier> classifier = new Function<RedefinableTemplateSignature, Classifier>() {
		public Classifier apply(RedefinableTemplateSignature s) {
			return s.getClassifier();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TemplateSignature#validateOwnElements()
	 * @generated
	 */
	public static Predicate<TemplateSignature> validateOwnElements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return TemplateSignaturePath.validateOwnElements(diagnostics, context);
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#validateInheritedParameters()
	 * @generated
	 */
	public static Predicate<RedefinableTemplateSignature> validateInheritedParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<RedefinableTemplateSignature>() {
			public boolean apply(RedefinableTemplateSignature s) {
				return s.validateInheritedParameters(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getInheritedParameters()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, EList<TemplateParameter>> getInheritedParameters = new Function<RedefinableTemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(RedefinableTemplateSignature s) {
			return s.getInheritedParameters();
		}
	};

}
