/*******************************************************************************
 * Copyright (c) 2009, 2010 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emfpath.ecore.resource;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EMOFExtendedMetaData;
import org.eclipse.emf.ecore.xmi.impl.EMOFResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipselabs.emfpath.ecore.path.EObjects;
import org.eclipselabs.emfpath.ecore.internal.i18n.Messages;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;


/**
 * Set of utility methods to handles {@link Resource resource} and {@link ResourceSet resource set}
 * 
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël barbero</a>
 * @author <a href="mailto:laurent.goubet@obeo.fr">Laurent Goubet</a>
 * @since 0.1.0
 */
public final class Resources {

	private static final String FILE_ENCODING = "file.encoding"; //$NON-NLS-1$

	/**
	 * Utility classes don't need to (and shouldn't) be instantiated.
	 */
	private Resources() {
		// prevent instantiation
	}

	/**
	 * Initializes the {@link Resource.Factory.Registry resource factory registry} and the {@link EPackage.Registry
	 * package registry} of the given {@link ResourceSet resource set} with some common values for stand alone usage.
	 * <p>
	 * It registers
	 * <ul>
	 * <li>the default file extension {@code '*'} and the default content type identifier {@code '*'} to an
	 * {@link XMIResourceFactoryImpl XMI resource factory},</li>
	 * <li>the file extension {@code .ecore} and the content type identifier {@code org.eclipse.emf.ecore} to an
	 * {@link EcoreResourceFactoryImpl Ecore resource factory}</li>
	 * <li>and the file extension {@code .emof} and the content type identifier {@code org.eclipse.emf.emof} to an
	 * {@link EMOFResourceFactoryImpl EMOF resource factory}.</li>
	 * </ul>
	 * <p>
	 * It also registers the {@link EcorePackage#eINSTANCE Ecore package} in the package registry of the given resource
	 * set (useful if this registry is not delegating to the {@link EPackage.Registry#INSTANCE global registry} ).
	 * 
	 * @param resourceSet the resource set to initialize
	 * @since 0.1.0
	 */
	public static void initResourceSet(ResourceSet resourceSet) {
		Preconditions.checkArgument(resourceSet != null, Messages.getString("EResources.0")); //$NON-NLS-1$

		Resource.Factory xmiResourceFactory = new XMIResourceFactoryImpl();
		Resource.Factory ecoreResourceFactory = new EcoreResourceFactoryImpl();
		Resource.Factory emofResourceFactory = new EMOFResourceFactoryImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION,
			xmiResourceFactory);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", ecoreResourceFactory); //$NON-NLS-1$
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("emof", emofResourceFactory); //$NON-NLS-1$

		resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put(
			Resource.Factory.Registry.DEFAULT_CONTENT_TYPE_IDENTIFIER, xmiResourceFactory);
		resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put(EcorePackage.eCONTENT_TYPE, ecoreResourceFactory);
		resourceSet.getResourceFactoryRegistry().getContentTypeToFactoryMap().put(EMOFExtendedMetaData.CONTENT_TYPE, emofResourceFactory);

		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
	}

	/**
	 * Searches and unregisters all the {@link EPackage}s from the given {@code ecoreResource} in the
	 * {@link ResourceSet#getPackageRegistry() package registry} of its owning {@link ResourceSet resource set} and from
	 * the {@link EPackage.Registry#INSTANCE global registry}. It then registers all the {@link EPackage}s in the
	 * {@link ResourceSet resource set} registry only.
	 * <p>
	 * Note that if you change the {@link EPackage#getNsURI() namespace URI} of one this {@link EPackage}, the reload
	 * will simply register it and let the old one in the registry. This may have unexpected side-effects.
	 * 
	 * @param ecoreResource the resource to search in (expected to contain {@link EPackage}s).
	 * @since 0.1.0
	 */
	public static void reloadEPackagesFrom(Resource ecoreResource) {
		Preconditions.checkArgument(ecoreResource != null, "Cannot reload EPackages from null resource."); //$NON-NLS-1$

		Iterator<EObject> allEPackages = Iterators.filter(ecoreResource.getAllContents(), EObjects.isTypeOf(EcorePackage.Literals.EPACKAGE));
		EPackage.Registry packageRegistry = ecoreResource.getResourceSet().getPackageRegistry();

		while (allEPackages.hasNext()) {
			EPackage ePackage = (EPackage) allEPackages.next();
			packageRegistry.remove(ePackage.getNsURI());
			EPackage.Registry.INSTANCE.remove(ePackage.getNsURI());

			packageRegistry.put(ePackage.getNsURI(), ePackage);
		}
	}

	/**
	 * Searches and registers all the {@link EPackage}s from the given {@code ecoreResource} in the
	 * {@link ResourceSet#getPackageRegistry() package registry} of its owning {@link ResourceSet resource set}.
	 * 
	 * @param ecoreResource the resource to search in (expected to contain {@link EPackage}s).
	 * @since 0.1.0
	 */
	public static void registerEPackagesFrom(Resource ecoreResource) {
		Preconditions.checkArgument(ecoreResource != null, Messages.getString("Resources.1")); //$NON-NLS-1$

		Iterator<EObject> allEPackages = Iterators.filter(ecoreResource.getAllContents(), EObjects.isTypeOf(EcorePackage.Literals.EPACKAGE));
		EPackage.Registry packageRegistry = ecoreResource.getResourceSet().getPackageRegistry();

		while (allEPackages.hasNext()) {
			EPackage ePackage = (EPackage) allEPackages.next();
			packageRegistry.put(ePackage.getNsURI(), ePackage);
		}
	}

	/**
	 * Searches and unregisters all the {@link EPackage}s from the given {@code ecoreResource} in the
	 * {@link ResourceSet#getPackageRegistry() package registry} of its owning {@link ResourceSet resource set} and from
	 * the {@link EPackage.Registry#INSTANCE global registry}.
	 * 
	 * @param ecoreResource the resource to search in (expected to contain {@link EPackage}s).
	 * @since 0.1.0
	 */
	public static void unregisterEPackagesFrom(Resource ecoreResource) {
		Preconditions.checkArgument(ecoreResource != null, Messages.getString("Resources.2")); //$NON-NLS-1$

		Iterator<EObject> allEPackages = Iterators.filter(ecoreResource.getAllContents(), EObjects.isTypeOf(EcorePackage.Literals.EPACKAGE));
		EPackage.Registry packageRegistry = ecoreResource.getResourceSet().getPackageRegistry();

		while (allEPackages.hasNext()) {
			EPackage ePackage = (EPackage) allEPackages.next();
			packageRegistry.remove(ePackage.getNsURI());
			EPackage.Registry.INSTANCE.remove(ePackage.getNsURI());
		}
	}

	/**
	 * Attaches the given {@link EObject} to a new resource created in a new {@link ResourceSet} with the given URI.
	 * 
	 * @param resourceURI URI of the new resource to create.
	 * @param root EObject to attach to a new resource.
	 * @return The resource <tt>root</tt> has been attached to.
	 */
	public static Resource attachResource(URI resourceURI, EObject root) {
		Preconditions.checkArgument(resourceURI != null, Messages.getString("Resources.3")); //$NON-NLS-1$
		Preconditions.checkArgument(root != null, Messages.getString("Resources.4")); //$NON-NLS-1$

		final Resource newResource = Resources.createResource(resourceURI);
		newResource.getContents().add(root);
		return newResource;
	}

	/**
	 * Attaches the given {@link EObject} to a new resource created in the given {@link ResourceSet} with the given URI.
	 * 
	 * @param resourceURI URI of the new resource to create.
	 * @param resourceSet ResourceSet in which to create the resource.
	 * @param root EObject to attach to a new resource.
	 * @return The resource <tt>root</tt> has been attached to.
	 */
	public static Resource attachResource(URI resourceURI, ResourceSet resourceSet, EObject root) {
		Preconditions.checkArgument(resourceURI != null, Messages.getString("Resources.5")); //$NON-NLS-1$
		Preconditions.checkArgument(resourceSet != null, Messages.getString("Resources.6")); //$NON-NLS-1$
		Preconditions.checkArgument(root != null, Messages.getString("Resources.7")); //$NON-NLS-1$

		final Resource newResource = Resources.createResource(resourceURI, resourceSet);
		newResource.getContents().add(root);
		return newResource;
	}

	/**
	 * This will create a {@link Resource} given the model extension it is intended for.
	 * 
	 * @param modelURI {@link org.eclipse.emf.common.util.URI URI} where the model is stored.
	 * @return The {@link Resource} given the model extension it is intended for.
	 */
	public static Resource createResource(URI modelURI) {
		Preconditions.checkArgument(modelURI != null, Messages.getString("Resources.8")); //$NON-NLS-1$
		return Resources.createResource(modelURI, new ResourceSetImpl());
	}

	/**
	 * This will create a {@link Resource} given the model extension it is intended for and a ResourceSet.
	 * 
	 * @param modelURI {@link org.eclipse.emf.common.util.URI URI} where the model is stored.
	 * @param resourceSet The {@link ResourceSet} to load the model in.
	 * @return The {@link Resource} given the model extension it is intended for.
	 */
	public static Resource createResource(URI modelURI, ResourceSet resourceSet) {
		Preconditions.checkArgument(modelURI != null, Messages.getString("Resources.9")); //$NON-NLS-1$
		Preconditions.checkArgument(resourceSet != null, Messages.getString("Resources.10")); //$NON-NLS-1$

		String fileExtension = modelURI.fileExtension();
		if ((fileExtension == null) || (fileExtension.length() == 0)) {
			fileExtension = Resource.Factory.Registry.DEFAULT_EXTENSION;
		}

		final Resource.Factory.Registry registry = resourceSet.getResourceFactoryRegistry();
		Object resourceFactory = registry.getExtensionToFactoryMap().get(fileExtension);
		if (resourceFactory == null) {
			resourceFactory = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(fileExtension);
			if (resourceFactory != null) {
				registry.getExtensionToFactoryMap().put(fileExtension, resourceFactory);
			} else {
				registry.getExtensionToFactoryMap().put(fileExtension, new XMIResourceFactoryImpl());
			}
		}

		return resourceSet.createResource(modelURI);
	}

	/**
	 * Loads the models contained by the given directory in the given ResourceSet.
	 * <p>
	 * If <code>resourceSet</code> is <code>null</code>, all models will be loaded in a new resourceSet.
	 * </p>
	 * 
	 * @param directory The directory from which to load the models.
	 * @param resourceSet The {@link ResourceSet} to load the model in. If <code>null</code>, all models will be loaded
	 *        in a new resourceSet.
	 * @return The models contained by the given directory.
	 */
	public static List<Resource> getModelsFrom(File directory, ResourceSet resourceSet) {
		Preconditions.checkArgument(directory != null, Messages.getString("Resources.11")); //$NON-NLS-1$
		Preconditions.checkArgument(resourceSet != null, Messages.getString("Resources.12")); //$NON-NLS-1$

		return Resources.getModelsFrom(directory, null, resourceSet);
	}

	/**
	 * Loads the files with the given extension contained by the given directory as EObjects in the given ResourceSet.
	 * <p>
	 * If <code>resourceSet</code> is <code>null</code>, all models will be loaded in a new resourceSet.
	 * </p>
	 * <p>
	 * The argument <code>extension</code> is in fact the needed suffix for its name in order for a file to be loaded.
	 * If it is equal to &quot;rd&quot;, a file named &quot;model.aird&quot; will be loaded, but so would be a file
	 * named &quot;Shepherd&quot;.
	 * </p>
	 * <p>
	 * The empty String or <code>null</code> will result in all the files of the given directory to be loaded, and would
	 * then be equivalent to {@link #getModelsFrom(File, ResourceSet)}.
	 * </p>
	 * 
	 * @param directory The directory from which to load the models.
	 * @param extension File extension of the files to load. If <code>null</code>, will consider all extensions.
	 * @param resourceSet The {@link ResourceSet} to load the model in. If <code>null</code>, all models will be loaded
	 *        in a new resourceSet.
	 * @return The models contained by the given directory.
	 */
	public static List<Resource> getModelsFrom(File directory, String extension, ResourceSet resourceSet) {
		Preconditions.checkArgument(directory != null, Messages.getString("Resources.13")); //$NON-NLS-1$
		Preconditions.checkArgument(resourceSet != null, Messages.getString("Resources.14")); //$NON-NLS-1$

		final List<Resource> models = new ArrayList<Resource>();
		final String fileExtension;
		if (extension != null) {
			fileExtension = extension;
		} else {
			fileExtension = ""; //$NON-NLS-1$
		}
		final ResourceSet theResourceSet;
		if (resourceSet == null) {
			theResourceSet = new ResourceSetImpl();
		} else {
			theResourceSet = resourceSet;
		}
		if (directory.exists() && directory.isDirectory() && (directory.listFiles() != null)) {
			final File[] files = directory.listFiles();
			for (int i = 0; i < files.length; i++) {
				final File aFile = files[i];

				if (!aFile.isDirectory() && aFile.getName().matches("[^.].*?\\Q" + fileExtension + "\\E")) { //$NON-NLS-1$ //$NON-NLS-2$
					models.add(Resources.load(aFile, theResourceSet));
				}
			}
		}

		return models;
	}

	/**
	 * Loads a model from a {@link java.io.File File} in a given {@link ResourceSet}.
	 * <p>
	 * This will return the resource of the loaded model.
	 * </p>
	 * 
	 * @param file {@link java.io.File File} containing the model to be loaded.
	 * @param resourceSet The {@link ResourceSet} to load the model in.
	 * @return The model loaded from the file.
	 */
	public static Resource load(File file, ResourceSet resourceSet) {
		Preconditions.checkArgument(file != null, Messages.getString("Resources.15")); //$NON-NLS-1$
		Preconditions.checkArgument(resourceSet != null, Messages.getString("Resources.16")); //$NON-NLS-1$

		return Resources.load(URI.createFileURI(file.getPath()), resourceSet);
	}

	/**
	 * Load a model from an {@link java.io.InputStream InputStream} in a given {@link ResourceSet}.
	 * <p>
	 * This will return the resource of the loaded model.
	 * </p>
	 * 
	 * @param stream The inputstream to load from
	 * @param fileName The original filename
	 * @param resourceSet The {@link ResourceSet} to load the model in.
	 * @return The loaded model
	 * @throws IOException If the given file does not exist.
	 */
	public static Resource load(InputStream stream, String fileName, ResourceSet resourceSet) throws IOException {
		Preconditions.checkArgument(stream != null, Messages.getString("Resources.17")); //$NON-NLS-1$
		Preconditions.checkArgument((fileName != null) && (fileName.length() > 0), Messages.getString("Resources.18")); //$NON-NLS-1$
		Preconditions.checkArgument(resourceSet != null, Messages.getString("Resources.19")); //$NON-NLS-1$

		final Resource modelResource = Resources.createResource(URI.createURI(fileName), resourceSet);
		modelResource.load(stream, Collections.emptyMap());
		return modelResource;
	}

	/**
	 * Loads a model from the String representing the location of a model.
	 * <p>
	 * This can be called with pathes of the form
	 * <ul>
	 * <li><code>/pluginID/path</code></li>
	 * <li><code>platform:/plugin/pluginID/path</code></li>
	 * <li><code>platform:/resource/pluginID/path</code></li>
	 * </ul>
	 * </p>
	 * <p>
	 * This will return the resource of the loaded model.
	 * </p>
	 * 
	 * @param path Location of the model.
	 * @param resourceSet The {@link ResourceSet} to load the model in.
	 * @return The model loaded from the path.
	 * @throws IOException If the path doesn't resolve to a reachable location.
	 */
	public static Resource load(String path, ResourceSet resourceSet) throws IOException {
		Preconditions.checkArgument((path != null) && (path.length() > 0), Messages.getString("Resources.20")); //$NON-NLS-1$
		Preconditions.checkArgument(resourceSet != null, Messages.getString("Resources.21")); //$NON-NLS-1$

		final Resource result;
		// path is already defined with a platform scheme
		if (path.startsWith("platform")) { //$NON-NLS-1$
			result = Resources.load(URI.createURI(path), resourceSet);
		} else {
			Resource temp = null;
			// Will first try and load as if the model is in the plugins
			temp = Resources.load(URI.createPlatformPluginURI(path, true), resourceSet);
			if (temp == null) {
				temp = Resources.load(URI.createPlatformResourceURI(path, true), resourceSet);
			}

			result = temp;
		}

		if (result == null) {
			throw new IOException(Messages.getString("Resources.22", path)); //$NON-NLS-1$
		}

		return result;
	}

	/**
	 * Loads a model from an {@link org.eclipse.emf.common.util.URI URI} in a given {@link ResourceSet}.
	 * <p>
	 * This will return the resource of the loaded model.
	 * </p>
	 * 
	 * @param modelURI {@link org.eclipse.emf.common.util.URI URI} where the model is stored.
	 * @param resourceSet The {@link ResourceSet} to load the model in.
	 * @return The model loaded from the URI.
	 */
	public static Resource load(URI modelURI, ResourceSet resourceSet) {
		String fileExtension = modelURI.fileExtension();
		if ((fileExtension == null) || (fileExtension.length() == 0)) {
			fileExtension = Resource.Factory.Registry.DEFAULT_EXTENSION;
		}
		final Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		final Object resourceFactory = registry.getExtensionToFactoryMap().get(fileExtension);
		if (resourceFactory != null) {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileExtension, resourceFactory);
		} else {
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileExtension, new XMIResourceFactoryImpl());
		}

		return resourceSet.getResource(modelURI, true);
	}

	/**
	 * Saves a model as a file to the given path.
	 * 
	 * @param root Root of the objects to be serialized in a file.
	 * @param path File where the objects have to be saved.
	 * @throws IOException Thrown if an I/O operation has failed or been interrupted during the saving process.
	 */
	public static void save(EObject root, String path) throws IOException {
		Preconditions.checkArgument(root != null, Messages.getString("Resources.23")); //$NON-NLS-1$
		Preconditions.checkArgument((path != null) && (path.length() > 0), Messages.getString("Resources.24")); //$NON-NLS-1$

		final Resource newModelResource = Resources.createResource(URI.createFileURI(path));
		newModelResource.getContents().add(root);
		final Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, System.getProperty(Resources.FILE_ENCODING));
		newModelResource.save(options);
	}

	/**
	 * Serializes the given EObjet as a String.
	 * 
	 * @param root Root of the objects to be serialized.
	 * @return The given EObjet serialized as a String.
	 * @throws IOException Thrown if an I/O operation has failed or been interrupted during the saving process.
	 */
	public static String serialize(EObject root) throws IOException {
		Preconditions.checkArgument(root != null, Messages.getString("Resources.25")); //$NON-NLS-1$

		// Copies the root to avoid modifying it
		final EObject copyRoot = EcoreUtil.copy(root);
		// Should not throw ClassCast since uri calls for an xml resource
		final XMLResource resource = (XMLResource) Resources.attachResource(URI.createFileURI("resource.xml"), copyRoot); //$NON-NLS-1$

		final StringWriter writer = new StringWriter();
		final Map<String, String> options = Maps.newHashMap();
		options.put(XMLResource.OPTION_ENCODING, System.getProperty(Resources.FILE_ENCODING));
		resource.save(writer, options);
		final String result = writer.toString();
		writer.flush();
		return result;
	}

	/**
	 * @param resource
	 * @return
	 * @throws IOException
	 */
	public static String serializeContent(Resource resource) throws IOException {
		Preconditions.checkArgument(resource != null, "Must not be null"); //$NON-NLS-1$

		// Should not throw ClassCast since uri calls for an xml resource
		final XMLResource xmlResource = (XMLResource) Resources.createResource(URI.createFileURI("resource.xml")); //$NON-NLS-1$

		final Collection<EObject> eObjectsCopy = EcoreUtil.copyAll(resource.getContents());
		xmlResource.getContents().addAll(eObjectsCopy);

		final StringWriter writer = new StringWriter();
		final Map<String, String> options = Maps.newHashMap();
		options.put(XMLResource.OPTION_ENCODING, System.getProperty(Resources.FILE_ENCODING));
		options.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
		xmlResource.save(writer, options);
		final String result = writer.toString();
		writer.flush();
		return result;
	}

	/**
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 * @param <T>
	 */
	public abstract static class Function<T> implements com.google.common.base.Function<Resource, T> {
		/**
		 * @param from
		 * @return
		 */
		public T of(Resource from) {
			return this.apply(from);
		}
	}

	/**
	 * 
	 */
	public static Function<Iterable<EObject>> descendant = new Function<Iterable<EObject>>() {
		public Iterable<EObject> apply(final Resource from) {
			return new Iterable<EObject>() {
				public Iterator<EObject> iterator() {
					return from.getAllContents();
				}
			};
		}
	};

	/**
	 * Synonym of {@link #descendant}.
	 * 
	 * @since 0.3.0
	 */
	public static Function<Iterable<EObject>> eAllContents = descendant;

	/**
	 * 
	 */
	public static final Function<URI> uri = new Function<URI>() {
		public URI apply(Resource from) {
			return from.getURI();
		}
	};
}
