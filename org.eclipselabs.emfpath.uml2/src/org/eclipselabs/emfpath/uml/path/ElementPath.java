package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Element Element} in a functional way.
 * <p>
 * An element is a constituent of a model. As such, it has the capability of owning other
 * elements. 
 * @see org.eclipse.uml2.uml.Element
 * @generated
 */
public class ElementPath {

	/**
	 * @generated
	 */
	 ElementPath() {
    // prevent instantiation
  }

	/**
	 * The Elements owned by this element. 
	 * @see org.eclipse.uml2.uml.Element#getOwnedElements()
	 * @generated
	 */
	public static final Function<Element, EList<Element>> ownedElement = new Function<Element, EList<Element>>() {
    public EList<Element> apply(Element s) {
      return s.getOwnedElements();
    }
  };

	/**
	 * The Element that owns this element. 
	 * @see org.eclipse.uml2.uml.Element#getOwner()
	 * @generated
	 */
	public static final Function<Element, Element> owner = new Function<Element, Element>() {
    public Element apply(Element s) {
      return s.getOwner();
    }
  };

	/**
	 * The Comments owned by this element. 
	 * @see org.eclipse.uml2.uml.Element#getOwnedComments()
	 * @generated
	 */
	public static final Function<Element, EList<Comment>> ownedComment = new Function<Element, EList<Comment>>() {
    public EList<Comment> apply(Element s) {
      return s.getOwnedComments();
    }
  };
	
	/**
	 * An element may not directly or indirectly own itself.
	not self.allOwnedElements()->includes(self)
	 * @see org.eclipse.uml2.uml.Element#validateNotOwnSelf(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Element> validateNotOwnSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.validateNotOwnSelf(diagnostics, context);
      }
    };
  }

	/**
	 * Elements that must be owned must have an owner.
	self.mustBeOwned() implies owner->notEmpty()
	 * @see org.eclipse.uml2.uml.Element#validateHasOwner(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<Element> validateHasOwner(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.validateHasOwner(diagnostics, context);
      }
    };
  }

	/**
	 * Destroys this element by removing all cross references to/from it and removing it
	 * from its containing resource or object. 
	 * @see org.eclipse.uml2.uml.Element#destroy()
	 * @generated
	 */
	public static final Function<Element, Element> destroy = new Function<Element, Element>() {
    public Element apply(Element s) {
      s.destroy();
      return s;
    }
  };

	/**
	 * Determines whether this element has the specified keyword. 
	 * @see org.eclipse.uml2.uml.Element#hasKeyword(String)
	 * @generated
	 */
	public static ComposablePredicate<Element> hasKeyword(final String keyword) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.hasKeyword(keyword);
      }
    };
  }

	/**
	 * Retrieves the keywords for this element. 
	 * @see org.eclipse.uml2.uml.Element#getKeywords()
	 * @generated
	 */
	public static final Function<Element, EList<String>> getKeywords = new Function<Element, EList<String>>() {
    public EList<String> apply(Element s) {
      return s.getKeywords();
    }
  };

	/**
	 * Adds the specified keyword to this element. 
	 * @see org.eclipse.uml2.uml.Element#addKeyword(String)
	 * @generated
	 */
	public static ComposablePredicate<Element> addKeyword(final String keyword) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.addKeyword(keyword);
      }
    };
  }

	/**
	 * Removes the specified keyword from this element. 
	 * @see org.eclipse.uml2.uml.Element#removeKeyword(String)
	 * @generated
	 */
	public static ComposablePredicate<Element> removeKeyword(final String keyword) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.removeKeyword(keyword);
      }
    };
  }

	/**
	 * Retrieves the nearest package that owns (either directly or indirectly) this element,
	 * or the element itself (if it is a package). 
	 * @see org.eclipse.uml2.uml.Element#getNearestPackage()
	 * @generated
	 */
	public static final Function<Element, Package> getNearestPackage = new Function<Element, Package>() {
    public Package apply(Element s) {
      return s.getNearestPackage();
    }
  };

	/**
	 * Retrieves the model that owns (either directly or indirectly) this element. 
	 * @see org.eclipse.uml2.uml.Element#getModel()
	 * @generated
	 */
	public static final Function<Element, Model> getModel = new Function<Element, Model>() {
    public Model apply(Element s) {
      return s.getModel();
    }
  };

	/**
	 * Determines whether the specified stereotype is applicable to this element. 
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplicable(Stereotype)
	 * @generated
	 */
	public static ComposablePredicate<Element> isStereotypeApplicable(final Stereotype stereotype) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.isStereotypeApplicable(stereotype);
      }
    };
  }

	/**
	 * Determines whether the specified stereotype is required for this element. 
	 * @see org.eclipse.uml2.uml.Element#isStereotypeRequired(Stereotype)
	 * @generated
	 */
	public static ComposablePredicate<Element> isStereotypeRequired(final Stereotype stereotype) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.isStereotypeRequired(stereotype);
      }
    };
  }

	/**
	 * Determines whether the specified stereotype is applied to this element. 
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplied(Stereotype)
	 * @generated
	 */
	public static ComposablePredicate<Element> isStereotypeApplied(final Stereotype stereotype) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.isStereotypeApplied(stereotype);
      }
    };
  }

	/**
	 * Applies the specified stereotype to this element. 
	 * @see org.eclipse.uml2.uml.Element#applyStereotype(Stereotype)
	 * @generated
	 */
	public static Function<Element, EObject> applyStereotype(final Stereotype stereotype) {
    return new Function<Element, EObject>() {
      public EObject apply(Element s) {
        return s.applyStereotype(stereotype);
      }
    };
  }

	/**
	 * Unapplies the specified stereotype from this element. 
	 * @see org.eclipse.uml2.uml.Element#unapplyStereotype(Stereotype)
	 * @generated
	 */
	public static Function<Element, EObject> unapplyStereotype(final Stereotype stereotype) {
    return new Function<Element, EObject>() {
      public EObject apply(Element s) {
        return s.unapplyStereotype(stereotype);
      }
    };
  }

	/**
	 * Retrieves the stereotypes that are applicable to this element, including those that
	 * are required and/or may already be applied. 
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotypes()
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getApplicableStereotypes = new Function<Element, EList<Stereotype>>() {
    public EList<Stereotype> apply(Element s) {
      return s.getApplicableStereotypes();
    }
  };

	/**
	 * Retrieves the stereotype with the specified qualified name that is applicable to this
	 * element, or null if no such stereotype is applicable. 
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotype(String)
	 * @generated
	 */
	public static Function<Element, Stereotype> getApplicableStereotype(final String qualifiedName) {
    return new Function<Element, Stereotype>() {
      public Stereotype apply(Element s) {
        return s.getApplicableStereotype(qualifiedName);
      }
    };
  }

	/**
	 * Retrieves the stereotype applications for this element. 
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplications()
	 * @generated
	 */
	public static final Function<Element, EList<EObject>> getStereotypeApplications = new Function<Element, EList<EObject>>() {
    public EList<EObject> apply(Element s) {
      return s.getStereotypeApplications();
    }
  };

	/**
	 * Retrieves the application of the specified stereotype for this element, or null if
	 * no such stereotype application exists. 
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplication(Stereotype)
	 * @generated
	 */
	public static Function<Element, EObject> getStereotypeApplication(final Stereotype stereotype) {
    return new Function<Element, EObject>() {
      public EObject apply(Element s) {
        return s.getStereotypeApplication(stereotype);
      }
    };
  }

	/**
	 * Retrieves the stereotypes that are required for this element. 
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotypes()
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getRequiredStereotypes = new Function<Element, EList<Stereotype>>() {
    public EList<Stereotype> apply(Element s) {
      return s.getRequiredStereotypes();
    }
  };

	/**
	 * Retrieves the stereotype with the specified qualified name that is required for this
	 * element, or null if no such stereotype is required. 
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotype(String)
	 * @generated
	 */
	public static Function<Element, Stereotype> getRequiredStereotype(final String qualifiedName) {
    return new Function<Element, Stereotype>() {
      public Stereotype apply(Element s) {
        return s.getRequiredStereotype(qualifiedName);
      }
    };
  }

	/**
	 * Retrieves the stereotypes that are applied to this element. 
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotypes()
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getAppliedStereotypes = new Function<Element, EList<Stereotype>>() {
    public EList<Stereotype> apply(Element s) {
      return s.getAppliedStereotypes();
    }
  };

	/**
	 * Retrieves the stereotype with the specified qualified name that is applied to this
	 * element, or null if no such stereotype is  applied. 
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotype(String)
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedStereotype(final String qualifiedName) {
    return new Function<Element, Stereotype>() {
      public Stereotype apply(Element s) {
        return s.getAppliedStereotype(qualifiedName);
      }
    };
  }

	/**
	 * Retrieves the substereotypes of the specified stereotype that are applied to this
	 * element. 
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotypes(Stereotype)
	 * @generated
	 */
	public static Function<Element, EList<Stereotype>> getAppliedSubstereotypes(final Stereotype stereotype) {
    return new Function<Element, EList<Stereotype>>() {
      public EList<Stereotype> apply(Element s) {
        return s.getAppliedSubstereotypes(stereotype);
      }
    };
  }

	/**
	 * Retrieves the substereotype of the specified stereotype with the specified qualified
	 * name that is applied to this element, or null if no such stereotype is applied. 
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotype(Stereotype, String)
	 * @generated
	 */
	public static Function<Element, Stereotype> getAppliedSubstereotype(final Stereotype stereotype, final String qualifiedName) {
    return new Function<Element, Stereotype>() {
      public Stereotype apply(Element s) {
        return s.getAppliedSubstereotype(stereotype, qualifiedName);
      }
    };
  }

	/**
	 * Determines whether this element has a (non-default) value for the property with the
	 * specified name in the specified stereotype. 
	 * @see org.eclipse.uml2.uml.Element#hasValue(Stereotype, String)
	 * @generated
	 */
	public static ComposablePredicate<Element> hasValue(final Stereotype stereotype, final String propertyName) {
    return new ComposablePredicate<Element>() {
      public boolean apply(Element s) {
        return s.hasValue(stereotype, propertyName);
      }
    };
  }

	/**
	 * Retrieves the value of the property with the specified name in the specified stereotype
	 * for this element. 
	 * @see org.eclipse.uml2.uml.Element#getValue(Stereotype, String)
	 * @generated
	 */
	public static Function<Element, Object> getValue(final Stereotype stereotype, final String propertyName) {
    return new Function<Element, Object>() {
      public Object apply(Element s) {
        return s.getValue(stereotype, propertyName);
      }
    };
  }

	/**
	 * Sets the value of the property with the specified name in the specified stereotype
	 * for this element. 
	 * @see org.eclipse.uml2.uml.Element#setValue(Stereotype, String, Object)
	 * @generated
	 */
	public static Function<Element, Element> setValue(final Stereotype stereotype, final String propertyName, final Object newValue) {
    return new Function<Element, Element>() {
      public Element apply(Element s) {
        s.setValue(stereotype, propertyName, newValue);
        return s;
      }
    };
  }

	/**
	 * Creates an annotation with the specified source and this element as its model element.
	 * @see org.eclipse.uml2.uml.Element#createEAnnotation(String)
	 * @generated
	 */
	public static Function<Element, EAnnotation> createEAnnotation(final String source) {
    return new Function<Element, EAnnotation>() {
      public EAnnotation apply(Element s) {
        return s.createEAnnotation(source);
      }
    };
  }

	/**
	 * Retrieves the relationships in which this element is involved. 
	 * @see org.eclipse.uml2.uml.Element#getRelationships()
	 * @generated
	 */
	public static final Function<Element, EList<Relationship>> getRelationships = new Function<Element, EList<Relationship>>() {
    public EList<Relationship> apply(Element s) {
      return s.getRelationships();
    }
  };

	/**
	 * Retrieves the relationships of the specified type in which this element is involved.
	 * @see org.eclipse.uml2.uml.Element#getRelationships(EClass)
	 * @generated
	 */
	public static Function<Element, EList<Relationship>> getRelationships(final EClass eClass) {
    return new Function<Element, EList<Relationship>>() {
      public EList<Relationship> apply(Element s) {
        return s.getRelationships(eClass);
      }
    };
  }

	/**
	 * Retrieves the directed relationships for which this element is a source. 
	 * @see org.eclipse.uml2.uml.Element#getSourceDirectedRelationships()
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships = new Function<Element, EList<DirectedRelationship>>() {
    public EList<DirectedRelationship> apply(Element s) {
      return s.getSourceDirectedRelationships();
    }
  };

	/**
	 * Retrieves the directed relationships of the specified type for which this element
	 * is a source. 
	 * @see org.eclipse.uml2.uml.Element#getSourceDirectedRelationships(EClass)
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships(final EClass eClass) {
    return new Function<Element, EList<DirectedRelationship>>() {
      public EList<DirectedRelationship> apply(Element s) {
        return s.getSourceDirectedRelationships(eClass);
      }
    };
  }

	/**
	 * Retrieves the directed relationships for which this element is a target. 
	 * @see org.eclipse.uml2.uml.Element#getTargetDirectedRelationships()
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships = new Function<Element, EList<DirectedRelationship>>() {
    public EList<DirectedRelationship> apply(Element s) {
      return s.getTargetDirectedRelationships();
    }
  };

	/**
	 * Retrieves the directed relationships of the specified type for which this element
	 * is a target. 
	 * @see org.eclipse.uml2.uml.Element#getTargetDirectedRelationships(EClass)
	 * @generated
	 */
	public static Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships(final EClass eClass) {
    return new Function<Element, EList<DirectedRelationship>>() {
      public EList<DirectedRelationship> apply(Element s) {
        return s.getTargetDirectedRelationships(eClass);
      }
    };
  }

	/**
	 * The query allOwnedElements() gives all of the direct and indirect owned elements of
	 * an element.
	result = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))
	 * @see org.eclipse.uml2.uml.Element#allOwnedElements()
	 * @generated
	 */
	public static final Function<Element, EList<Element>> allOwnedElements = new Function<Element, EList<Element>>() {
    public EList<Element> apply(Element s) {
      return s.allOwnedElements();
    }
  };

	/**
	 * The query mustBeOwned() indicates whether elements of this type must have an owner.
	 * Subclasses of Element that do not require an owner must override this operation.
	result
	 * = true 
	 * @see org.eclipse.uml2.uml.Element#mustBeOwned()
	 * @generated
	 */
	public static final ComposablePredicate<Element> mustBeOwned = new ComposablePredicate<Element>() {
    public boolean apply(Element s) {
      return s.mustBeOwned();
    }
  };

}
