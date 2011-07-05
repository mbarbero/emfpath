package org.eclipselabs.emfpath.gen;

import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenOperation;

public class GenClasses {

	public List<GenClass> getMixinGenClasses(GenClass genClass) {
		return genClass.getMixinGenClasses();
	}
	
	public List<GenFeature> getMixinGenFeatures(GenClass genClass) {
		return genClass.getMixinGenFeatures();
	}
	
	public List<GenOperation> getMixinGenOperations(GenClass genClass) {
		return genClass.getMixinGenOperations();
	}
	
	public GenClass getBaseGenClass(GenClass genClass) {
		return genClass.getBaseGenClass();
	}
}
