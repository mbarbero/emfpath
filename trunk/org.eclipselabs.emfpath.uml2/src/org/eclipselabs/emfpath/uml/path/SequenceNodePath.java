package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.SequenceNode;

/**
 * @generated
 */
public class SequenceNodePath extends StructuredActivityNodePath {

	/**
	 * @generated
	 */
	private SequenceNodePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.SequenceNode#getExecutableNodes()
	 * @generated
	 */
	public static final Function<SequenceNode, EList<ExecutableNode>> executableNode = new Function<SequenceNode, EList<ExecutableNode>>() {
		public EList<ExecutableNode> apply(SequenceNode s) {
			return s.getExecutableNodes();
		}
	};
	
	

}
