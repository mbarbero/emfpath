package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateSignature;

/**
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
	 * @see org.eclipse.uml2.uml.TemplateParameter#getSignature()
	 * @generated
	 */
	public static final Function<TemplateParameter, TemplateSignature> signature = new Function<TemplateParameter, TemplateSignature>() {
		public TemplateSignature apply(TemplateParameter s) {
			return s.getSignature();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameter#getParameteredElement()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> parameteredElement = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getParameteredElement();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameter#getOwnedParameteredElement()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> ownedParameteredElement = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getOwnedParameteredElement();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameter#getDefault()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> default_ = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getDefault();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameter#getOwnedDefault()
	 * @generated
	 */
	public static final Function<TemplateParameter, ParameterableElement> ownedDefault = new Function<TemplateParameter, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameter s) {
			return s.getOwnedDefault();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TemplateParameter#validateMustBeCompatible()
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
