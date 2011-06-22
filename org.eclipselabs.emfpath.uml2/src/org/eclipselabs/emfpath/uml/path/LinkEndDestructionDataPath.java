package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndDestructionData;

/**
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
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#isDestroyDuplicates()
	 * @generated
	 */
	public static final Predicate<LinkEndDestructionData> isDestroyDuplicates = new Predicate<LinkEndDestructionData>() {
		public boolean apply(LinkEndDestructionData s) {
			return s.isDestroyDuplicates();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#getDestroyAt()
	 * @generated
	 */
	public static final Function<LinkEndDestructionData, InputPin> destroyAt = new Function<LinkEndDestructionData, InputPin>() {
		public InputPin apply(LinkEndDestructionData s) {
			return s.getDestroyAt();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#validateDestroyLinkAction()
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
	 * @see org.eclipse.uml2.uml.LinkEndDestructionData#validateUnlimitedNaturalAndMultiplicity()
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
