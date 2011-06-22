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
	 * @see org.eclipse.uml2.uml.Stereotype#getIcons()
	 * @generated
	 */
	public static final Function<Stereotype, EList<Image>> icon = new Function<Stereotype, EList<Image>>() {
		public EList<Image> apply(Stereotype s) {
			return s.getIcons();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Stereotype#validateNameNotClash()
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
	 * @see org.eclipse.uml2.uml.Stereotype#validateGeneralize()
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
	 * @see org.eclipse.uml2.uml.Stereotype#createExtension()
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
	 * @see org.eclipse.uml2.uml.Stereotype#getProfile()
	 * @generated
	 */
	public static final Function<Stereotype, Profile> getProfile = new Function<Stereotype, Profile>() {
		public Profile apply(Stereotype s) {
			return s.getProfile();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Stereotype#getKeyword()
	 * @generated
	 */
	public static final Function<Stereotype, String> getKeyword = new Function<Stereotype, String>() {
		public String apply(Stereotype s) {
			return s.getKeyword();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Stereotype#getKeyword()
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
	 * @see org.eclipse.uml2.uml.Stereotype#getExtendedMetaclasses()
	 * @generated
	 */
	public static final Function<Stereotype, EList<Class>> getExtendedMetaclasses = new Function<Stereotype, EList<Class>>() {
		public EList<Class> apply(Stereotype s) {
			return s.getExtendedMetaclasses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Stereotype#getAllExtendedMetaclasses()
	 * @generated
	 */
	public static final Function<Stereotype, EList<Class>> getAllExtendedMetaclasses = new Function<Stereotype, EList<Class>>() {
		public EList<Class> apply(Stereotype s) {
			return s.getAllExtendedMetaclasses();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Stereotype#getDefinition()
	 * @generated
	 */
	public static final Function<Stereotype, EClass> getDefinition = new Function<Stereotype, EClass>() {
		public EClass apply(Stereotype s) {
			return s.getDefinition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Stereotype#createIcon()
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
	 * @see org.eclipse.uml2.uml.Stereotype#createIcon()
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
