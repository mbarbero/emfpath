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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.CollaborationUse CollaborationUse} in a functional way.
 * <p>
 * A collaboration use represents one particular use of a collaboration to explain the
 * relationships between the properties of a classifier. A collaboration use shows how
 * the pattern described by a collaboration is applied in a given context, by binding
 * specific entities from that context to the roles of the collaboration. Depending on
 * the context, these entities could be structural features of a classifier, instance
 * specifications, or even roles in some containing collaboration. There may be multiple
 * occurrences of a given collaboration within a classifier, each involving a different
 * set of roles and connectors. A given role or connector may be involved in multiple
 * occurrences of the same or different collaborations.
Associated dependencies map
 * features of the collaboration type to features in the classifier. These dependencies
 * indicate which role in the classifier plays which role in the collaboration. 
 * @see org.eclipse.uml2.uml.CollaborationUse
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
	 * The collaboration which is used in this occurrence. The collaboration defines the
	 * cooperation between its roles which are mapped to properties of the classifier owning
	 * the collaboration use. 
	 * @see org.eclipse.uml2.uml.CollaborationUse#getType()
	 * @generated
	 */
	public static final Function<CollaborationUse, Collaboration> type = new Function<CollaborationUse, Collaboration>() {
		public Collaboration apply(CollaborationUse s) {
			return s.getType();
		}
	};

	/**
	 * A mapping between features of the collaboration type and features of the classifier
	 * or operation. This mapping indicates which connectable element of the classifier or
	 * operation plays which role(s) in the collaboration. A connectable element may be bound
	 * to multiple roles in the same collaboration use (that is, it may play multiple roles).
	
	 * @see org.eclipse.uml2.uml.CollaborationUse#getRoleBindings()
	 * @generated
	 */
	public static final Function<CollaborationUse, EList<Dependency>> roleBinding = new Function<CollaborationUse, EList<Dependency>>() {
		public EList<Dependency> apply(CollaborationUse s) {
			return s.getRoleBindings();
		}
	};
	
	/**
	 * All the client elements of a roleBinding are in one classifier and all supplier elements
	 * of a roleBinding are in one collaboration and they are compatible.
	true 
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateClientElements(DiagnosticChain, Map)
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
	 * Every role in the collaboration is bound within the collaboration use to a connectable
	 * element within the classifier or operation.
	true 
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateEveryRole(DiagnosticChain, Map)
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
	 * The connectors in the classifier connect according to the connectors in the collaboration
	true
	 * @see org.eclipse.uml2.uml.CollaborationUse#validateConnectors(DiagnosticChain, Map)
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
