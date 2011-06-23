package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Actor;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Actor Actor} in a functional way.
 * <p>
 * An actor specifies a role played by a user or any other system that interacts with
 * the subject. 
 * @see org.eclipse.uml2.uml.Actor
 * @generated
 */
public class ActorPath extends BehavioredClassifierPath {

	/**
	 * @generated
	 */
	private ActorPath() {
		super();
	}

	
	
	/**
	 * An actor can only have associations to use cases, components and classes. Furthermore
	 * these associations must be binary.
	self.ownedAttribute->forAll ( a |
	(a.association->notEmpty())
	 * implies
	((a.association.memberEnd.size() = 2) and
	(a.opposite.class.oclIsKindOf(UseCase)
	 * or
	(a.opposite.class.oclIsKindOf(Class) and not a.opposite.class.oclIsKindOf(Behavior))))
	
	 * @see org.eclipse.uml2.uml.Actor#validateAssociations(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Actor> validateAssociations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Actor>() {
			public boolean apply(Actor s) {
				return s.validateAssociations(diagnostics, context);
			}
		};
	}

	/**
	 * An actor must have a name.
	name->notEmpty() 
	 * @see org.eclipse.uml2.uml.Actor#validateMustHaveName(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Actor> validateMustHaveName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Actor>() {
			public boolean apply(Actor s) {
				return s.validateMustHaveName(diagnostics, context);
			}
		};
	}

}
