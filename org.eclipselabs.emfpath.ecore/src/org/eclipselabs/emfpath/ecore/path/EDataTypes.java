package org.eclipselabs.emfpath.ecore.path;

import com.google.common.base.Function;	
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * @generated
 */
public final class EDataTypes {

	private EDataTypes() {
		// prevent instantiation
	}

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceClassName = EClassifiers.instanceClassName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Class<?>> instanceClass = EClassifiers.instanceClass;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, Object> defaultValue = EClassifiers.defaultValue;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, String> instanceTypeName = EClassifiers.instanceTypeName;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EPackage> ePackage = EClassifiers.ePackage;

	/**
	 * @generated
	 */
	public static final Function<EClassifier, EList<ETypeParameter>> eTypeParameters = EClassifiers.eTypeParameters;

	/**
	 * @generated
	 */
	public static final Function<EModelElement, EList<EAnnotation>> eAnnotations = EModelElements.eAnnotations;

	/**
	 * @generated
	 */
	public static final Function<ENamedElement, String> name = ENamedElements.name;

	/**
	 * @generated
	 */
	public static final Predicate<EDataType> isSerializable = new Predicate<EDataType>() {
    public boolean apply(EDataType s) {
      return s.isSerializable();
    }
  };
	
	/**
	 * @generated
	 */
	public static Predicate<EClassifier> isInstance(final Object object) {
    return EClassifiers.isInstance(object);
  }

	/**
	 * @generated
	 */
	public static final Function<EClassifier, java.lang.Integer> getClassifierID = EClassifiers.getClassifierID;

	/**
	 * @generated
	 */
	public static Function<EModelElement, EAnnotation> getEAnnotation(final String source) {
    return EModelElements.getEAnnotation(source);
  }

	/**
	 * Function that uses standard EMF mechanism to create an instance of an {@link EDataType} from a {@link String}
	 * literal.
	 * <p>
	 * The {@link #apply(String)} method calls {@link EcoreUtil#createFromString(EDataType, String)}.
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 * @since 0.4
	 */
	public static class FromStringLiteral implements Function<String, Object> {

		private EDataType eDataType;

		private FromStringLiteral(EDataType eDataType) {
			Preconditions.checkNotNull(eDataType);
			this.eDataType = eDataType;
		}

		/**
		 * Creates a new {@link Function} that will be able to create instances of the
		 * {@link EAttribute#getEAttributeType() type} of the given {@link EAttribute}.
		 * 
		 * @param eAttribute the {@link Object}s created with this {@link Function} will be instance of the type of this
		 *        {@link EAttribute}.
		 * @return a new {@link Function}
		 */
		public static FromStringLiteral ofType(EAttribute eAttribute) {
			Preconditions.checkNotNull(eAttribute);
			FromStringLiteral ret = new FromStringLiteral(eAttribute.getEAttributeType());
			return ret;
		}

		/**
		 * Creates a new {@link Function} that will be able to create instances of the given {@link EDataType}.
		 * 
		 * @param eDataType the {@link Object}s created with this {@link Function} will be instance of this
		 *        {@link EDataType}.
		 * @return a new {@link Function}
		 */
		public static FromStringLiteral ofType(EDataType eDataType) {
			Preconditions.checkNotNull(eDataType);
			FromStringLiteral ret = new FromStringLiteral(eDataType);
			return ret;
		}

		/**
		 * Synonym of {@link #apply(String)}.
		 * 
		 * @param from the source object.
		 * @return the resulting object.
		 */
		public Object creates(String from) {
			return this.apply(from);
		}

		public Object apply(String from) {
			return EcoreUtil.createFromString(this.eDataType, from);
		}
	}
	
	/**
	 * Function that uses standard EMF mechanism to create a {@link String} literal from an instance of an {@link EDataType}
	 * .
	 * <p>
	 * The {@link #apply(Object)} method calls {@link EcoreUtil#convertToString(EDataType, Object)}.
	 * 
	 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
	 * @since 0.4
	 */
	public static class ToStringLiteral implements Function<Object, String> {

		private EDataType eDataType;

		private ToStringLiteral(EDataType eDataType) {
			Preconditions.checkNotNull(eDataType);
			this.eDataType = eDataType;
		}

		/**
		 * Creates a new {@link Function} that will be able to serialize instances of the
		 * {@link EAttribute#getEAttributeType() type} of the given {@link EAttribute}.
		 * 
		 * @param eAttribute the {@link String}s created with this {@link Function} will be serialization of the type of
		 *        this {@link EAttribute}.
		 * @return a new {@link Function}
		 */
		public static ToStringLiteral ofType(EAttribute eAttribute) {
			Preconditions.checkNotNull(eAttribute);
			ToStringLiteral ret = new ToStringLiteral(eAttribute.getEAttributeType());
			return ret;
		}

		/**
		 * Creates a new {@link Function} that will be able to serialize instances of the given {@link EDataType}.
		 * 
		 * @param eDataType the {@link String}s created with this {@link Function} will be serialization of this
		 *        {@link EDataType}.
		 * @return a new {@link Function}
		 */
		public static ToStringLiteral ofType(EDataType eDataType) {
			Preconditions.checkNotNull(eDataType);
			ToStringLiteral ret = new ToStringLiteral(eDataType);
			return ret;
		}

		/**
		 * Synonym of {@link #apply(Object)}.
		 * 
		 * @param from the source object.
		 * @return the resulting object.
		 */
		public String convert(Object from) {
			return EcoreUtil.convertToString(this.eDataType, from);
		}

		public String apply(Object from) {
			return EcoreUtil.convertToString(this.eDataType, from);
		}
	}
}
