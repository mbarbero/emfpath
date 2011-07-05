package org.eclipselabs.emfpath.ecore.path;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipselabs.emfpath.base.ComposablePredicate;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

/**
 * @generated
 */
public class EDataTypes extends EClassifiers {

	
	/**
   * @generated
   */
   EDataTypes() {
    super();
  }

  /**
   * 
   * @see org.eclipse.emf.ecore.EDataType#isSerializable()
   * @generated
   */
  public static final ComposablePredicate<EDataType> isSerializable = new ComposablePredicate<EDataType>() {
    public boolean apply(EDataType s) {
      return s.isSerializable();
    }
  };

  /**
	 * Creates a new {@link Function} that will be able to create instances of the
	 * {@link EAttribute#getEAttributeType() type} of the given {@link EAttribute}.
	 * 
	 * @param eAttribute the {@link Object}s created with this {@link Function} will be instance of the type of this
	 *        {@link EAttribute}.
	 * @return a new {@link Function}
	 */
	public static FromStringLiteral fromString(EAttribute eAttribute) {
		Preconditions.checkNotNull(eAttribute);
		FromStringLiteral ret = new FromStringLiteral(eAttribute.getEAttributeType());
		return ret;
	}
	
	/**
	 * Creates a new {@link Function} that will be able to serialize instances of the
	 * {@link EAttribute#getEAttributeType() type} of the given {@link EAttribute}.
	 * 
	 * @param eAttribute the {@link String}s created with this {@link Function} will be serialization of the type of
	 *        this {@link EAttribute}.
	 * @return a new {@link Function}
	 */
	public static ToStringLiteral toString(EAttribute eAttribute) {
		Preconditions.checkNotNull(eAttribute);
		ToStringLiteral ret = new ToStringLiteral(eAttribute.getEAttributeType());
		return ret;
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

		FromStringLiteral(EDataType eDataType) {
			Preconditions.checkNotNull(eDataType);
			this.eDataType = eDataType;
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

		ToStringLiteral(EDataType eDataType) {
			Preconditions.checkNotNull(eDataType);
			this.eDataType = eDataType;
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
