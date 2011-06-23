package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TemplateableElement TemplateableElement} in a functional way.
 * <p>
 * A templateable element is an element that can optionally be defined as a template
 * and bound to other templates. 
 * @see org.eclipse.uml2.uml.TemplateableElement
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
	 * The optional bindings from this element to templates. 
	 * @see org.eclipse.uml2.uml.TemplateableElement#getTemplateBindings()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<TemplateBinding>> templateBinding = new Function<TemplateableElement, EList<TemplateBinding>>() {
		public EList<TemplateBinding> apply(TemplateableElement s) {
			return s.getTemplateBindings();
		}
	};

	/**
	 * The optional template signature specifying the formal template parameters. 
	 * @see org.eclipse.uml2.uml.TemplateableElement#getOwnedTemplateSignature()
	 * @generated
	 */
	public static final Function<TemplateableElement, TemplateSignature> ownedTemplateSignature = new Function<TemplateableElement, TemplateSignature>() {
		public TemplateSignature apply(TemplateableElement s) {
			return s.getOwnedTemplateSignature();
		}
	};
	
	/**
	 * The query parameterableElements() returns the set of elements that may be used as
	 * the parametered elements for a template parameter of this templateable element. By
	 * default, this set includes all the owned elements. Subclasses may override this operation
	 * if they choose to restrict the set of parameterable elements.
	result = allOwnedElements->select(oclIsKindOf(ParameterableElement))
	 * @see org.eclipse.uml2.uml.TemplateableElement#parameterableElements()
	 * @generated
	 */
	public static final Function<TemplateableElement, EList<ParameterableElement>> parameterableElements = new Function<TemplateableElement, EList<ParameterableElement>>() {
		public EList<ParameterableElement> apply(TemplateableElement s) {
			return s.parameterableElements();
		}
	};

	/**
	 * The query isTemplate() returns whether this templateable element is actually a template.
	result
	 * = ownedTemplateSignature->notEmpty() 
	 * @see org.eclipse.uml2.uml.TemplateableElement#isTemplate()
	 * @generated
	 */
	public static final Predicate<TemplateableElement> isTemplate = new Predicate<TemplateableElement>() {
		public boolean apply(TemplateableElement s) {
			return s.isTemplate();
		}
	};

}
