package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.OpaqueBehavior;

/**
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
	 * @see org.eclipse.uml2.uml.OpaqueBehavior#getBodies()
	 * @generated
	 */
	public static final Function<OpaqueBehavior, EList<String>> body = new Function<OpaqueBehavior, EList<String>>() {
		public EList<String> apply(OpaqueBehavior s) {
			return s.getBodies();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.OpaqueBehavior#getLanguages()
	 * @generated
	 */
	public static final Function<OpaqueBehavior, EList<String>> language = new Function<OpaqueBehavior, EList<String>>() {
		public EList<String> apply(OpaqueBehavior s) {
			return s.getLanguages();
		}
	};
	
	

}
