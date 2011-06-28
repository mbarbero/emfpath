package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.ReadVariableAction;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.ReadVariableAction ReadVariableAction} in a functional way.
 * <p>
 * A read variable action is a variable action that retrieves the values of a variable.
 * @see org.eclipse.uml2.uml.ReadVariableAction
 * @generated
 */
public class ReadVariableActionPath extends VariableActionPath {

	/**
	 * @generated
	 */
	private ReadVariableActionPath() {
    super();
  }

	/**
	 * Gives the output pin on which the result is put. 
	 * @see org.eclipse.uml2.uml.ReadVariableAction#getResult()
	 * @generated
	 */
	public static final Function<ReadVariableAction, OutputPin> result = new Function<ReadVariableAction, OutputPin>() {
    public OutputPin apply(ReadVariableAction s) {
      return s.getResult();
    }
  };
	
	/**
	 * The type and ordering of the result output pin of a read-variable action are the same
	 * as the type and ordering of the variable.
	self.result.type =self.variable.type
	and
	 * self.result.ordering = self.variable.ordering
	 
	 * @see org.eclipse.uml2.uml.ReadVariableAction#validateTypeAndOrdering(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadVariableAction> validateTypeAndOrdering(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadVariableAction>() {
      public boolean apply(ReadVariableAction s) {
        return s.validateTypeAndOrdering(diagnostics, context);
      }
    };
  }

	/**
	 * The multiplicity of the variable must be compatible with the multiplicity of the output
	 * pin.
	self.variable.multiplicity.compatibleWith(self.result.multiplicity) 
	 * @see org.eclipse.uml2.uml.ReadVariableAction#validateCompatibleMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<ReadVariableAction> validateCompatibleMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<ReadVariableAction>() {
      public boolean apply(ReadVariableAction s) {
        return s.validateCompatibleMultiplicity(diagnostics, context);
      }
    };
  }

}
