package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ConnectableElement ConnectableElement} in a functional way.
 * <p>
 * ConnectableElement is an abstract metaclass representing a set of instances that play
 * roles of a classifier. Connectable elements may be joined by attached connectors and
 * specify configurations of linked instances to be created within an instance of the
 * containing classifier.
A connectable element may be exposed as a connectable element
 * template parameter. 
 * @see org.eclipse.uml2.uml.ConnectableElement
 * @generated
 */
public class ConnectableElementPath extends TypedElementPath {

	/**
	 * @generated
	 */
	 ConnectableElementPath() {
		super();
	}

	/**
	 * The formal template parameter that owns this element. 
	 *
	 * @see ParameterableElementPath#owningTemplateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * The template parameter that exposes this element as a formal parameter. 
	 *
	 * @see ParameterableElementPath#templateParameter()
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * Denotes a connector that attaches to this connectable element. 
	 * @see org.eclipse.uml2.uml.ConnectableElement#getEnds()
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> end = new Function<ConnectableElement, EList<ConnectorEnd>>() {
		public EList<ConnectorEnd> apply(ConnectableElement s) {
			return s.getEnds();
		}
	};
	
	/**
	 * The query isCompatibleWith() determines if this parameterable element is compatible
	 * with the specified parameterable element. By default parameterable element P is compatible
	 * with parameterable element Q if the kind of P is the same or a subtype as the kind
	 * of Q. Subclasses should override this operation to specify different compatibility
	 * constraints.
	result = p->oclIsKindOf(self.oclType) 
	 *
	 * @see ParameterableElementPath#isCompatibleWith()
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith(ParameterableElement)
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * result = ConnectorEnd.allInstances()->select(e | e.role=self) 
	 * @see org.eclipse.uml2.uml.ConnectableElement#getEnds()
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> getEnds = new Function<ConnectableElement, EList<ConnectorEnd>>() {
		public EList<ConnectorEnd> apply(ConnectableElement s) {
			return s.getEnds();
		}
	};

}
