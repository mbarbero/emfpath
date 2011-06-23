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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TemplateParameterSubstitution TemplateParameterSubstitution} in a functional way.
 * <p>
 * A template parameter substitution relates the actual parameter to a formal template
 * parameter as part of a template binding. 
 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution
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
	 * The formal template parameter that is associated with this substitution. 
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getFormal()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, TemplateParameter> formal = new Function<TemplateParameterSubstitution, TemplateParameter>() {
		public TemplateParameter apply(TemplateParameterSubstitution s) {
			return s.getFormal();
		}
	};

	/**
	 * The element that is the actual parameter for this substitution. 
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getActual()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, ParameterableElement> actual = new Function<TemplateParameterSubstitution, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameterSubstitution s) {
			return s.getActual();
		}
	};

	/**
	 * The actual parameter that is owned by this substitution. 
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getOwnedActual()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, ParameterableElement> ownedActual = new Function<TemplateParameterSubstitution, ParameterableElement>() {
		public ParameterableElement apply(TemplateParameterSubstitution s) {
			return s.getOwnedActual();
		}
	};

	/**
	 * The optional bindings from this element to templates. 
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#getTemplateBinding()
	 * @generated
	 */
	public static final Function<TemplateParameterSubstitution, TemplateBinding> templateBinding = new Function<TemplateParameterSubstitution, TemplateBinding>() {
		public TemplateBinding apply(TemplateParameterSubstitution s) {
			return s.getTemplateBinding();
		}
	};
	
	/**
	 * The actual parameter must be compatible with the formal template parameter, e.g. the
	 * actual parameter for a class template parameter must be a class.
	actual->forAll(a
	 * | a.isCompatibleWith(formal.parameteredElement)) 
	 * @see org.eclipse.uml2.uml.TemplateParameterSubstitution#validateMustBeCompatible(DiagnosticChain, Map)
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
