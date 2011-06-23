package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateParameterSubstitution;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.TemplateBinding TemplateBinding} in a functional way.
 * <p>
 * A template binding represents a relationship between a templateable element and a
 * template. A template binding specifies the substitutions of actual parameters for
 * the formal parameters of the template. 
 * @see org.eclipse.uml2.uml.TemplateBinding
 * @generated
 */
public class TemplateBindingPath extends DirectedRelationshipPath {

	/**
	 * @generated
	 */
	private TemplateBindingPath() {
		super();
	}

	/**
	 * The template signature for the template that is the target of the binding. 
	 * @see org.eclipse.uml2.uml.TemplateBinding#getSignature()
	 * @generated
	 */
	public static final Function<TemplateBinding, TemplateSignature> signature = new Function<TemplateBinding, TemplateSignature>() {
		public TemplateSignature apply(TemplateBinding s) {
			return s.getSignature();
		}
	};

	/**
	 * The parameter substitutions owned by this template binding. 
	 * @see org.eclipse.uml2.uml.TemplateBinding#getParameterSubstitutions()
	 * @generated
	 */
	public static final Function<TemplateBinding, EList<TemplateParameterSubstitution>> parameterSubstitution = new Function<TemplateBinding, EList<TemplateParameterSubstitution>>() {
		public EList<TemplateParameterSubstitution> apply(TemplateBinding s) {
			return s.getParameterSubstitutions();
		}
	};

	/**
	 * The element that is bound by this binding. 
	 * @see org.eclipse.uml2.uml.TemplateBinding#getBoundElement()
	 * @generated
	 */
	public static final Function<TemplateBinding, TemplateableElement> boundElement = new Function<TemplateBinding, TemplateableElement>() {
		public TemplateableElement apply(TemplateBinding s) {
			return s.getBoundElement();
		}
	};
	
	/**
	 * Each parameter substitution must refer to a formal template parameter of the target
	 * template signature.
	parameterSubstitution->forAll(b | template.parameter->includes(b.formal))
	 * @see org.eclipse.uml2.uml.TemplateBinding#validateParameterSubstitutionFormal(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TemplateBinding> validateParameterSubstitutionFormal(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TemplateBinding>() {
			public boolean apply(TemplateBinding s) {
				return s.validateParameterSubstitutionFormal(diagnostics, context);
			}
		};
	}

	/**
	 * A binding contains at most one parameter substitution for each formal template parameter
	 * of the target template signature.
	template.parameter->forAll(p | parameterSubstitution->select(b
	 * | b.formal = p)->size() <= 1) 
	 * @see org.eclipse.uml2.uml.TemplateBinding#validateOneParameterSubstitution(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<TemplateBinding> validateOneParameterSubstitution(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<TemplateBinding>() {
			public boolean apply(TemplateBinding s) {
				return s.validateOneParameterSubstitution(diagnostics, context);
			}
		};
	}

}
