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
	 * @see org.eclipse.uml2.uml.TemplateSignature#getParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> parameter = new Function<TemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(TemplateSignature s) {
			return s.getParameters();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateSignature#getOwnedParameters()
	 * @generated
	 */
	public static final Function<TemplateSignature, EList<TemplateParameter>> ownedParameter = new Function<TemplateSignature, EList<TemplateParameter>>() {
		public EList<TemplateParameter> apply(TemplateSignature s) {
			return s.getOwnedParameters();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateSignature#getTemplate()
	 * @generated
	 */
	public static final Function<TemplateSignature, TemplateableElement> template = new Function<TemplateSignature, TemplateableElement>() {
		public TemplateableElement apply(TemplateSignature s) {
			return s.getTemplate();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TemplateSignature#validateOwnElements()
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
