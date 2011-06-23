package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;

import com.google.common.base.Function;

/**
 * @generated
 */
public class ETypeParameters extends ENamedElements {

  /**
   * @generated
   */
  private ETypeParameters() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.ETypeParameter#getEBounds()
   * @generated
   */
  public static final Function<ETypeParameter, EList<EGenericType>> eBounds = new Function<ETypeParameter, EList<EGenericType>>() {
    public EList<EGenericType> apply(ETypeParameter s) {
      return s.getEBounds();
    }
  };

}
