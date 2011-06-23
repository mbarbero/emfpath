package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InformationItem;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.InformationItem InformationItem} in a functional way.
 * <p>
 * An information item is an abstraction of all kinds of information that can be exchanged
 * between objects. It is a kind of classifier intended for representing information
 * in a very abstract way, one which cannot be instantiated. 
 * @see org.eclipse.uml2.uml.InformationItem
 * @generated
 */
public class InformationItemPath extends ClassifierPath {

	/**
	 * @generated
	 */
	private InformationItemPath() {
		super();
	}

	/**
	 * Determines the classifiers that will specify the structure and nature of the information.
	 * An information item represents all its represented classifiers. 
	 * @see org.eclipse.uml2.uml.InformationItem#getRepresenteds()
	 * @generated
	 */
	public static final Function<InformationItem, EList<Classifier>> represented = new Function<InformationItem, EList<Classifier>>() {
		public EList<Classifier> apply(InformationItem s) {
			return s.getRepresenteds();
		}
	};
	
	/**
	 * The sources and targets of an information item (its related information flows) must
	 * designate subsets of the sources and targets of the representation information item,
	 * if any.The Classifiers that can realize an information item can only be of the following
	 * kind: Class, Interface, InformationItem, Signal, Component.
	(self.represented->select(p
	 * | p->oclIsKindOf(InformationItem))->forAll(p |
	  p.informationFlow.source->forAll(q
	 * | self.informationFlow.source->include(q)) and
	    p.informationFlow.target->forAll(q
	 * | self.informationFlow.target->include(q)))) and
	      (self.represented->forAll(p
	 * | p->oclIsKindOf(Class) or oclIsKindOf(Interface) or
	        oclIsKindOf(InformationItem)
	 * or oclIsKindOf(Signal) or oclIsKindOf(Component))) 
	 * @see org.eclipse.uml2.uml.InformationItem#validateSourcesAndTargets(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InformationItem> validateSourcesAndTargets(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InformationItem>() {
			public boolean apply(InformationItem s) {
				return s.validateSourcesAndTargets(diagnostics, context);
			}
		};
	}

	/**
	 * An informationItem has no feature, no generalization, and no associations.
	self.generalization->isEmpty()
	 * and self.feature->isEmpty() 
	 * @see org.eclipse.uml2.uml.InformationItem#validateHasNo(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InformationItem> validateHasNo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InformationItem>() {
			public boolean apply(InformationItem s) {
				return s.validateHasNo(diagnostics, context);
			}
		};
	}

	/**
	 * It is not instantiable.
	isAbstract 
	 * @see org.eclipse.uml2.uml.InformationItem#validateNotInstantiable(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<InformationItem> validateNotInstantiable(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<InformationItem>() {
			public boolean apply(InformationItem s) {
				return s.validateNotInstantiable(diagnostics, context);
			}
		};
	}

}
