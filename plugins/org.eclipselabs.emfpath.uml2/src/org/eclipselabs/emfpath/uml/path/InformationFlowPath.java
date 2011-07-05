package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InformationFlow;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InformationFlow InformationFlow} in a functional way.
 * <p>
 * An information flow specifies that one or more information items circulates from its
 * sources to its targets. Information flows require some kind of information channel
 * for transmitting information items from the source to the destination. An information
 * channel is represented in various ways depending on the nature of its sources and
 * targets. It may be represented by connectors, links, associations, or even dependencies.
 * For example, if the source and destination are parts in some composite structure such
 * as a collaboration, then the information channel is likely to be represented by a
 * connector between them. Or, if the source and target are objects (which are a kind
 * of instance specification), they may be represented by a link that joins the two,
 * and so on. 
 * @see org.eclipse.uml2.uml.InformationFlow
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
	 * Specifies the elements related by the Relationship. 
	 *
	 * @see RelationshipPath#relatedElement()
	 * @see org.eclipse.uml2.uml.Relationship#getRelatedElements()
	 * @generated
	 */
	public static final Function<Relationship, EList<Element>> relatedElement = RelationshipPath.relatedElement;

	/**
	 * Specifies the sources of the DirectedRelationship. 
	 *
	 * @see DirectedRelationshipPath#source()
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getSources()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> source = DirectedRelationshipPath.source;

	/**
	 * Specifies the targets of the DirectedRelationship. 
	 *
	 * @see DirectedRelationshipPath#target()
	 * @see org.eclipse.uml2.uml.DirectedRelationship#getTargets()
	 * @generated
	 */
	public static final Function<DirectedRelationship, EList<Element>> target = DirectedRelationshipPath.target;

	/**
	 * Determines which Relationship will realize the specified flow 
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizations()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Relationship>> realization = new Function<InformationFlow, EList<Relationship>>() {
    public EList<Relationship> apply(InformationFlow s) {
      return s.getRealizations();
    }
  };

	/**
	 * Specifies the information items that may circulate on this information flow. 
	 * @see org.eclipse.uml2.uml.InformationFlow#getConveyeds()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Classifier>> conveyed = new Function<InformationFlow, EList<Classifier>>() {
    public EList<Classifier> apply(InformationFlow s) {
      return s.getConveyeds();
    }
  };

	/**
	 * Defines from which source the conveyed InformationItems are initiated. 
	 * @see org.eclipse.uml2.uml.InformationFlow#getInformationSources()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<NamedElement>> informationSource = new Function<InformationFlow, EList<NamedElement>>() {
    public EList<NamedElement> apply(InformationFlow s) {
      return s.getInformationSources();
    }
  };

	/**
	 * Defines to which target the conveyed InformationItems are directed. 
	 * @see org.eclipse.uml2.uml.InformationFlow#getInformationTargets()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<NamedElement>> informationTarget = new Function<InformationFlow, EList<NamedElement>>() {
    public EList<NamedElement> apply(InformationFlow s) {
      return s.getInformationTargets();
    }
  };

	/**
	 * Determines which ActivityEdges will realize the specified flow. 
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizingActivityEdges()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<ActivityEdge>> realizingActivityEdge = new Function<InformationFlow, EList<ActivityEdge>>() {
    public EList<ActivityEdge> apply(InformationFlow s) {
      return s.getRealizingActivityEdges();
    }
  };

	/**
	 * Determines which Connectors will realize the specified flow. 
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizingConnectors()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Connector>> realizingConnector = new Function<InformationFlow, EList<Connector>>() {
    public EList<Connector> apply(InformationFlow s) {
      return s.getRealizingConnectors();
    }
  };

	/**
	 * Determines which Messages will realize the specified flow. 
	 * @see org.eclipse.uml2.uml.InformationFlow#getRealizingMessages()
	 * @generated
	 */
	public static final Function<InformationFlow, EList<Message>> realizingMessage = new Function<InformationFlow, EList<Message>>() {
    public EList<Message> apply(InformationFlow s) {
      return s.getRealizingMessages();
    }
  };
	
	/**
	 * The sources and targets of the information flow can only be one of the following kind:
	 * Actor, Node, UseCase, Artifact, Class, Component, Port, Property, Interface, Package,
	 * ActivityNode, ActivityPartition and InstanceSpecification except when its classifier
	 * is a relationship (i.e. it represents a link).
	(self.source->forAll(p | p->oclIsKindOf(Actor)
	 * or oclIsKindOf(Node) or
	  oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class)
	 * or
	  oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or
	  oclIsKindOf(Interface)
	 * or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or
	  oclIsKindOf(ActivityPartition)
	 * or oclIsKindOf(InstanceSpecification))) and
	    (self.target->forAll(p | p->oclIsKindOf(Actor)
	 * or oclIsKindOf(Node) or
	      oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class)
	 * or
	      oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or
	
	 *      oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or
	
	 *      oclIsKindOf(ActivityPartition) or oclIsKindOf(InstanceSpecification))) 
	 * @see org.eclipse.uml2.uml.InformationFlow#validateSourcesAndTargetsKind(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InformationFlow> validateSourcesAndTargetsKind(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InformationFlow>() {
      public boolean apply(InformationFlow s) {
        return s.validateSourcesAndTargetsKind(diagnostics, context);
      }
    };
  }

	/**
	 * The sources and targets of the information flow must conform with the sources and
	 * targets or conversely the targets and sources of the realization relationships.
	true
	 * @see org.eclipse.uml2.uml.InformationFlow#validateMustConform(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InformationFlow> validateMustConform(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InformationFlow>() {
      public boolean apply(InformationFlow s) {
        return s.validateMustConform(diagnostics, context);
      }
    };
  }

	/**
	 * An information flow can only convey classifiers that are allowed to represent an information
	 * item.
	
	self.conveyed.represented->forAll(p | p->oclIsKindOf(Class) or oclIsKindOf(Interface)
	
	 *  or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))
	 * @see org.eclipse.uml2.uml.InformationFlow#validateConveyClassifiers(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<InformationFlow> validateConveyClassifiers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<InformationFlow>() {
      public boolean apply(InformationFlow s) {
        return s.validateConveyClassifiers(diagnostics, context);
      }
    };
  }

}
