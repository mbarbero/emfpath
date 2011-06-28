package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ProfileApplication ProfileApplication} in a functional way.
 * <p>
 * A profile application is used to show which profiles have been applied to a package.
 * @see org.eclipse.uml2.uml.ProfileApplication
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
	 * References the Profiles that are applied to a Package through this ProfileApplication.
	 * @see org.eclipse.uml2.uml.ProfileApplication#getAppliedProfile()
	 * @generated
	 */
	public static final Function<ProfileApplication, Profile> appliedProfile = new Function<ProfileApplication, Profile>() {
    public Profile apply(ProfileApplication s) {
      return s.getAppliedProfile();
    }
  };

	/**
	 * Specifies that the Profile filtering rules for the metaclasses of the referenced metamodel
	 * shall be strictly applied. 
	 * @see org.eclipse.uml2.uml.ProfileApplication#isStrict()
	 * @generated
	 */
	public static final ComposablePredicate<ProfileApplication> isStrict = new ComposablePredicate<ProfileApplication>() {
    public boolean apply(ProfileApplication s) {
      return s.isStrict();
    }
  };

	/**
	 * The package that owns the profile application. 
	 * @see org.eclipse.uml2.uml.ProfileApplication#getApplyingPackage()
	 * @generated
	 */
	public static final Function<ProfileApplication, Package> applyingPackage = new Function<ProfileApplication, Package>() {
    public Package apply(ProfileApplication s) {
      return s.getApplyingPackage();
    }
  };
	
	/**
	 * Retrieves the definition (Ecore representation) of the profile associated with this
	 * profile application. 
	 * @see org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition()
	 * @generated
	 */
	public static final Function<ProfileApplication, EPackage> getAppliedDefinition = new Function<ProfileApplication, EPackage>() {
    public EPackage apply(ProfileApplication s) {
      return s.getAppliedDefinition();
    }
  };

	/**
	 * Retrieves the definition (Ecore representation) of the specified named element in
	 * the profile associated with this profile application. 
	 * @see org.eclipse.uml2.uml.ProfileApplication#getAppliedDefinition(NamedElement)
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
