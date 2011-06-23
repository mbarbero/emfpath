package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EParameters extends ETypedElements {

  /**
   * @generated
   */
  private EParameters() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EParameter#getEOperation()
   * @generated
   */
  public static final Function<EParameter, EOperation> eOperation = new Function<EParameter, EOperation>() {
    public EOperation apply(EParameter s) {
      return s.getEOperation();
    }
  };

	
}
