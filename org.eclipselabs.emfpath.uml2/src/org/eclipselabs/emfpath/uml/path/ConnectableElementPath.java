package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.ConnectorEnd;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.TemplateParameter;

/**
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
	 * @see org.eclipse.uml2.uml.ParameterableElement#getOwningTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> owningTemplateParameter = ParameterableElementPath.owningTemplateParameter;

	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#getTemplateParameter()
	 * @generated
	 */
	public static final Function<ParameterableElement, TemplateParameter> templateParameter = ParameterableElementPath.templateParameter;

	/**
	 * @see org.eclipse.uml2.uml.ConnectableElement#getEnds()
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> end = new Function<ConnectableElement, EList<ConnectorEnd>>() {
		public EList<ConnectorEnd> apply(ConnectableElement s) {
			return s.getEnds();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ParameterableElement#isCompatibleWith()
	 * @generated
	 */
	public static Predicate<ParameterableElement> isCompatibleWith(final ParameterableElement p) {
		return ParameterableElementPath.isCompatibleWith(p);
	}

	/**
	 * @see org.eclipse.uml2.uml.ConnectableElement#getEnds()
	 * @generated
	 */
	public static final Function<ConnectableElement, EList<ConnectorEnd>> getEnds = new Function<ConnectableElement, EList<ConnectorEnd>>() {
		public EList<ConnectorEnd> apply(ConnectableElement s) {
			return s.getEnds();
		}
	};

}
