package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ExpansionKind;
import org.eclipse.uml2.uml.ExpansionNode;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExpansionRegion ExpansionRegion} in a functional way.
 * <p>
 * An expansion region is a structured activity region that executes multiple times corresponding
 * to elements of an input collection. 
 * @see org.eclipse.uml2.uml.ExpansionRegion
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
	 * The way in which the executions interact:
	parallel: all interactions are independent
	iterative:
	 * the interactions occur in order of the elements
	stream: a stream of values flows
	 * into a single execution
	 
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getMode()
	 * @generated
	 */
	public static final Function<ExpansionRegion, ExpansionKind> mode = new Function<ExpansionRegion, ExpansionKind>() {
    public ExpansionKind apply(ExpansionRegion s) {
      return s.getMode();
    }
  };

	/**
	 * An object node that holds a separate element of the input collection during each of
	 * the multiple executions of the region. 
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getInputElements()
	 * @generated
	 */
	public static final Function<ExpansionRegion, EList<ExpansionNode>> inputElement = new Function<ExpansionRegion, EList<ExpansionNode>>() {
    public EList<ExpansionNode> apply(ExpansionRegion s) {
      return s.getInputElements();
    }
  };

	/**
	 * An object node that accepts a separate element of the output collection during each
	 * of the multiple executions of the region. The values are formed into a collection
	 * that is available when the execution of the region is complete. 
	 * @see org.eclipse.uml2.uml.ExpansionRegion#getOutputElements()
	 * @generated
	 */
	public static final Function<ExpansionRegion, EList<ExpansionNode>> outputElement = new Function<ExpansionRegion, EList<ExpansionNode>>() {
    public EList<ExpansionNode> apply(ExpansionRegion s) {
      return s.getOutputElements();
    }
  };
	
	/**
	 * An ExpansionRegion must have one or more argument ExpansionNodes and zero or more
	 * result ExpansionNodes.
	true 
	 * @see org.eclipse.uml2.uml.ExpansionRegion#validateExpansionNodes(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ExpansionRegion> validateExpansionNodes(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ExpansionRegion>() {
      public boolean apply(ExpansionRegion s) {
        return s.validateExpansionNodes(diagnostics, context);
      }
    };
  }

}
