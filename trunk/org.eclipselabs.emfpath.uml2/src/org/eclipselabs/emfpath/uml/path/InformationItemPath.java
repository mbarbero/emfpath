package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.InformationItem;

/**
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
	 * @see org.eclipse.uml2.uml.InformationItem#getRepresenteds()
	 * @generated
	 */
	public static final Function<InformationItem, EList<Classifier>> represented = new Function<InformationItem, EList<Classifier>>() {
		public EList<Classifier> apply(InformationItem s) {
			return s.getRepresenteds();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.InformationItem#validateSourcesAndTargets()
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
	 * @see org.eclipse.uml2.uml.InformationItem#validateHasNo()
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
	 * @see org.eclipse.uml2.uml.InformationItem#validateNotInstantiable()
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
