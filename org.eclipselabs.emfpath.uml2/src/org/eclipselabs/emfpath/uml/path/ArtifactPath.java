package org.eclipselabs.emfpath.uml.path;

import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Manifestation;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;

import com.google.common.base.Function;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.Artifact Artifact} in a functional way.
 * <p>
 * An artifact is the specification of a physical piece of information that is used or
 * produced by a software development process, or by deployment and operation of a system.
 * Examples of artifacts include model files, source files, scripts, and binary executable
 * files, a table in a database system, a development deliverable, or a word-processing
 * document, a mail message.
An artifact is the source of a deployment to a node. 
 * @see org.eclipse.uml2.uml.Artifact
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
	 * A concrete name that is used to refer to the Artifact in a physical context. Example:
	 * file system name, universal resource locator. 
	 * @see org.eclipse.uml2.uml.Artifact#getFileName()
	 * @generated
	 */
	public static final Function<Artifact, String> fileName = new Function<Artifact, String>() {
    public String apply(Artifact s) {
      return s.getFileName();
    }
  };

	/**
	 * The Artifacts that are defined (nested) within the Artifact.
	The association is a
	 * specialization of the ownedMember association from Namespace to NamedElement.
	 
	 * @see org.eclipse.uml2.uml.Artifact#getNestedArtifacts()
	 * @generated
	 */
	public static final Function<Artifact, EList<Artifact>> nestedArtifact = new Function<Artifact, EList<Artifact>>() {
    public EList<Artifact> apply(Artifact s) {
      return s.getNestedArtifacts();
    }
  };

	/**
	 * The set of model elements that are manifested in the Artifact. That is, these model
	 * elements are utilized in the construction (or generation) of the artifact. 
	 * @see org.eclipse.uml2.uml.Artifact#getManifestations()
	 * @generated
	 */
	public static final Function<Artifact, EList<Manifestation>> manifestation = new Function<Artifact, EList<Manifestation>>() {
    public EList<Manifestation> apply(Artifact s) {
      return s.getManifestations();
    }
  };

	/**
	 * The Operations defined for the Artifact. The association is a specialization of the
	 * ownedMember association. 
	 * @see org.eclipse.uml2.uml.Artifact#getOwnedOperations()
	 * @generated
	 */
	public static final Function<Artifact, EList<Operation>> ownedOperation = new Function<Artifact, EList<Operation>>() {
    public EList<Operation> apply(Artifact s) {
      return s.getOwnedOperations();
    }
  };

	/**
	 * The attributes or association ends defined for the Artifact.
	The association is a
	 * specialization of the ownedMember association.
	 
	 * @see org.eclipse.uml2.uml.Artifact#getOwnedAttributes()
	 * @generated
	 */
	public static final Function<Artifact, EList<Property>> ownedAttribute = new Function<Artifact, EList<Property>>() {
    public EList<Property> apply(Artifact s) {
      return s.getOwnedAttributes();
    }
  };
	
	/**
	 * Creates an operation with the specified name, parameter names, parameter types, and
	 * return type (or null) as an owned operation of this artifact. 
	 * @see org.eclipse.uml2.uml.Artifact#createOwnedOperation(String, EList, EList, Type)
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
	 * Creates a property with the specified name, type, lower bound, and upper bound as
	 * an owned attribute of this artifact. 
	 * @see org.eclipse.uml2.uml.Artifact#createOwnedAttribute(String, Type, int, int)
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
