package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.UseCase;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Extend Extend} in a functional way.
 * <p>
 * A relationship from an extending use case to an extended use case that specifies how
 * and when the behavior defined in the extending use case can be inserted into the behavior
 * defined in the extended use case. 
 * @see org.eclipse.uml2.uml.Extend
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
	 * References the use case that is being extended. 
	 * @see org.eclipse.uml2.uml.Extend#getExtendedCase()
	 * @generated
	 */
	public static final Function<Extend, UseCase> extendedCase = new Function<Extend, UseCase>() {
    public UseCase apply(Extend s) {
      return s.getExtendedCase();
    }
  };

	/**
	 * References the condition that must hold when the first extension point is reached
	 * for the extension to take place. If no constraint is associated with the extend relationship,
	 * the extension is unconditional.
	 
	 * @see org.eclipse.uml2.uml.Extend#getCondition()
	 * @generated
	 */
	public static final Function<Extend, Constraint> condition = new Function<Extend, Constraint>() {
    public Constraint apply(Extend s) {
      return s.getCondition();
    }
  };

	/**
	 * An ordered list of extension points belonging to the extended use case, specifying
	 * where the respective behavioral fragments of the extending use case are to be inserted.
	 * The first fragment in the extending use case is associated with the first extension
	 * point in the list, the second fragment with the second point, and so on. (Note that,
	 * in most practical cases, the extending use case has just a single behavior fragment,
	 * so that the list of extension points is trivial.)
	 
	 * @see org.eclipse.uml2.uml.Extend#getExtensionLocations()
	 * @generated
	 */
	public static final Function<Extend, EList<ExtensionPoint>> extensionLocation = new Function<Extend, EList<ExtensionPoint>>() {
    public EList<ExtensionPoint> apply(Extend s) {
      return s.getExtensionLocations();
    }
  };

	/**
	 * References the use case that represents the extension and owns the extend relationship.
	 * @see org.eclipse.uml2.uml.Extend#getExtension()
	 * @generated
	 */
	public static final Function<Extend, UseCase> extension = new Function<Extend, UseCase>() {
    public UseCase apply(Extend s) {
      return s.getExtension();
    }
  };
	
	/**
	 * The extension points referenced by the extend relationship must belong to the use
	 * case that is being extended.
	
	
	extensionLocation->forAll (xp | extendedCase.extensionPoint->includes(xp))
	 * @see org.eclipse.uml2.uml.Extend#validateExtensionPoints(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Extend> validateExtensionPoints(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Extend>() {
      public boolean apply(Extend s) {
        return s.validateExtensionPoints(diagnostics, context);
      }
    };
  }

}
