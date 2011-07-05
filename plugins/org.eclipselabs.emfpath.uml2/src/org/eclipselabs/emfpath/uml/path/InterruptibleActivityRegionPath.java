package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InterruptibleActivityRegion InterruptibleActivityRegion} in a functional way.
 * <p>
 * An interruptible activity region is an activity group that supports termination of
 * tokens flowing in the portions of an activity. 
 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion
 * @generated
 */
public class InterruptibleActivityRegionPath extends ActivityGroupPath {

	/**
	 * @generated
	 */
	private InterruptibleActivityRegionPath() {
    super();
  }

	/**
	 * Nodes immediately contained in the group. 
	 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion#getNodes()
	 * @generated
	 */
	public static final Function<InterruptibleActivityRegion, EList<ActivityNode>> node = new Function<InterruptibleActivityRegion, EList<ActivityNode>>() {
    public EList<ActivityNode> apply(InterruptibleActivityRegion s) {
      return s.getNodes();
    }
  };

	/**
	 * The edges leaving the region that will abort other tokens flowing in the region. 
	 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion#getInterruptingEdges()
	 * @generated
	 */
	public static final Function<InterruptibleActivityRegion, EList<ActivityEdge>> interruptingEdge = new Function<InterruptibleActivityRegion, EList<ActivityEdge>>() {
    public EList<ActivityEdge> apply(InterruptibleActivityRegion s) {
      return s.getInterruptingEdges();
    }
  };
	
	/**
	 * Interrupting edges of a region must have their source node in the region and their
	 * target node outside the region in the same activity containing the region.
	
	true
	 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion#validateInterruptingEdges(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InterruptibleActivityRegion> validateInterruptingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InterruptibleActivityRegion>() {
      public boolean apply(InterruptibleActivityRegion s) {
        return s.validateInterruptingEdges(diagnostics, context);
      }
    };
  }

}
