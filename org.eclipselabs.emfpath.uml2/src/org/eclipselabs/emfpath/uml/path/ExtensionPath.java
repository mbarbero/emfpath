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
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Extension Extension} in a functional way.
 * <p>
 * An extension is used to indicate that the properties of a metaclass are extended through
 * a stereotype, and gives the ability to flexibly add (and later remove) stereotypes
 * to classes. 
 * @see org.eclipse.uml2.uml.Extension
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
	 * Indicates whether an instance of the extending stereotype must be created when an
	 * instance of the extended class is created. The attribute value is derived from the
	 * multiplicity of the Property referenced by Extension::ownedEnd; a multiplicity of
	 * 1 means that isRequired is true, but otherwise it is false. Since the default multiplicity
	 * of an ExtensionEnd is 0..1, the default value of isRequired is false. 
	 * @see org.eclipse.uml2.uml.Extension#isRequired()
	 * @generated
	 */
	public static final Predicate<Extension> isRequired = new Predicate<Extension>() {
		public boolean apply(Extension s) {
			return s.isRequired();
		}
	};

	/**
	 * References the Class that is extended through an Extension. The property is derived
	 * from the type of the memberEnd that is not the ownedEnd. 
	 * @see org.eclipse.uml2.uml.Extension#getMetaclass()
	 * @generated
	 */
	public static final Function<Extension, Class> metaclass = new Function<Extension, Class>() {
		public Class apply(Extension s) {
			return s.getMetaclass();
		}
	};
	
	/**
	 * The non-owned end of an Extension is typed by a Class.
	metaclassEnd()->notEmpty()
	 * and metaclass()->oclIsKindOf(Class) 
	 * @see org.eclipse.uml2.uml.Extension#validateNonOwnedEnd(DiagnosticChain, Map)
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
	 * An Extension is binary, i.e., it has only two memberEnds.
	memberEnd->size() = 2 
	 * @see org.eclipse.uml2.uml.Extension#validateIsBinary(DiagnosticChain, Map)
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
	 * Retrieves the extension end that is typed by a stereotype (as opposed to a metaclass).
	 * @see org.eclipse.uml2.uml.Extension#getStereotypeEnd()
	 * @generated
	 */
	public static final Function<Extension, Property> getStereotypeEnd = new Function<Extension, Property>() {
		public Property apply(Extension s) {
			return s.getStereotypeEnd();
		}
	};

	/**
	 * Retrieves the stereotype that extends a metaclass through this extension. 
	 * @see org.eclipse.uml2.uml.Extension#getStereotype()
	 * @generated
	 */
	public static final Function<Extension, Stereotype> getStereotype = new Function<Extension, Stereotype>() {
		public Stereotype apply(Extension s) {
			return s.getStereotype();
		}
	};

	/**
	 * The query metaclassEnd() returns the Property that is typed by a metaclass (as opposed
	 * to a stereotype).
	result = memberEnd->reject(ownedEnd) 
	 * @see org.eclipse.uml2.uml.Extension#metaclassEnd()
	 * @generated
	 */
	public static final Function<Extension, Property> metaclassEnd = new Function<Extension, Property>() {
		public Property apply(Extension s) {
			return s.metaclassEnd();
		}
	};

	/**
	 * The query metaclass() returns the metaclass that is being extended (as opposed to
	 * the extending stereotype).
	result = metaclassEnd().type 
	 * @see org.eclipse.uml2.uml.Extension#getMetaclass()
	 * @generated
	 */
	public static final Function<Extension, Class> getMetaclass = new Function<Extension, Class>() {
		public Class apply(Extension s) {
			return s.getMetaclass();
		}
	};

}
