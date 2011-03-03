package org.eclipselabs.emfpath.uml2;

import java.io.File;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipselabs.emfpath.gen.Main;

import com.google.common.io.Files;

public class Build implements IApplication {

	public Object start(IApplicationContext context) throws Exception {
		URI genModelURI = URI.createPlatformPluginURI("/org.eclipse.uml2.uml/model/UML.genmodel", true);
		Main gen = new Main(genModelURI, new File("src"), Collections.emptyList());
		Files.deleteRecursively(new File("src/"));
		gen.doGenerate(new BasicMonitor());
		Files.move(new File("src/org.eclipse.uml2.uml/src/org"), new File("src/org"));
		Files.deleteRecursively(new File("src/org.eclipse.uml2.uml"));
		return Integer.valueOf(0);
	}

	public void stop() {
	}

}
