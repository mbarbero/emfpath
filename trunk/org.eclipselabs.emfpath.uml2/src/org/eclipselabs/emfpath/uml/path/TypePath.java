package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Type;

/**
 * @generated
 */
public class TypePath extends PackageableElementPath {

	/**
	 * @generated
	 */
	 TypePath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.Type#getPackage()
	 * @generated
	 */
	public static final Function<Type, Package> package_ = new Function<Type, Package>() {
		public Package apply(Type s) {
			return s.getPackage();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.Type#createAssociation()
	 * @generated
	 */
	public static Function<Type, Association> createAssociation(final boolean end1IsNavigable, final AggregationKind end1Aggregation, final String end1Name, final int end1Lower, final int end1Upper, final Type end1Type, final boolean end2IsNavigable, final AggregationKind end2Aggregation, final String end2Name, final int end2Lower, final int end2Upper) {
		return new Function<Type, Association>() {
			public Association apply(Type s) {
				return s.createAssociation(end1IsNavigable, end1Aggregation, end1Name, end1Lower, end1Upper, end1Type, end2IsNavigable, end2Aggregation, end2Name, end2Lower, end2Upper);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.Type#getAssociations()
	 * @generated
	 */
	public static final Function<Type, EList<Association>> getAssociations = new Function<Type, EList<Association>>() {
		public EList<Association> apply(Type s) {
			return s.getAssociations();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.Type#conformsTo()
	 * @generated
	 */
	public static Predicate<Type> conformsTo(final Type other) {
		return new Predicate<Type>() {
			public boolean apply(Type s) {
				return s.conformsTo(other);
			}
		};
	}

}
