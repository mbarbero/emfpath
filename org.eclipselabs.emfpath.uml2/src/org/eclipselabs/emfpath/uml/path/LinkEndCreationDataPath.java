package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.LinkEndCreationData;

/**
 * @generated
 */
public class LinkEndCreationDataPath extends LinkEndDataPath {

	/**
	 * @generated
	 */
	private LinkEndCreationDataPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#isReplaceAll()
	 * @generated
	 */
	public static final Predicate<LinkEndCreationData> isReplaceAll = new Predicate<LinkEndCreationData>() {
		public boolean apply(LinkEndCreationData s) {
			return s.isReplaceAll();
		}
	};

	/**
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#getInsertAt()
	 * @generated
	 */
	public static final Function<LinkEndCreationData, InputPin> insertAt = new Function<LinkEndCreationData, InputPin>() {
		public InputPin apply(LinkEndCreationData s) {
			return s.getInsertAt();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#validateCreateLinkAction()
	 * @generated
	 */
	public static Predicate<LinkEndCreationData> validateCreateLinkAction(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndCreationData>() {
			public boolean apply(LinkEndCreationData s) {
				return s.validateCreateLinkAction(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.LinkEndCreationData#validateSingleInputPin()
	 * @generated
	 */
	public static Predicate<LinkEndCreationData> validateSingleInputPin(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<LinkEndCreationData>() {
			public boolean apply(LinkEndCreationData s) {
				return s.validateSingleInputPin(diagnostics, context);
			}
		};
	}

}
