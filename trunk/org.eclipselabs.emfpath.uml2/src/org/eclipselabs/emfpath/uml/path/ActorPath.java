package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Actor;

/**
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
	 * @see org.eclipse.uml2.uml.Actor#validateAssociations()
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
	 * @see org.eclipse.uml2.uml.Actor#validateMustHaveName()
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
