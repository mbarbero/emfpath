package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.UseCase;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.UseCase UseCase} in a functional way.
 * <p>
 * A use case is the specification of a set of actions performed by a system, which yields
 * an observable result that is, typically, of value for one or more actors or other
 * stakeholders of the system. 
 * @see org.eclipse.uml2.uml.UseCase
 * @generated
 */
public class UseCasePath extends BehavioredClassifierPath {

	/**
	 * @generated
	 */
	private UseCasePath() {
    super();
  }

	/**
	 * References the Include relationships owned by this use case. 
	 * @see org.eclipse.uml2.uml.UseCase#getIncludes()
	 * @generated
	 */
	public static final Function<UseCase, EList<Include>> include = new Function<UseCase, EList<Include>>() {
    public EList<Include> apply(UseCase s) {
      return s.getIncludes();
    }
  };

	/**
	 * References the Extend relationships owned by this use case. 
	 * @see org.eclipse.uml2.uml.UseCase#getExtends()
	 * @generated
	 */
	public static final Function<UseCase, EList<Extend>> extend = new Function<UseCase, EList<Extend>>() {
    public EList<Extend> apply(UseCase s) {
      return s.getExtends();
    }
  };

	/**
	 * References the ExtensionPoints owned by the use case. 
	 * @see org.eclipse.uml2.uml.UseCase#getExtensionPoints()
	 * @generated
	 */
	public static final Function<UseCase, EList<ExtensionPoint>> extensionPoint = new Function<UseCase, EList<ExtensionPoint>>() {
    public EList<ExtensionPoint> apply(UseCase s) {
      return s.getExtensionPoints();
    }
  };

	/**
	 * References the subjects to which this use case applies. The subject or its parts realize
	 * all the use cases that apply to this subject. Use cases need not be attached to any
	 * specific subject, however. The subject may, but need not, own the use cases that apply
	 * to it. 
	 * @see org.eclipse.uml2.uml.UseCase#getSubjects()
	 * @generated
	 */
	public static final Function<UseCase, EList<Classifier>> subject = new Function<UseCase, EList<Classifier>>() {
    public EList<Classifier> apply(UseCase s) {
      return s.getSubjects();
    }
  };
	
	/**
	 * A UseCase must have a name.
	self.name -> notEmpty () 
	 * @see org.eclipse.uml2.uml.UseCase#validateMustHaveName(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<UseCase> validateMustHaveName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<UseCase>() {
      public boolean apply(UseCase s) {
        return s.validateMustHaveName(diagnostics, context);
      }
    };
  }

	/**
	 * UseCases can only be involved in binary Associations.
	true 
	 * @see org.eclipse.uml2.uml.UseCase#validateBinaryAssociations(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<UseCase> validateBinaryAssociations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<UseCase>() {
      public boolean apply(UseCase s) {
        return s.validateBinaryAssociations(diagnostics, context);
      }
    };
  }

	/**
	 * UseCases can not have Associations to UseCases specifying the same subject.
	true
	 * @see org.eclipse.uml2.uml.UseCase#validateNoAssociationToUseCase(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<UseCase> validateNoAssociationToUseCase(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<UseCase>() {
      public boolean apply(UseCase s) {
        return s.validateNoAssociationToUseCase(diagnostics, context);
      }
    };
  }

	/**
	 * A use case cannot include use cases that directly or indirectly include it.
	not self.allIncludedUseCases()->includes(self)
	 * @see org.eclipse.uml2.uml.UseCase#validateCannotIncludeSelf(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<UseCase> validateCannotIncludeSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<UseCase>() {
      public boolean apply(UseCase s) {
        return s.validateCannotIncludeSelf(diagnostics, context);
      }
    };
  }

	/**
	 * The query allIncludedUseCases() returns the transitive closure of all use cases (directly
	 * or indirectly) included by this use case.
	result = self.include->union(self.include->collect(in
	 * | in.allIncludedUseCases())) 
	 * @see org.eclipse.uml2.uml.UseCase#allIncludedUseCases()
	 * @generated
	 */
	public static final Function<UseCase, EList<UseCase>> allIncludedUseCases = new Function<UseCase, EList<UseCase>>() {
    public EList<UseCase> apply(UseCase s) {
      return s.allIncludedUseCases();
    }
  };

}
