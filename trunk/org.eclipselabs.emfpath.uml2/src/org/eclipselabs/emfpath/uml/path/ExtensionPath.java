package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;

/**
 * @generated
 */
public class ExtensionPath extends AssociationPath {

	/**
	 * @generated
	 */
	private ExtensionPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Extension#isRequired()
	 * @generated
	 */
	public static final Predicate<Extension> isRequired = new Predicate<Extension>() {
		public boolean apply(Extension s) {
			return s.isRequired();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Extension#getMetaclass()
	 * @generated
	 */
	public static final Function<Extension, Class> metaclass = new Function<Extension, Class>() {
		public Class apply(Extension s) {
			return s.getMetaclass();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Extension#validateNonOwnedEnd()
	 * @generated
	 */
	public static Predicate<Extension> validateNonOwnedEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Extension>() {
			public boolean apply(Extension s) {
				return s.validateNonOwnedEnd(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Extension#validateIsBinary()
	 * @generated
	 */
	public static Predicate<Extension> validateIsBinary(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Extension>() {
			public boolean apply(Extension s) {
				return s.validateIsBinary(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Extension#getStereotypeEnd()
	 * @generated
	 */
	public static final Function<Extension, Property> getStereotypeEnd = new Function<Extension, Property>() {
		public Property apply(Extension s) {
			return s.getStereotypeEnd();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Extension#getStereotype()
	 * @generated
	 */
	public static final Function<Extension, Stereotype> getStereotype = new Function<Extension, Stereotype>() {
		public Stereotype apply(Extension s) {
			return s.getStereotype();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Extension#metaclassEnd()
	 * @generated
	 */
	public static final Function<Extension, Property> metaclassEnd = new Function<Extension, Property>() {
		public Property apply(Extension s) {
			return s.metaclassEnd();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Extension#getMetaclass()
	 * @generated
	 */
	public static final Function<Extension, Class> getMetaclass = new Function<Extension, Class>() {
		public Class apply(Extension s) {
			return s.getMetaclass();
		}
	};

}
