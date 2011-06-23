package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Image;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Stereotype Stereotype} in a functional way.
 * <p>
 * A stereotype defines how an existing metaclass may be extended, and enables the use
 * of platform or domain specific terminology or notation in place of, or in addition
 * to, the ones used for the extended metaclass. 
 * @see org.eclipse.uml2.uml.Stereotype
 * @generated
 */
public class StereotypePath extends ClassPath {

	/**
	 * @generated
	 */
	private StereotypePath() {
		super();
	}

	/**
	 * Stereotype can change the graphical appearance of the extended model element by using
	 * attached icons. When this association is not null, it references the location of the
	 * icon content to be displayed within diagrams presenting the extended model elements.
	 * @see org.eclipse.uml2.uml.Stereotype#getIcons()
	 * @generated
	 */
	public static final Function<Stereotype, EList<Image>> icon = new Function<Stereotype, EList<Image>>() {
		public EList<Image> apply(Stereotype s) {
			return s.getIcons();
		}
	};
	
	/**
	 * Stereotype names should not clash with keyword names for the extended model element.
	true
	 * @see org.eclipse.uml2.uml.Stereotype#validateNameNotClash(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Stereotype> validateNameNotClash(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Stereotype>() {
			public boolean apply(Stereotype s) {
				return s.validateNameNotClash(diagnostics, context);
			}
		};
	}

	/**
	 * A Stereotype may only generalize or specialize another Stereotype.
	generalization.general->forAll(e
	 * |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype))
	 *  
	 * @see org.eclipse.uml2.uml.Stereotype#validateGeneralize(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<Stereotype> validateGeneralize(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<Stereotype>() {
			public boolean apply(Stereotype s) {
				return s.validateGeneralize(diagnostics, context);
			}
		};
	}

	/**
	 * Creates a(n) (required) extension of the specified metaclass with this stereotype.
	 * @see org.eclipse.uml2.uml.Stereotype#createExtension(Class, boolean)
	 * @generated
	 */
	public static Function<Stereotype, Extension> createExtension(final Class metaclass, final boolean isRequired) {
		return new Function<Stereotype, Extension>() {
			public Extension apply(Stereotype s) {
				return s.createExtension(metaclass, isRequired);
			}
		};
	}

	/**
	 * Retrieves the profile that owns this stereotype. 
	 * @see org.eclipse.uml2.uml.Stereotype#getProfile()
	 * @generated
	 */
	public static final Function<Stereotype, Profile> getProfile = new Function<Stereotype, Profile>() {
		public Profile apply(Stereotype s) {
			return s.getProfile();
		}
	};

	/**
	 * Retrieves the localized keyword for this stereotype. 
	 * @see org.eclipse.uml2.uml.Stereotype#getKeyword()
	 * @generated
	 */
	public static final Function<Stereotype, String> getKeyword = new Function<Stereotype, String>() {
		public String apply(Stereotype s) {
			return s.getKeyword();
		}
	};

	/**
	 * Retrieves the keyword for this stereotype, localized if indicated. 
	 * @see org.eclipse.uml2.uml.Stereotype#getKeyword(boolean)
	 * @generated
	 */
	public static Function<Stereotype, String> getKeyword(final boolean localize) {
		return new Function<Stereotype, String>() {
			public String apply(Stereotype s) {
				return s.getKeyword(localize);
			}
		};
	}

	/**
	 * Retrieves the metaclasses extended by this stereotype. 
	 * @see org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses()
	 * @generated
	 */
	public static final Function<Stereotype, EList<Class>> getExtendedMetaclasses = new Function<Stereotype, EList<Class>>() {
		public EList<Class> apply(Stereotype s) {
			return s.getExtendedMetaclasses();
		}
	};

	/**
	 * Retrieves all the metaclasses extended by this stereotype, including the metaclasses
	 * extended by its superstereotypes. 
	 * @see org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses()
	 * @generated
	 */
	public static final Function<Stereotype, EList<Class>> getAllExtendedMetaclasses = new Function<Stereotype, EList<Class>>() {
		public EList<Class> apply(Stereotype s) {
			return s.getAllExtendedMetaclasses();
		}
	};

	/**
	 * Retrieves the current definition (Ecore representation) of this stereotype. 
	 * @see org.eclipse.uml2.uml.Stereotype#getDefinition()
	 * @generated
	 */
	public static final Function<Stereotype, EClass> getDefinition = new Function<Stereotype, EClass>() {
		public EClass apply(Stereotype s) {
			return s.getDefinition();
		}
	};

	/**
	 * Creates an icon with the specified location for this stereotype. 
	 * @see org.eclipse.uml2.uml.Stereotype#createIcon(String)
	 * @generated
	 */
	public static Function<Stereotype, Image> createIcon(final String location) {
		return new Function<Stereotype, Image>() {
			public Image apply(Stereotype s) {
				return s.createIcon(location);
			}
		};
	}

	/**
	 * Creates an icon with the specified format and content for this stereotype. 
	 * @see org.eclipse.uml2.uml.Stereotype#createIcon(String, String)
	 * @generated
	 */
	public static Function<Stereotype, Image> createIcon(final String format, final String content) {
		return new Function<Stereotype, Image>() {
			public Image apply(Stereotype s) {
				return s.createIcon(format, content);
			}
		};
	}

}
