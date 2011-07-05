package org.eclipselabs.emfpath.trans;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;

public class SimpleLazyMultiplexer implements IMultiplexer {

	/* (non-Javadoc)
	 * @see api.IMultiplexer#multiplex(api.TransformationInput, java.util.Set)
	 */
	public <E extends ITransformationRule> ImmutableMap<E, Iterable<Map<String, EObject>>> multiplex(TransformationInput input, ImmutableList<? extends E> rules) {
		ImmutableMap.Builder<E, Iterable<Map<String, EObject>>> retBuilder = ImmutableMap.builder(); 

		for (E rule : rules) {
			ISourcePattern sp = rule.sourcePattern();
			Predicate<Map<String, EObject>> joinPredicate = sp.joinPredicate();

			ImmutableMap.Builder<String, Iterable<? extends EObject>> m = ImmutableMap.builder();
			for (final ISourcePatternElement spe : sp.elements()) {
				Iterable<? extends EObject> in = input.get(spe.in());
				Iterable<? extends EObject> filteredInput = Iterables.filter(in, spe.predicate());
				m.put(spe.name(), filteredInput);
			}
			Iterable<Map<String, EObject>> cp = CartesianProduct.cartesianProduct(m.build());
			retBuilder.put(rule, Iterables.filter(cp, joinPredicate));
		}
		
		return retBuilder.build();
	}
}
