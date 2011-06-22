package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * @generated
 */
public class TemplateableElementPath extends ElementPath {

	/**
	 * @generated
	 */
	 TemplateableElementPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = new Function<TemplateableElement, EList<TemplateBinding>>() {
		public EList<TemplateBinding> apply(TemplateableElement s) {
			return s.getTemplateBindings();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = new Function<TemplateableElement, TemplateSignature>() {
		public TemplateSignature apply(TemplateableElement s) {
			return s.getOwnedTemplateSignature();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = new Function<TemplateableElement, EList<ParameterableElement>>() {
		public EList<ParameterableElement> apply(TemplateableElement s) {
			return s.parameterableElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = new Predicate<TemplateableElement>() {
		public boolean apply(TemplateableElement s) {
			return s.isTemplate();
		}
	};

}
