package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.UseCase;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ExtensionPoint ExtensionPoint} in a functional way.
 * <p>
 * An extension point identifies a point in the behavior of a use case where that behavior
 * can be extended by the behavior of some other (extending) use case, as specified by
 * an extend relationship. 
 * @see org.eclipse.uml2.uml.ExtensionPoint
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
	 * References the use case that owns this extension point. 
	 * @see org.eclipse.uml2.uml.ExtensionPoint#getUseCase()
	 * @generated
	 */
	public static final Function<ExtensionPoint, UseCase> useCase = new Function<ExtensionPoint, UseCase>() {
		public UseCase apply(ExtensionPoint s) {
			return s.getUseCase();
		}
	};
	
	/**
	 * An ExtensionPoint must have a name.
	self.name->notEmpty () 
	 * @see org.eclipse.uml2.uml.ExtensionPoint#validateMustHaveName(DiagnosticChain, Map)
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
