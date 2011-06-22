package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.ComponentRealization;

/**
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
	 * @see org.eclipse.uml2.uml.ComponentRealization#getAbstraction()
	 * @generated
	 */
	public static final Function<ComponentRealization, Component> abstraction = new Function<ComponentRealization, Component>() {
		public Component apply(ComponentRealization s) {
			return s.getAbstraction();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.ComponentRealization#getRealizingClassifiers()
	 * @generated
	 */
	public static final Function<ComponentRealization, EList<Classifier>> realizingClassifier = new Function<ComponentRealization, EList<Classifier>>() {
		public EList<Classifier> apply(ComponentRealization s) {
			return s.getRealizingClassifiers();
		}
	};
	
	

}
