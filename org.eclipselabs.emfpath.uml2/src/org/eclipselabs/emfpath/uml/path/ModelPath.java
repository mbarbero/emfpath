package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import org.eclipse.uml2.uml.Model;

/**
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
	 * @see org.eclipse.uml2.uml.Model#getViewpoint()
	 * @generated
	 */
	public static final Function<Model, String> viewpoint = new Function<Model, String>() {
		public String apply(Model s) {
			return s.getViewpoint();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Model#isMetamodel()
	 * @generated
	 */
	public static final Predicate<Model> isMetamodel = new Predicate<Model>() {
		public boolean apply(Model s) {
			return s.isMetamodel();
		}
	};

}
