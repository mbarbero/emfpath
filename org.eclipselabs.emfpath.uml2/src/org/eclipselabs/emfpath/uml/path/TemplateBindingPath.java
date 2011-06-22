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
	 * @see org.eclipse.uml2.uml.TemplateBinding#getSignature()
	 * @generated
	 */
	public static final Function<TemplateBinding, TemplateSignature> signature = new Function<TemplateBinding, TemplateSignature>() {
		public TemplateSignature apply(TemplateBinding s) {
			return s.getSignature();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateBinding#getParameterSubstitutions()
	 * @generated
	 */
	public static final Function<TemplateBinding, EList<TemplateParameterSubstitution>> parameterSubstitution = new Function<TemplateBinding, EList<TemplateParameterSubstitution>>() {
		public EList<TemplateParameterSubstitution> apply(TemplateBinding s) {
			return s.getParameterSubstitutions();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.TemplateBinding#getBoundElement()
	 * @generated
	 */
	public static final Function<TemplateBinding, TemplateableElement> boundElement = new Function<TemplateBinding, TemplateableElement>() {
		public TemplateableElement apply(TemplateBinding s) {
			return s.getBoundElement();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.TemplateBinding#validateParameterSubstitutionFormal()
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
	 * @see org.eclipse.uml2.uml.TemplateBinding#validateOneParameterSubstitution()
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
