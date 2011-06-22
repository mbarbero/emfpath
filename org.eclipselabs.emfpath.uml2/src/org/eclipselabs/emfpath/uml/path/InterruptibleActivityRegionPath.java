package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;

/**
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
	 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion#getNodes()
	 * @generated
	 */
	public static final Function<InterruptibleActivityRegion, EList<ActivityNode>> node = new Function<InterruptibleActivityRegion, EList<ActivityNode>>() {
		public EList<ActivityNode> apply(InterruptibleActivityRegion s) {
			return s.getNodes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion#getInterruptingEdges()
	 * @generated
	 */
	public static final Function<InterruptibleActivityRegion, EList<ActivityEdge>> interruptingEdge = new Function<InterruptibleActivityRegion, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(InterruptibleActivityRegion s) {
			return s.getInterruptingEdges();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.InterruptibleActivityRegion#validateInterruptingEdges()
	 * @generated
	 */
	public static Predicate<InterruptibleActivityRegion> validateInterruptingEdges(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InterruptibleActivityRegion>() {
			public boolean apply(InterruptibleActivityRegion s) {
				return s.validateInterruptingEdges(diagnostics, context);
			}
		};
	}

}
