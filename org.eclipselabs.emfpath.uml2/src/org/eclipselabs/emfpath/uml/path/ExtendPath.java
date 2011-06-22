package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UseCase;

/**
 * @generated
 */
public class ExtendPath extends NamedElementPath {

	/**
	 * @generated
	 */
	private ExtendPath() {
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
	 * @see org.eclipse.uml2.uml.Extend#getExtendedCase()
	 * @generated
	 */
	public static final Function<Extend, UseCase> extendedCase = new Function<Extend, UseCase>() {
		public UseCase apply(Extend s) {
			return s.getExtendedCase();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Extend#getCondition()
	 * @generated
	 */
	public static final Function<Extend, Constraint> condition = new Function<Extend, Constraint>() {
		public Constraint apply(Extend s) {
			return s.getCondition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Extend#getExtensionLocations()
	 * @generated
	 */
	public static final Function<Extend, EList<ExtensionPoint>> extensionLocation = new Function<Extend, EList<ExtensionPoint>>() {
		public EList<ExtensionPoint> apply(Extend s) {
			return s.getExtensionLocations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Extend#getExtension()
	 * @generated
	 */
	public static final Function<Extend, UseCase> extension = new Function<Extend, UseCase>() {
		public UseCase apply(Extend s) {
			return s.getExtension();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Extend#validateExtensionPoints()
	 * @generated
	 */
	public static Predicate<Extend> validateExtensionPoints(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Extend>() {
			public boolean apply(Extend s) {
				return s.validateExtensionPoints(diagnostics, context);
			}
		};
	}

}
