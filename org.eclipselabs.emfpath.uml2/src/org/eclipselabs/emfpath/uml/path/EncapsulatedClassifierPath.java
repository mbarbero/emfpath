package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Port;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.EncapsulatedClassifier EncapsulatedClassifier} in a functional way.
 * <p>
 * A classifier has the ability to own ports as specific and type checked interaction
 * points. 
 * @see org.eclipse.uml2.uml.EncapsulatedClassifier
 * @generated
 */
public class EncapsulatedClassifierPath extends StructuredClassifierPath {

	/**
	 * @generated
	 */
	 EncapsulatedClassifierPath() {
    super();
  }

	/**
	 * References a set of ports that an encapsulated classifier owns. 
	 * @see org.eclipse.uml2.uml.EncapsulatedClassifier#getOwnedPorts()
	 * @generated
	 */
	public static final Function<EncapsulatedClassifier, EList<Port>> ownedPort = new Function<EncapsulatedClassifier, EList<Port>>() {
    public EList<Port> apply(EncapsulatedClassifier s) {
      return s.getOwnedPorts();
    }
  };
	
	

}
