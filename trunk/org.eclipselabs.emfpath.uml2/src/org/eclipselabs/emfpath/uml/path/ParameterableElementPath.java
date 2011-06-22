package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;

/**
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
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = new Function<ParameterableElement, TemplateParameter>() {
		public TemplateParameter apply(ParameterableElement s) {
			return s.getOwningTemplateParameter();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = new Function<ParameterableElement, TemplateParameter>() {
		public TemplateParameter apply(ParameterableElement s) {
			return s.getTemplateParameter();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith()
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return new Predicate<ParameterableElement>() {
			public boolean apply(ParameterableElement s) {
				return s.isCompatibleWith(p);
			}
		};
	}

}
