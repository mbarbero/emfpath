package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ComponentRealization ComponentRealization} in a functional way.
 * <p>
 * The realization concept is specialized to (optionally) define the classifiers that
 * realize the contract offered by a component in terms of its provided and required
 * interfaces. The component forms an abstraction from these various classifiers. 
 * @see org.eclipse.uml2.uml.ComponentRealization
 * @generated
 */
public class ComponentRealizationPath extends RealizationPath {

	/**
	 * @generated
	 */
	private ComponentRealizationPath() {
		super();
	}

	/**
	 * The Component that owns this ComponentRealization and which is implemented by its
	 * realizing classifiers. 
	 * @see org.eclipse.uml2.uml.ComponentRealization#getAbstraction()
	 * @generated
	 */
	public static final Function<ComponentRealization, Component> abstraction = new Function<ComponentRealization, Component>() {
		public Component apply(ComponentRealization s) {
			return s.getAbstraction();
		}
	};

	/**
	 * The classifiers that are involved in the implementation of the Component that owns
	 * this Realization. 
	 * @see org.eclipse.uml2.uml.ComponentRealization#getRealizingClassifiers()
	 * @generated
	 */
	public static final Function<ComponentRealization, EList<Classifier>> realizingClassifier = new Function<ComponentRealization, EList<Classifier>>() {
		public EList<Classifier> apply(ComponentRealization s) {
			return s.getRealizingClassifiers();
		}
	};
	
	

}
