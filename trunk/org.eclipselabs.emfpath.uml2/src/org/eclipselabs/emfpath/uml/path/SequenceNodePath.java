package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.SequenceNode;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.SequenceNode SequenceNode} in a functional way.
 * <p>
 * A sequence node is a structured activity node that executes its actions in order.
 * @see org.eclipse.uml2.uml.SequenceNode
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
	 * An ordered set of executable nodes. 
	 * @see org.eclipse.uml2.uml.SequenceNode#getExecutableNodes()
	 * @generated
	 */
	public static final Function<SequenceNode, EList<ExecutableNode>> executableNode = new Function<SequenceNode, EList<ExecutableNode>>() {
    public EList<ExecutableNode> apply(SequenceNode s) {
      return s.getExecutableNodes();
    }
  };
	
	

}
