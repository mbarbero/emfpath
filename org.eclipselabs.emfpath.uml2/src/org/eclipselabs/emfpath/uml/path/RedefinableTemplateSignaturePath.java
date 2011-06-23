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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.RedefinableTemplateSignature RedefinableTemplateSignature} in a functional way.
 * <p>
 * A redefinable template signature supports the addition of formal template parameters
 * in a specialization of a template classifier. 
 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature
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
	 * The ordered set of all formal template parameters for this template signature. 
	 *
	 * @see TemplateSignaturePath#parameter()
	 * @see org.eclipse.uml2.uml.TemplateSignature#getParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> parameter = TemplateSignaturePath.parameter;

	/**
	 * The formal template parameters that are owned by this template signature. 
	 *
	 * @see TemplateSignaturePath#ownedParameter()
	 * @see org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> ownedParameter = TemplateSignaturePath.ownedParameter;

	/**
	 * The element that owns this template signature. 
	 *
	 * @see TemplateSignaturePath#template()
	 * @see org.eclipse.uml2.uml.TemplateSignature#getTemplate()
	 * @generated
	 */
	public static final Function<TemplateSignature, TemplateableElement> template = TemplateSignaturePath.template;

	/**
	 * The template signature that is extended by this template signature. 
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getExtendedSignatures()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, EList<RedefinableTemplateSignature>> extendedSignature = new Function<RedefinableTemplateSignature, EList<RedefinableTemplateSignature>>() {
		public EList<RedefinableTemplateSignature> apply(RedefinableTemplateSignature s) {
			return s.getExtendedSignatures();
		}
	};

	/**
	 * The formal template parameters of the extendedSignature. 
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getInheritedParameters()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, EList<TemplateParameter>> inheritedParameter = new Function<RedefinableTemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(RedefinableTemplateSignature s) {
			return s.getInheritedParameters();
		}
	};

	/**
	 * The classifier that owns this template signature. 
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getClassifier()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, Classifier> classifier = new Function<RedefinableTemplateSignature, Classifier>() {
		public Classifier apply(RedefinableTemplateSignature s) {
			return s.getClassifier();
		}
	};
	
	/**
	 * Parameters must own the elements they parameter or those elements must be owned by
	 * the element being templated.
	templatedElement.ownedElement->includesAll(parameter.parameteredElement
	 * - parameter.ownedParameteredElement) 
	 *
	 * @see TemplateSignaturePath#validateOwnElements()
	 * @see org.eclipse.uml2.uml.TemplateSignature#validateOwnElements(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TemplateSignature> validateOwnElements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return TemplateSignaturePath.validateOwnElements(diagnostics, context);
	}

	/**
	 * The inherited parameters are the parameters of the extended template signature.
	if
	 * extendedSignature->isEmpty() then Set{} else extendedSignature.parameter endif 
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#validateInheritedParameters(DiagnosticChain, Map)
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
	 * 
	 * @see org.eclipse.uml2.uml.RedefinableTemplateSignature#getInheritedParameters()
	 * @generated
	 */
	public static final Function<RedefinableTemplateSignature, EList<TemplateParameter>> getInheritedParameters = new Function<RedefinableTemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(RedefinableTemplateSignature s) {
			return s.getInheritedParameters();
		}
	};

}
