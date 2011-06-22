package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.UseCase;

/**
 * @generated
 */
public class ExtensionPointPath extends RedefinableElementPath {

	/**
	 * @generated
	 */
	private ExtensionPointPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ExtensionPoint#getUseCase()
	 * @generated
	 */
	public static final Function<ExtensionPoint, UseCase> useCase = new Function<ExtensionPoint, UseCase>() {
		public UseCase apply(ExtensionPoint s) {
			return s.getUseCase();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ExtensionPoint#validateMustHaveName()
	 * @generated
	 */
	public static Predicate<ExtensionPoint> validateMustHaveName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ExtensionPoint>() {
			public boolean apply(ExtensionPoint s) {
				return s.validateMustHaveName(diagnostics, context);
			}
		};
	}

}
