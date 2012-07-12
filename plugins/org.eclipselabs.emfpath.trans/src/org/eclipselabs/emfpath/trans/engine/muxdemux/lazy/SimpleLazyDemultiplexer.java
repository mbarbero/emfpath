package org.eclipselabs.emfpath.trans.engine.muxdemux.lazy;

import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EObject;
import org.eclipselabs.emfpath.trans.engine.ITransformationOutput;
import org.eclipselabs.emfpath.trans.engine.TransformationOutput;
import org.eclipselabs.emfpath.trans.engine.muxdemux.IDemultiplexer;
import org.eclipselabs.emfpath.trans.rules.ITransformationRule;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;

public class SimpleLazyDemultiplexer implements IDemultiplexer {

	/* (non-Javadoc)
	 * @see api.IDemultiplexer#demultiplex(com.google.common.collect.ImmutableMap)
	 */
	public <E extends ITransformationRule> ITransformationOutput demultiplex(ImmutableMap<E,ImmutableMultimap<String,Iterable<EObject>>> transformedInput) {
		TransformationOutput.Builder retBuilder = TransformationOutput.builder();
		
		Map<String, Iterable<EObject>> outputChannelConcatenation = Maps.newHashMap();
		for(Entry<E, ImmutableMultimap<String, Iterable<EObject>>> entry : transformedInput.entrySet()) {
			ImmutableMultimap<String,Iterable<EObject>> ruleOutputs = entry.getValue();
			for (Map.Entry<String, Iterable<EObject>> ruleOutput : ruleOutputs.entries()) {
				String outputChannelName = ruleOutput.getKey();
				Iterable<EObject> outputChannel = ruleOutput.getValue();
				
				if (outputChannelConcatenation.containsKey(outputChannelName)) {
					outputChannel = Iterables.concat(outputChannelConcatenation.get(outputChannelName), outputChannel);
				}
				outputChannelConcatenation.put(outputChannelName, outputChannel);
			}
		}

		for (Map.Entry<String, Iterable<EObject>> entry : outputChannelConcatenation.entrySet()) {
			retBuilder.add(entry.getKey(), entry.getValue());
		}
		
		return retBuilder.build();
	}
	
}
