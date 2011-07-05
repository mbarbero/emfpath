package org.eclipselabs.emfpath.uml.path;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.FunctionBehavior;
import org.eclipselabs.emfpath.base.ComposablePredicate;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.FunctionBehavior FunctionBehavior} in a functional way.
 * <p>
 * A function behavior is an opaque behavior that does not access or modify any objects
 * or other external data. 
 * @see org.eclipse.uml2.uml.FunctionBehavior
 * @generated
 */
public class FunctionBehaviorPath extends OpaqueBehaviorPath {

	/**
	 * @generated
	 */
	private FunctionBehaviorPath() {
    super();
  }

	
	
	/**
	 * A function behavior has at least one output parameter.
	self.ownedParameters->
	 
	 * select(p | p.direction=#out or p.direction=#inout or p.direction=#return)->size()
	 * >= 1 
	 * @see org.eclipse.uml2.uml.FunctionBehavior#validateOneOutputParameter(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<FunctionBehavior> validateOneOutputParameter(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<FunctionBehavior>() {
      public boolean apply(FunctionBehavior s) {
        return s.validateOneOutputParameter(diagnostics, context);
      }
    };
  }

	/**
	 * The types of parameters are all data types, which may not nest anything but other
	 * datatypes.
	def: hasAllDataTypeAttributes(d : DataType) : Boolean =
	  d.ownedAttribute->forAll(a
	 * |
	    a.type.oclIsTypeOf(DataType) and
	      hasAllDataTypeAttributes(a.type))
	self.ownedParameters->forAll(p
	 * | p.type.notEmpty() and
	  p.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p))
	 * @see org.eclipse.uml2.uml.FunctionBehavior#validateTypesOfParameters(DiagnosticChain, Map)
	 * @generated
	 */
	public static ComposablePredicate<FunctionBehavior> validateTypesOfParameters(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
    return new ComposablePredicate<FunctionBehavior>() {
      public boolean apply(FunctionBehavior s) {
        return s.validateTypesOfParameters(diagnostics, context);
      }
    };
  }

}
