package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EEnumLiterals extends ENamedElements {

  /**
   * @generated
   */
  private EEnumLiterals() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EEnumLiteral#getValue()
   * @generated
   */
  public static final Function<EEnumLiteral, java.lang.Integer> value = new Function<EEnumLiteral, java.lang.Integer>() {
    public java.lang.Integer apply(EEnumLiteral s) {
      return s.getValue();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EEnumLiteral#getInstance()
   * @generated
   */
  public static final Function<EEnumLiteral, Enumerator> instance = new Function<EEnumLiteral, Enumerator>() {
    public Enumerator apply(EEnumLiteral s) {
      return s.getInstance();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EEnumLiteral#getLiteral()
   * @generated
   */
  public static final Function<EEnumLiteral, String> literal = new Function<EEnumLiteral, String>() {
    public String apply(EEnumLiteral s) {
      return s.getLiteral();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EEnumLiteral#getEEnum()
   * @generated
   */
  public static final Function<EEnumLiteral, EEnum> eEnum = new Function<EEnumLiteral, EEnum>() {
    public EEnum apply(EEnumLiteral s) {
      return s.getEEnum();
    }
  };


}
