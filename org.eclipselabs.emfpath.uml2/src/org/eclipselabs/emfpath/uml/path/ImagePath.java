package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	

import org.eclipse.uml2.uml.Image;

/**
 * @generated
 */
public class ImagePath extends ElementPath {

	/**
	 * @generated
	 */
	private ImagePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Image#getContent()
	 * @generated
	 */
	public static final Function<Image, String> content = new Function<Image, String>() {
		public String apply(Image s) {
			return s.getContent();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Image#getLocation()
	 * @generated
	 */
	public static final Function<Image, String> location = new Function<Image, String>() {
		public String apply(Image s) {
			return s.getLocation();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Image#getFormat()
	 * @generated
	 */
	public static final Function<Image, String> format = new Function<Image, String>() {
		public String apply(Image s) {
			return s.getFormat();
		}
	};
	
	

}
