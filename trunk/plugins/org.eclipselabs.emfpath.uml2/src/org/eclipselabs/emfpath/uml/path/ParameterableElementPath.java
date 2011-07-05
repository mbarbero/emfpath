package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ParameterableElement ParameterableElement} in a functional way.
 * <p>
 * A parameterable element is an element that can be exposed as a formal template parameter
 * for a template, or specified as an actual parameter in a binding of a template. 
 * @see org.eclipse.uml2.uml.ParameterableElement
 * @generated
 */
public class ParameterableElementPath extends ElementPath {

	/**
	 * @generated
	 */
	 ParameterableElementPath() {
    super();
  }

	/**
	 * The formal template parameter that owns this element. 
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = new Function<ParameterableElement, TemplateParameter>() {
    public TemplateParameter apply(ParameterableElement s) {
      return s.getOwningTemplateParameter();
    }
  };

	/**
	 * The template parameter that exposes this element as a formal parameter. 
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = new Function<ParameterableElement, TemplateParameter>() {
    public TemplateParameter apply(ParameterableElement s) {
      return s.getTemplateParameter();
    }
  };
	
	/**
	 * The query isCompatibleWith() determines if this parameterable element is compatible
	 * with the specified parameterable element. By default parameterable element P is compatible
	 * with parameterable element Q if the kind of P is the same or a subtype as the kind
	 * of Q. Subclasses should override this operation to specify different compatibility
	 * constraints.
	result = p->oclIsKindOf(self.oclType) 
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(ParameterableElement)
	 * @generated
	 */
	public static ComposablePredicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
    return new ComposablePredicate<ParameterableElement>() {
      public boolean apply(ParameterableElement s) {
        return s.isCompatibleWith(p);
      }
    };
  }

}
