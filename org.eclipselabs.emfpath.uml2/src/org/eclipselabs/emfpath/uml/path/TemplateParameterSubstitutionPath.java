package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameter;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;

/**
 * @generated
 */
public class TemplateParameterSubstitutionPath extends ElementPath {

	/**
	 * @generated
	 */
	private TemplateParameterSubstitutionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getFormal()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, TemplateParameter> formal = new Function<TemplateParameterSubstitution, TemplateParameter>() {
		public TemplateParameter apply(TemplateParameterSubstitution s) {
			return s.getFormal();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getActual()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, ParameterableElement> actual = new Function<TemplateParameterSubstitution, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameterSubstitution s) {
			return s.getActual();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getOwnedActual()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, ParameterableElement> ownedActual = new Function<TemplateParameterSubstitution, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameterSubstitution s) {
			return s.getOwnedActual();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getTemplateBinding()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, TemplateBinding> templateBinding = new Function<TemplateParameterSubstitution, TemplateBinding>() {
		public TemplateBinding apply(TemplateParameterSubstitution s) {
			return s.getTemplateBinding();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#validateMustBeCompatible()
	 * @generated
	 */
	public static Predicate<TemplateParameterSubstitution> validateMustBeCompatible(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TemplateParameterSubstitution>() {
			public boolean apply(TemplateParameterSubstitution s) {
				return s.validateMustBeCompatible(diagnostics, context);
			}
		};
	}

}
