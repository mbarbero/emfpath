package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;

/**
 * @generated
 */
public class InformationFlowPath extends PackageableElementPath {

	/**
	 * @generated
	 */
	private InformationFlowPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = RelationshipPath.relatedElement;

	/**
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getSources()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> source = DirectedRelationshipPath.source;

	/**
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getTargets()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> target = DirectedRelationshipPath.target;

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizations()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Relationship>> realization = new Function<InformationFlow, EList<Relationship>>() {
		public EList<Relationship> apply(InformationFlow s) {
			return s.getRealizations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#getConveyeds()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Classifier>> conveyed = new Function<InformationFlow, EList<Classifier>>() {
		public EList<Classifier> apply(InformationFlow s) {
			return s.getConveyeds();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#getInformationSources()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<NamedElement>> informationSource = new Function<InformationFlow, EList<NamedElement>>() {
		public EList<NamedElement> apply(InformationFlow s) {
			return s.getInformationSources();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#getInformationTargets()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<NamedElement>> informationTarget = new Function<InformationFlow, EList<NamedElement>>() {
		public EList<NamedElement> apply(InformationFlow s) {
			return s.getInformationTargets();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizingActivityEdges()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<ActivityEdge>> realizingActivityEdge = new Function<InformationFlow, EList<ActivityEdge>>() {
		public EList<ActivityEdge> apply(InformationFlow s) {
			return s.getRealizingActivityEdges();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizingConnectors()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Connector>> realizingConnector = new Function<InformationFlow, EList<Connector>>() {
		public EList<Connector> apply(InformationFlow s) {
			return s.getRealizingConnectors();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizingMessages()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Message>> realizingMessage = new Function<InformationFlow, EList<Message>>() {
		public EList<Message> apply(InformationFlow s) {
			return s.getRealizingMessages();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#validateSourcesAndTargetsKind()
	 * @generated
	 */
	public static Predicate<InformationFlow> validateSourcesAndTargetsKind(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InformationFlow>() {
			public boolean apply(InformationFlow s) {
				return s.validateSourcesAndTargetsKind(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#validateMustConform()
	 * @generated
	 */
	public static Predicate<InformationFlow> validateMustConform(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InformationFlow>() {
			public boolean apply(InformationFlow s) {
				return s.validateMustConform(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.InformationFlow#validateConveyClassifiers()
	 * @generated
	 */
	public static Predicate<InformationFlow> validateConveyClassifiers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InformationFlow>() {
			public boolean apply(InformationFlow s) {
				return s.validateConveyClassifiers(diagnostics, context);
			}
		};
	}

}
