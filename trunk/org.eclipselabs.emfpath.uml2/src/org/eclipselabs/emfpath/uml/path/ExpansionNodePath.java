package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;

/**
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
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsOutput()
	 * @generated
	 */
	public static final Function<ExpansionNode, ExpansionRegion> regionAsOutput = new Function<ExpansionNode, ExpansionRegion>() {
		public ExpansionRegion apply(ExpansionNode s) {
			return s.getRegionAsOutput();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ExpansionNode#getRegionAsInput()
	 * @generated
	 */
	public static final Function<ExpansionNode, ExpansionRegion> regionAsInput = new Function<ExpansionNode, ExpansionRegion>() {
		public ExpansionRegion apply(ExpansionNode s) {
			return s.getRegionAsInput();
		}
	};
	
	

}
