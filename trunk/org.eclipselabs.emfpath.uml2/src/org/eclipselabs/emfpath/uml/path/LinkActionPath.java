package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkAction;
import org.eclipse.uml2.uml.LinkEndData;

/**
 * @generated
 */
public class LinkActionPath extends ActionPath {

	/**
	 * @generated
	 */
	 LinkActionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkAction#getEndData()
	 * @generated
	 */
	public static final Function<LinkAction, EList<LinkEndData>> endData = new Function<LinkAction, EList<LinkEndData>>() {
		public EList<LinkEndData> apply(LinkAction s) {
			return s.getEndData();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LinkAction#getInputValues()
	 * @generated
	 */
	public static final Function<LinkAction, EList<InputPin>> inputValue = new Function<LinkAction, EList<InputPin>>() {
		public EList<InputPin> apply(LinkAction s) {
			return s.getInputValues();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.LinkAction#validateSameAssociation()
	 * @generated
	 */
	public static Predicate<LinkAction> validateSameAssociation(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkAction>() {
			public boolean apply(LinkAction s) {
				return s.validateSameAssociation(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkAction#validateNotStatic()
	 * @generated
	 */
	public static Predicate<LinkAction> validateNotStatic(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkAction>() {
			public boolean apply(LinkAction s) {
				return s.validateNotStatic(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkAction#validateSamePins()
	 * @generated
	 */
	public static Predicate<LinkAction> validateSamePins(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkAction>() {
			public boolean apply(LinkAction s) {
				return s.validateSamePins(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkAction#association()
	 * @generated
	 */
	public static final Function<LinkAction, Association> association = new Function<LinkAction, Association>() {
		public Association apply(LinkAction s) {
			return s.association();
		}
	};

}
