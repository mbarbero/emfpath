package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndData;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.QualifierValue;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LinkEndData LinkEndData} in a functional way.
 * <p>
 * A link end data is not an action. It is an element that identifies links. It identifies
 * one end of a link to be read or written by the children of a link action. A link cannot
 * be passed as a runtime value to or from an action. Instead, a link is identified by
 * its end objects and qualifier values, if any. This requires more than one piece of
 * data, namely, the statically-specified end in the user model, the object on the end,
 * and the qualifier values for that end, if any. These pieces are brought together around
 * a link end data. Each association end is identified separately with an instance of
 * the LinkEndData class. 
 * @see org.eclipse.uml2.uml.LinkEndData
 * @generated
 */
public class LinkEndDataPath extends ElementPath {

	/**
	 * @generated
	 */
	 LinkEndDataPath() {
    super();
  }

	/**
	 * Input pin that provides the specified object for the given end. This pin is omitted
	 * if the link-end data specifies an 'open' end for reading. 
	 * @see org.eclipse.uml2.uml.LinkEndData#getValue()
	 * @generated
	 */
	public static final Function<LinkEndData, InputPin> value = new Function<LinkEndData, InputPin>() {
    public InputPin apply(LinkEndData s) {
      return s.getValue();
    }
  };

	/**
	 * Association end for which this link-end data specifies values. 
	 * @see org.eclipse.uml2.uml.LinkEndData#getEnd()
	 * @generated
	 */
	public static final Function<LinkEndData, Property> end = new Function<LinkEndData, Property>() {
    public Property apply(LinkEndData s) {
      return s.getEnd();
    }
  };

	/**
	 * List of qualifier values 
	 * @see org.eclipse.uml2.uml.LinkEndData#getQualifiers()
	 * @generated
	 */
	public static final Function<LinkEndData, EList<QualifierValue>> qualifier = new Function<LinkEndData, EList<QualifierValue>>() {
    public EList<QualifierValue> apply(LinkEndData s) {
      return s.getQualifiers();
    }
  };
	
	/**
	 * The property must be an association end.
	self.end.association->size() = 1 
	 * @see org.eclipse.uml2.uml.LinkEndData#validatePropertyIsAssociationEnd(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LinkEndData> validatePropertyIsAssociationEnd(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LinkEndData>() {
      public boolean apply(LinkEndData s) {
        return s.validatePropertyIsAssociationEnd(diagnostics, context);
      }
    };
  }

	/**
	 * The type of the end object input pin is the same as the type of the association end.
	self.value.type
	 * = self.end.type 
	 * @see org.eclipse.uml2.uml.LinkEndData#validateSameType(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LinkEndData> validateSameType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LinkEndData>() {
      public boolean apply(LinkEndData s) {
        return s.validateSameType(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the end object input pin must be 1..1.
	self.value.multiplicity.is(1,1)
	 * @see org.eclipse.uml2.uml.LinkEndData#validateMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LinkEndData> validateMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LinkEndData>() {
      public boolean apply(LinkEndData s) {
        return s.validateMultiplicity(diagnostics, context);
      }
    };
  }

	/**
	 * The qualifiers include all and only the qualifiers of the association end.
	self.qualifier->collect(qualifier)
	 * = self.end.qualifier 
	 * @see org.eclipse.uml2.uml.LinkEndData#validateQualifiers(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LinkEndData> validateQualifiers(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LinkEndData>() {
      public boolean apply(LinkEndData s) {
        return s.validateQualifiers(diagnostics, context);
      }
    };
  }

	/**
	 * The end object input pin is not also a qualifier value input pin.
	self.value->excludesAll(self.qualifier.value)
	 * @see org.eclipse.uml2.uml.LinkEndData#validateEndObjectInputPin(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<LinkEndData> validateEndObjectInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<LinkEndData>() {
      public boolean apply(LinkEndData s) {
        return s.validateEndObjectInputPin(diagnostics, context);
      }
    };
  }

}
