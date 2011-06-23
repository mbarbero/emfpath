package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.ecore.ENamedElement;

import com.google.common.base.Function;

/**
 * @generated
 */
public class ENamedElements extends EModelElements {

  /**
   * @generated
   */
   ENamedElements() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.ENamedElement#getName()
   * @generated
   */
  public static final Function<ENamedElement, String> name = new Function<ENamedElement, String>() {
    public String apply(ENamedElement s) {
      return s.getName();
    }
  };


}
