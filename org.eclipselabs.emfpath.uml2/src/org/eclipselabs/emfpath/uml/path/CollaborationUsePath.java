package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.Dependency;

/**
 * @generated
 */
public class CollaborationUsePath extends NamedElementPath {

	/**
	 * @generated
	 */
	private CollaborationUsePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.CollaborationUse#getType()
	 * @generated
	 */
	public static final Function<CollaborationUse, Collaboration> type = new Function<CollaborationUse, Collaboration>() {
		public Collaboration apply(CollaborationUse s) {
			return s.getType();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.CollaborationUse#getRoleBindings()
	 * @generated
	 */
	public static final Function<CollaborationUse, EList<Dependency>> roleBinding = new Function<CollaborationUse, EList<Dependency>>() {
		public EList<Dependency> apply(CollaborationUse s) {
			return s.getRoleBindings();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateClientElements()
	 * @generated
	 */
	public static Predicate<CollaborationUse> validateClientElements(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CollaborationUse>() {
			public boolean apply(CollaborationUse s) {
				return s.validateClientElements(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateEveryRole()
	 * @generated
	 */
	public static Predicate<CollaborationUse> validateEveryRole(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CollaborationUse>() {
			public boolean apply(CollaborationUse s) {
				return s.validateEveryRole(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateConnectors()
	 * @generated
	 */
	public static Predicate<CollaborationUse> validateConnectors(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<CollaborationUse>() {
			public boolean apply(CollaborationUse s) {
				return s.validateConnectors(diagnostics, context);
			}
		};
	}

}
