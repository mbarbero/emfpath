package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndDestructionData;

/**
 * Set of {@link com.google.base.Function Function}s and {@link com.google.base.Predicate Predicate}s
 * to browse {@link org.eclipse.uml2.uml.LinkEndDestructionData LinkEndDestructionData} in a functional way.
 * <p>
 * A link end destruction data is not an action. It is an element that identifies links.
 * It identifies one end of a link to be destroyed by destroy link action. 
 * @see org.eclipse.uml2.uml.LinkEndDestructionData
 * @generated
 */
public class LinkEndDestructionDataPath extends LinkEndDataPath {

	/**
	 * @generated
	 */
	private LinkEndDestructionDataPath() {
		super();
	}

	/**
	 * Specifies whether to destroy duplicates of the value in nonunique association ends.
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#isDestroyDuplicates()
	 * @generated
	 */
	public static final Predicate<LinkEndDestructionData> isDestroyDuplicates = new Predicate<LinkEndDestructionData>() {
		public boolean apply(LinkEndDestructionData s) {
			return s.isDestroyDuplicates();
		}
	};

	/**
	 * Specifies the position of an existing link to be destroyed in ordered nonunique association
	 * ends. The type of the pin is UnlimitedNatural, but the value cannot be zero or unlimited.
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#getDestroyAt()
	 * @generated
	 */
	public static final Function<LinkEndDestructionData, InputPin> destroyAt = new Function<LinkEndDestructionData, InputPin>() {
		public InputPin apply(LinkEndDestructionData s) {
			return s.getDestroyAt();
		}
	};
	
	/**
	 * LinkEndDestructionData can only be end data for DestroyLinkAction or one of its specializations.
	true
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#validateDestroyLinkAction(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<LinkEndDestructionData> validateDestroyLinkAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndDestructionData>() {
			public boolean apply(LinkEndDestructionData s) {
				return s.validateDestroyLinkAction(diagnostics, context);
			}
		};
	}

	/**
	 * LinkEndDestructionData for ordered nonunique association ends must have a single destroyAt
	 * input pin if isDestroyDuplicates is false. It must be of type UnlimitedNatural and
	 * have a multiplicity of 1..1. Otherwise, the action has no input pin for the removal
	 * position.
	true 
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#validateUnlimitedNaturalAndMultiplicity(DiagnosticChain, Map)
	 * @generated
	 */
	public static Predicate<LinkEndDestructionData> validateUnlimitedNaturalAndMultiplicity(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndDestructionData>() {
			public boolean apply(LinkEndDestructionData s) {
				return s.validateUnlimitedNaturalAndMultiplicity(diagnostics, context);
			}
		};
	}

}
