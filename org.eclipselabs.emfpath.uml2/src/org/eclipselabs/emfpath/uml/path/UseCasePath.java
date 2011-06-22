package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.UseCase;

/**
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
	 * @see org.eclipse.uml2.uml.UseCase#getIncludes()
	 * @generated
	 */
	public static final Function<UseCase, EList<Include>> include = new Function<UseCase, EList<Include>>() {
		public EList<Include> apply(UseCase s) {
			return s.getIncludes();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.UseCase#getExtends()
	 * @generated
	 */
	public static final Function<UseCase, EList<Extend>> extend = new Function<UseCase, EList<Extend>>() {
		public EList<Extend> apply(UseCase s) {
			return s.getExtends();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.UseCase#getExtensionPoints()
	 * @generated
	 */
	public static final Function<UseCase, EList<ExtensionPoint>> extensionPoint = new Function<UseCase, EList<ExtensionPoint>>() {
		public EList<ExtensionPoint> apply(UseCase s) {
			return s.getExtensionPoints();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.UseCase#getSubjects()
	 * @generated
	 */
	public static final Function<UseCase, EList<Classifier>> subject = new Function<UseCase, EList<Classifier>>() {
		public EList<Classifier> apply(UseCase s) {
			return s.getSubjects();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.UseCase#validateMustHaveName()
	 * @generated
	 */
	public static Predicate<UseCase> validateMustHaveName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UseCase>() {
			public boolean apply(UseCase s) {
				return s.validateMustHaveName(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.UseCase#validateBinaryAssociations()
	 * @generated
	 */
	public static Predicate<UseCase> validateBinaryAssociations(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UseCase>() {
			public boolean apply(UseCase s) {
				return s.validateBinaryAssociations(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.UseCase#validateNoAssociationToUseCase()
	 * @generated
	 */
	public static Predicate<UseCase> validateNoAssociationToUseCase(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UseCase>() {
			public boolean apply(UseCase s) {
				return s.validateNoAssociationToUseCase(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.UseCase#validateCannotIncludeSelf()
	 * @generated
	 */
	public static Predicate<UseCase> validateCannotIncludeSelf(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<UseCase>() {
			public boolean apply(UseCase s) {
				return s.validateCannotIncludeSelf(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.UseCase#allIncludedUseCases()
	 * @generated
	 */
	public static final Function<UseCase, EList<UseCase>> allIncludedUseCases = new Function<UseCase, EList<UseCase>>() {
		public EList<UseCase> apply(UseCase s) {
			return s.allIncludedUseCases();
		}
	};

}
