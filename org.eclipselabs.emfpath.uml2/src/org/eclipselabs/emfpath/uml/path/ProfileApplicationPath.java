package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;

/**
 * @generated
 */
public class ProfileApplicationPath extends DirectedRelationshipPath {

	/**
	 * @generated
	 */
	private ProfileApplicationPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ProfileApplication#getAppliedProfile()
	 * @generated
	 */
	public static final Function<ProfileApplication, Profile> appliedProfile = new Function<ProfileApplication, Profile>() {
		public Profile apply(ProfileApplication s) {
			return s.getAppliedProfile();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ProfileApplication#isStrict()
	 * @generated
	 */
	public static final Predicate<ProfileApplication> isStrict = new Predicate<ProfileApplication>() {
		public boolean apply(ProfileApplication s) {
			return s.isStrict();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ProfileApplication#getApplyingPackage()
	 * @generated
	 */
	public static final Function<ProfileApplication, Package> applyingPackage = new Function<ProfileApplication, Package>() {
		public Package apply(ProfileApplication s) {
			return s.getApplyingPackage();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition()
	 * @generated
	 */
	public static final Function<ProfileApplication, EPackage> getAppliedDefinition = new Function<ProfileApplication, EPackage>() {
		public EPackage apply(ProfileApplication s) {
			return s.getAppliedDefinition();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition()
	 * @generated
	 */
	public static Function<ProfileApplication, ENamedElement> getAppliedDefinition(final NamedElement namedElement) {
		return new Function<ProfileApplication, ENamedElement>() {
			public ENamedElement apply(ProfileApplication s) {
				return s.getAppliedDefinition(namedElement);
			}
		};
	}

}
