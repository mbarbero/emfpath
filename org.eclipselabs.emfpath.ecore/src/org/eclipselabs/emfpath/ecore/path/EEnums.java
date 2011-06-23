package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

import com.google.common.base.Function;

/**
 * @generated
 */
public class EEnums extends EDataTypes {

  /**
   * @generated
   */
  private EEnums() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EEnum#getELiterals()
   * @generated
   */
  public static final Function<EEnum, EList<EEnumLiteral>> eLiterals = new Function<EEnum, EList<EEnumLiteral>>() {
    public EList<EEnumLiteral> apply(EEnum s) {
      return s.getELiterals();
    }
  };

  /**
   * 
   * @see org.eclipse.emf.ecore.EEnum#getEEnumLiteral(String)
   * @generated
   */
  public static Function<EEnum, EEnumLiteral> getEEnumLiteral(final String name) {
    return new Function<EEnum, EEnumLiteral>() {
      public EEnumLiteral apply(EEnum s) {
        return s.getEEnumLiteral(name);
      }
    };
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EEnum#getEEnumLiteral(int)
   * @generated
   */
  public static Function<EEnum, EEnumLiteral> getEEnumLiteral(final int value) {
    return new Function<EEnum, EEnumLiteral>() {
      public EEnumLiteral apply(EEnum s) {
        return s.getEEnumLiteral(value);
      }
    };
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EEnum#getEEnumLiteralByLiteral(String)
   * @generated
   */
  public static Function<EEnum, EEnumLiteral> getEEnumLiteralByLiteral(final String literal) {
    return new Function<EEnum, EEnumLiteral>() {
      public EEnumLiteral apply(EEnum s) {
        return s.getEEnumLiteralByLiteral(literal);
      }
    };
  }

}
