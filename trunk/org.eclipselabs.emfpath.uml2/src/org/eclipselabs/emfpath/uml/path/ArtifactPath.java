package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class ArtifactPath extends ClassifierPath {

	/**
	 * @generated
	 */
	 ArtifactPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Artifact#getFileName()
	 * @generated
	 */
	public static final Function<Artifact, String> fileName = new Function<Artifact, String>() {
		public String apply(Artifact s) {
			return s.getFileName();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Artifact#getNestedArtifacts()
	 * @generated
	 */
	public static final Function<Artifact, EList<Artifact>> nestedArtifact = new Function<Artifact, EList<Artifact>>() {
		public EList<Artifact> apply(Artifact s) {
			return s.getNestedArtifacts();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Artifact#getManifestations()
	 * @generated
	 */
	public static final Function<Artifact, EList<Manifestation>> manifestation = new Function<Artifact, EList<Manifestation>>() {
		public EList<Manifestation> apply(Artifact s) {
			return s.getManifestations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Artifact#getOwnedOperations()
	 * @generated
	 */
	public static final Function<Artifact, EList<Operation>> ownedOperation = new Function<Artifact, EList<Operation>>() {
		public EList<Operation> apply(Artifact s) {
			return s.getOwnedOperations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Artifact#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<Artifact, EList<Property>> ownedAttribute = new Function<Artifact, EList<Property>>() {
		public EList<Property> apply(Artifact s) {
			return s.getOwnedAttributes();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Artifact#createOwnedOperation()
	 * @generated
	 */
	public static Function<Artifact, Operation> createOwnedOperation(final String name, final EList<String> parameterNames, final EList<Type> parameterTypes, final Type returnType) {
		return new Function<Artifact, Operation>() {
			public Operation apply(Artifact s) {
				return s.createOwnedOperation(name, parameterNames, parameterTypes, returnType);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Artifact#createOwnedAttribute()
	 * @generated
	 */
	public static Function<Artifact, Property> createOwnedAttribute(final String name, final Type type, final int lower, final int upper) {
		return new Function<Artifact, Property>() {
			public Property apply(Artifact s) {
				return s.createOwnedAttribute(name, type, lower, upper);
			}
		};
	}

}
