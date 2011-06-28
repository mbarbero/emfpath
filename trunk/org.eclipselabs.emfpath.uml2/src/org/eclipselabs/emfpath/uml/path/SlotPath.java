package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.ValueSpecification;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Slot Slot} in a functional way.
 * <p>
 * A slot specifies that an entity modeled by an instance specification has a value or
 * values for a specific structural feature. 
 * @see org.eclipse.uml2.uml.Slot
 * @generated
 */
public class SlotPath extends ElementPath {

	/**
	 * @generated
	 */
	private SlotPath() {
    super();
  }

	/**
	 * The structural feature that specifies the values that may be held by the slot. 
	 * @see org.eclipse.uml2.uml.Slot#getDefiningFeature()
	 * @generated
	 */
	public static final Function<Slot, StructuralFeature> definingFeature = new Function<Slot, StructuralFeature>() {
    public StructuralFeature apply(Slot s) {
      return s.getDefiningFeature();
    }
  };

	/**
	 * The value or values corresponding to the defining feature for the owning instance
	 * specification. 
	 * @see org.eclipse.uml2.uml.Slot#getValues()
	 * @generated
	 */
	public static final Function<Slot, EList<ValueSpecification>> value = new Function<Slot, EList<ValueSpecification>>() {
    public EList<ValueSpecification> apply(Slot s) {
      return s.getValues();
    }
  };

	/**
	 * The instance specification that owns this slot. 
	 * @see org.eclipse.uml2.uml.Slot#getOwningInstance()
	 * @generated
	 */
	public static final Function<Slot, InstanceSpecification> owningInstance = new Function<Slot, InstanceSpecification>() {
    public InstanceSpecification apply(Slot s) {
      return s.getOwningInstance();
    }
  };
	
	

}
