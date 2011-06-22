package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExpansionKind;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;

/**
 * @generated
 */
public class ExpansionRegionPath extends StructuredActivityNodePath {

	/**
	 * @generated
	 */
	private ExpansionRegionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getMode()
	 * @generated
	 */
	public static final Function<ExpansionRegion, ExpansionKind> mode = new Function<ExpansionRegion, ExpansionKind>() {
		public ExpansionKind apply(ExpansionRegion s) {
			return s.getMode();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getInputElements()
	 * @generated
	 */
	public static final Function<ExpansionRegion, EList<ExpansionNode>> inputElement = new Function<ExpansionRegion, EList<ExpansionNode>>() {
		public EList<ExpansionNode> apply(ExpansionRegion s) {
			return s.getInputElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getOutputElements()
	 * @generated
	 */
	public static final Function<ExpansionRegion, EList<ExpansionNode>> outputElement = new Function<ExpansionRegion, EList<ExpansionNode>>() {
		public EList<ExpansionNode> apply(ExpansionRegion s) {
			return s.getOutputElements();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ExpansionRegion#validateExpansionNodes()
	 * @generated
	 */
	public static Predicate<ExpansionRegion> validateExpansionNodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExpansionRegion>() {
			public boolean apply(ExpansionRegion s) {
				return s.validateExpansionNodes(diagnostics, context);
			}
		};
	}

}
