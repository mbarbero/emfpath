package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TemplateParameter TemplateParameter} in a functional way.
 * <p>
 * A template parameter exposes a parameterable element as a formal template parameter
 * of a template. 
 * @see org.eclipse.uml2.uml.TemplateParameter
 * @generated
 */
public class TemplateParameterPath extends ElementPath {

	/**
	 * @generated
	 */
	 TemplateParameterPath() {
		super();
	}

	/**
	 * The template signature that owns this template parameter. 
	 * @see org.eclipse.uml2.uml.TemplateParameter#getSignature()
	 * @generated
	 */
	public static final Function<TemplateParameter, TemplateSignature> signature = new Function<TemplateParameter, TemplateSignature>() {
		public TemplateSignature apply(TemplateParameter s) {
			return s.getSignature();
		}
	};

	/**
	 * The element exposed by this template parameter. 
	 * @see org.eclipse.uml2.uml.TemplateParameter#getParameteredElement()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> parameteredElement = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getParameteredElement();
		}
	};

	/**
	 * The element that is owned by this template parameter. 
	 * @see org.eclipse.uml2.uml.TemplateParameter#getOwnedParameteredElement()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> ownedParameteredElement = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getOwnedParameteredElement();
		}
	};

	/**
	 * The element that is the default for this formal template parameter. 
	 * @see org.eclipse.uml2.uml.TemplateParameter#getDefault()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> default_ = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getDefault();
		}
	};

	/**
	 * The element that is owned by this template parameter for the purpose of providing
	 * a default. 
	 * @see org.eclipse.uml2.uml.TemplateParameter#getOwnedDefault()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> ownedDefault = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getOwnedDefault();
		}
	};
	
	/**
	 * The default must be compatible with the formal template parameter.
	default->notEmpty()
	 * implies default->isCompatibleWith(parameteredElement) 
	 * @see org.eclipse.uml2.uml.TemplateParameter#validateMustBeCompatible(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TemplateParameter> validateMustBeCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TemplateParameter>() {
			public boolean apply(TemplateParameter s) {
				return s.validateMustBeCompatible(diagnostics, context);
			}
		};
	}

}
