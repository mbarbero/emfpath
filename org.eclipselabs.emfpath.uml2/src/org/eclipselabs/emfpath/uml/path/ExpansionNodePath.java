package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExpansionNode ExpansionNode} in a functional way.
 * <p>
 * An expansion node is an object node used to indicate a flow across the boundary of
 * an expansion region. A flow into a region contains a collection that is broken into
 * its individual elements inside the region, which is executed once per element. A flow
 * out of a region combines individual elements into a collection for use outside the
 * region. 
 * @see org.eclipse.uml2.uml.ExpansionNode
 * @generated
 */
public class ExpansionNodePath extends ObjectNodePath {

	/**
	 * @generated
	 */
	private ExpansionNodePath() {
		super();
	}

	/**
	 * The expansion region for which the node is an output. 
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsOutput()
	 * @generated
	 */
	public static final Function<ExpansionNode, ExpansionRegion> regionAsOutput = new Function<ExpansionNode, ExpansionRegion>() {
		public ExpansionRegion apply(ExpansionNode s) {
			return s.getRegionAsOutput();
		}
	};

	/**
	 * The expansion region for which the node is an input. 
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsInput()
	 * @generated
	 */
	public static final Function<ExpansionNode, ExpansionRegion> regionAsInput = new Function<ExpansionNode, ExpansionRegion>() {
		public ExpansionRegion apply(ExpansionNode s) {
			return s.getRegionAsInput();
		}
	};
	
	

}
