package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
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

/**
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
	 * @see org.eclipse.uml2.uml.Element#getOwnedElements()
	 * @generated
	 */
	public static final Function<Element, EList<Element>> ownedElement = new Function<Element, EList<Element>>() {
		public EList<Element> apply(Element s) {
			return s.getOwnedElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getOwner()
	 * @generated
	 */
	public static final Function<Element, Element> owner = new Function<Element, Element>() {
		public Element apply(Element s) {
			return s.getOwner();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getOwnedComments()
	 * @generated
	 */
	public static final Function<Element, EList<Comment>> ownedComment = new Function<Element, EList<Comment>>() {
		public EList<Comment> apply(Element s) {
			return s.getOwnedComments();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Element#validateNotOwnSelf()
	 * @generated
	 */
	public static Predicate<Element> validateNotOwnSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.validateNotOwnSelf(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#validateHasOwner()
	 * @generated
	 */
	public static Predicate<Element> validateHasOwner(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.validateHasOwner(diagnostics, context);
			}
		};
	}

	/**
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
	 * @see org.eclipse.uml2.uml.Element#hasKeyword()
	 * @generated
	 */
	public static Predicate<Element> hasKeyword(final String keyword) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.hasKeyword(keyword);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#getKeywords()
	 * @generated
	 */
	public static final Function<Element, EList<String>> getKeywords = new Function<Element, EList<String>>() {
		public EList<String> apply(Element s) {
			return s.getKeywords();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#addKeyword()
	 * @generated
	 */
	public static Predicate<Element> addKeyword(final String keyword) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.addKeyword(keyword);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#removeKeyword()
	 * @generated
	 */
	public static Predicate<Element> removeKeyword(final String keyword) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.removeKeyword(keyword);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#getNearestPackage()
	 * @generated
	 */
	public static final Function<Element, Package> getNearestPackage = new Function<Element, Package>() {
		public Package apply(Element s) {
			return s.getNearestPackage();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getModel()
	 * @generated
	 */
	public static final Function<Element, Model> getModel = new Function<Element, Model>() {
		public Model apply(Element s) {
			return s.getModel();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplicable()
	 * @generated
	 */
	public static Predicate<Element> isStereotypeApplicable(final Stereotype stereotype) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.isStereotypeApplicable(stereotype);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#isStereotypeRequired()
	 * @generated
	 */
	public static Predicate<Element> isStereotypeRequired(final Stereotype stereotype) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.isStereotypeRequired(stereotype);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#isStereotypeApplied()
	 * @generated
	 */
	public static Predicate<Element> isStereotypeApplied(final Stereotype stereotype) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.isStereotypeApplied(stereotype);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#applyStereotype()
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
	 * @see org.eclipse.uml2.uml.Element#unapplyStereotype()
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
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotypes()
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getApplicableStereotypes = new Function<Element, EList<Stereotype>>() {
		public EList<Stereotype> apply(Element s) {
			return s.getApplicableStereotypes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getApplicableStereotype()
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
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplications()
	 * @generated
	 */
	public static final Function<Element, EList<EObject>> getStereotypeApplications = new Function<Element, EList<EObject>>() {
		public EList<EObject> apply(Element s) {
			return s.getStereotypeApplications();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getStereotypeApplication()
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
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotypes()
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getRequiredStereotypes = new Function<Element, EList<Stereotype>>() {
		public EList<Stereotype> apply(Element s) {
			return s.getRequiredStereotypes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getRequiredStereotype()
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
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotypes()
	 * @generated
	 */
	public static final Function<Element, EList<Stereotype>> getAppliedStereotypes = new Function<Element, EList<Stereotype>>() {
		public EList<Stereotype> apply(Element s) {
			return s.getAppliedStereotypes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getAppliedStereotype()
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
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotypes()
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
	 * @see org.eclipse.uml2.uml.Element#getAppliedSubstereotype()
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
	 * @see org.eclipse.uml2.uml.Element#hasValue()
	 * @generated
	 */
	public static Predicate<Element> hasValue(final Stereotype stereotype, final String propertyName) {
		return new Predicate<Element>() {
			public boolean apply(Element s) {
				return s.hasValue(stereotype, propertyName);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Element#getValue()
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
	 * @see org.eclipse.uml2.uml.Element#setValue()
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
	 * @see org.eclipse.uml2.uml.Element#createEAnnotation()
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
	 * @see org.eclipse.uml2.uml.Element#getRelationships()
	 * @generated
	 */
	public static final Function<Element, EList<Relationship>> getRelationships = new Function<Element, EList<Relationship>>() {
		public EList<Relationship> apply(Element s) {
			return s.getRelationships();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getRelationships()
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
	 * @see org.eclipse.uml2.uml.Element#getSourceDirectedRelationships()
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getSourceDirectedRelationships = new Function<Element, EList<DirectedRelationship>>() {
		public EList<DirectedRelationship> apply(Element s) {
			return s.getSourceDirectedRelationships();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getSourceDirectedRelationships()
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
	 * @see org.eclipse.uml2.uml.Element#getTargetDirectedRelationships()
	 * @generated
	 */
	public static final Function<Element, EList<DirectedRelationship>> getTargetDirectedRelationships = new Function<Element, EList<DirectedRelationship>>() {
		public EList<DirectedRelationship> apply(Element s) {
			return s.getTargetDirectedRelationships();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#getTargetDirectedRelationships()
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
	 * @see org.eclipse.uml2.uml.Element#allOwnedElements()
	 * @generated
	 */
	public static final Function<Element, EList<Element>> allOwnedElements = new Function<Element, EList<Element>>() {
		public EList<Element> apply(Element s) {
			return s.allOwnedElements();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Element#mustBeOwned()
	 * @generated
	 */
	public static final Predicate<Element> mustBeOwned = new Predicate<Element>() {
		public boolean apply(Element s) {
			return s.mustBeOwned();
		}
	};

}
