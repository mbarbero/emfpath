package org.eclipselabs.emfpath.uml.path;

import org.eclipse.uml2.uml.Image;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Image Image} in a functional way.
 * <p>
 * Physical definition of a graphical image. 
 * @see org.eclipse.uml2.uml.Image
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
	 * This contains the serialization of the image according to the format. The value could
	 * represent a bitmap, image such as a GIF file, or drawing 'instructions' using a standard
	 * such as Scalable Vector Graphic (SVG) (which is XML based). 
	 * @see org.eclipse.uml2.uml.Image#getContent()
	 * @generated
	 */
	public static final Function<Image, String> content = new Function<Image, String>() {
    public String apply(Image s) {
      return s.getContent();
    }
  };

	/**
	 * This contains a location that can be used by a tool to locate the image as an alternative
	 * to embedding it in the stereotype. 
	 * @see org.eclipse.uml2.uml.Image#getLocation()
	 * @generated
	 */
	public static final Function<Image, String> location = new Function<Image, String>() {
    public String apply(Image s) {
      return s.getLocation();
    }
  };

	/**
	 * This indicates the format of the content - which is how the string content should
	 * be interpreted. The following values are reserved: SVG, GIF, PNG, JPG, WMF, EMF, BMP.
	
	In
	 * addition the prefix 'MIME: ' is also reserved. This option can be used as an alternative
	 * to express the reserved values above, for example "SVG" could instead be expressed
	 * as "MIME: image/svg+xml". 
	 * @see org.eclipse.uml2.uml.Image#getFormat()
	 * @generated
	 */
	public static final Function<Image, String> format = new Function<Image, String>() {
    public String apply(Image s) {
      return s.getFormat();
    }
  };
	
	

}
