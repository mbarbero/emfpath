package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Element;

/**
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
	 * @see org.eclipse.uml2.uml.Comment#getBody()
	 * @generated
	 */
	public static final Function<Comment, String> body = new Function<Comment, String>() {
		public String apply(Comment s) {
			return s.getBody();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Comment#getAnnotatedElements()
	 * @generated
	 */
	public static final Function<Comment, EList<Element>> annotatedElement = new Function<Comment, EList<Element>>() {
		public EList<Element> apply(Comment s) {
			return s.getAnnotatedElements();
		}
	};
	
	

}
