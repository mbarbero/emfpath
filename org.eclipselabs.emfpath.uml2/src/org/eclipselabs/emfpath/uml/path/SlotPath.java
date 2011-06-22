package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.ValueSpecification;

/**
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
	 * @see org.eclipse.uml2.uml.Slot#getDefiningFeature()
	 * @generated
	 */
	public static final Function<Slot, StructuralFeature> definingFeature = new Function<Slot, StructuralFeature>() {
		public StructuralFeature apply(Slot s) {
			return s.getDefiningFeature();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Slot#getValues()
	 * @generated
	 */
	public static final Function<Slot, EList<ValueSpecification>> value = new Function<Slot, EList<ValueSpecification>>() {
		public EList<ValueSpecification> apply(Slot s) {
			return s.getValues();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Slot#getOwningInstance()
	 * @generated
	 */
	public static final Function<Slot, InstanceSpecification> owningInstance = new Function<Slot, InstanceSpecification>() {
		public InstanceSpecification apply(Slot s) {
			return s.getOwningInstance();
		}
	};
	
	

}
