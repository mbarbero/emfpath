package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.OpaqueBehavior;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.OpaqueBehavior OpaqueBehavior} in a functional way.
 * <p>
 * An behavior with implementation-specific semantics. 
 * @see org.eclipse.uml2.uml.OpaqueBehavior
 * @generated
 */
public class OpaqueBehaviorPath extends BehaviorPath {

	/**
	 * @generated
	 */
	 OpaqueBehaviorPath() {
		super();
	}

	/**
	 * Specifies the behavior in one or more languages. 
	 * @see org.eclipse.uml2.uml.OpaqueBehavior#getBodies()
	 * @generated
	 */
	public static final Function<OpaqueBehavior, EList<String>> body = new Function<OpaqueBehavior, EList<String>>() {
		public EList<String> apply(OpaqueBehavior s) {
			return s.getBodies();
		}
	};

	/**
	 * Languages the body strings use in the same order as the body strings. 
	 * @see org.eclipse.uml2.uml.OpaqueBehavior#getLanguages()
	 * @generated
	 */
	public static final Function<OpaqueBehavior, EList<String>> language = new Function<OpaqueBehavior, EList<String>>() {
		public EList<String> apply(OpaqueBehavior s) {
			return s.getLanguages();
		}
	};
	
	

}
