package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.Model;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Model Model} in a functional way.
 * <p>
 * A model captures a view of a physical system. It is an abstraction of the physical
 * system, with a certain purpose. This purpose determines what is to be included in
 * the model and what is irrelevant. Thus the model completely describes those aspects
 * of the physical system that are relevant to the purpose of the model, at the appropriate
 * level of detail. 
 * @see org.eclipse.uml2.uml.Model
 * @generated
 */
public class ModelPath extends PackagePath {

	/**
	 * @generated
	 */
	private ModelPath() {
		super();
	}

	/**
	 * The name of the viewpoint that is expressed by a model (This name may refer to a profile
	 * definition). 
	 * @see org.eclipse.uml2.uml.Model#getViewpoint()
	 * @generated
	 */
	public static final Function<Model, String> viewpoint = new Function<Model, String>() {
		public String apply(Model s) {
			return s.getViewpoint();
		}
	};
	
	/**
	 * Determines whether this model is a metamodel. 
	 * @see org.eclipse.uml2.uml.Model#isMetamodel()
	 * @generated
	 */
	public static final Predicate<Model> isMetamodel = new Predicate<Model>() {
		public boolean apply(Model s) {
			return s.isMetamodel();
		}
	};

}
