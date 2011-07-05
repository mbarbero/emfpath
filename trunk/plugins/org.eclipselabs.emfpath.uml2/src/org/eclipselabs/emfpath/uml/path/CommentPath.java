package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Comment Comment} in a functional way.
 * <p>
 * A comment is a textual annotation that can be attached to a set of elements. 
 * @see org.eclipse.uml2.uml.Comment
 * @generated
 */
public class CommentPath extends ElementPath {

	/**
	 * @generated
	 */
	private CommentPath() {
    super();
  }

	/**
	 * Specifies a string that is the comment. 
	 * @see org.eclipse.uml2.uml.Comment#getBody()
	 * @generated
	 */
	public static final Function<Comment, String> body = new Function<Comment, String>() {
    public String apply(Comment s) {
      return s.getBody();
    }
  };

	/**
	 * References the Element(s) being commented. 
	 * @see org.eclipse.uml2.uml.Comment#getAnnotatedElements()
	 * @generated
	 */
	public static final Function<Comment, EList<Element>> annotatedElement = new Function<Comment, EList<Element>>() {
    public EList<Element> apply(Comment s) {
      return s.getAnnotatedElements();
    }
  };
	
	

}
