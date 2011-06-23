package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TemplateSignature TemplateSignature} in a functional way.
 * <p>
 * A template signature bundles the set of formal template parameters for a templated
 * element. 
 * @see org.eclipse.uml2.uml.TemplateSignature
 * @generated
 */
public class TemplateSignaturePath extends ElementPath {

	/**
	 * @generated
	 */
	 TemplateSignaturePath() {
		super();
	}

	/**
	 * The ordered set of all formal template parameters for this template signature. 
	 * @see org.eclipse.uml2.uml.TemplateSignature#getParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> parameter = new Function<TemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(TemplateSignature s) {
			return s.getParameters();
		}
	};

	/**
	 * The formal template parameters that are owned by this template signature. 
	 * @see org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> ownedParameter = new Function<TemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(TemplateSignature s) {
			return s.getOwnedParameters();
		}
	};

	/**
	 * The element that owns this template signature. 
	 * @see org.eclipse.uml2.uml.TemplateSignature#getTemplate()
	 * @generated
	 */
	public static final Function<TemplateSignature, TemplateableElement> template = new Function<TemplateSignature, TemplateableElement>() {
		public TemplateableElement apply(TemplateSignature s) {
			return s.getTemplate();
		}
	};
	
	/**
	 * Parameters must own the elements they parameter or those elements must be owned by
	 * the element being templated.
	templatedElement.ownedElement->includesAll(parameter.parameteredElement
	 * - parameter.ownedParameteredElement) 
	 * @see org.eclipse.uml2.uml.TemplateSignature#validateOwnElements(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TemplateSignature> validateOwnElements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TemplateSignature>() {
			public boolean apply(TemplateSignature s) {
				return s.validateOwnElements(diagnostics, context);
			}
		};
	}

}
