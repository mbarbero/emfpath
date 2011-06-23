package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Function;


/**
 * Set of {@link com.google.base.Function Function} and {@link com.google.base.PredicatePredicate } 
 * to browse {@link org.eclipse.emf.ecore.EAnnotation EAnnotation} in a functional way. 
 * @generated
 */
public class EAnnotations extends EModelElements {

  /**
   * @generated
   */
  private EAnnotations() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EAnnotation#getSource()
   * @generated
   */
  public static final Function<EAnnotation, String> source = new Function<EAnnotation, String>() {
    public String apply(EAnnotation s) {
      return s.getSource();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EAnnotation#getDetails()
   * @generated
   */
  public static final Function<EAnnotation, EMap<String, String>> details = new Function<EAnnotation, EMap<String, String>>() {
    public EMap<String, String> apply(EAnnotation s) {
      return s.getDetails();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EAnnotation#getEModelElement()
   * @generated
   */
  public static final Function<EAnnotation, EModelElement> eModelElement = new Function<EAnnotation, EModelElement>() {
    public EModelElement apply(EAnnotation s) {
      return s.getEModelElement();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EAnnotation#getContents()
   * @generated
   */
  public static final Function<EAnnotation, EList<EObject>> contents = new Function<EAnnotation, EList<EObject>>() {
    public EList<EObject> apply(EAnnotation s) {
      return s.getContents();
    }
  };
  /**
   * 
   * @see org.eclipse.emf.ecore.EAnnotation#getReferences()
   * @generated
   */
  public static final Function<EAnnotation, EList<EObject>> references = new Function<EAnnotation, EList<EObject>>() {
    public EList<EObject> apply(EAnnotation s) {
      return s.getReferences();
    }
  };
}
