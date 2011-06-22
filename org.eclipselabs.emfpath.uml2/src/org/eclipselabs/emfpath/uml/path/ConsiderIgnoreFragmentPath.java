package org.eclipselabs.emfpath.uml.path;

import com.google.common.base.Function;	
import com.google.common.base.Predicate;	
import org.eclipse.emf.common.util.EList;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.uml2.uml.ConsiderIgnoreFragment;
import org.eclipse.uml2.uml.NamedElement;

/**
 * @generated
 */
public class ConsiderIgnoreFragmentPath extends CombinedFragmentPath {

	/**
	 * @generated
	 */
	private ConsiderIgnoreFragmentPath() {
		super();
	}

	/**
	 * @see org.eclipse.uml2.uml.ConsiderIgnoreFragment#getMessages()
	 * @generated
	 */
	public static final Function<ConsiderIgnoreFragment, EList<NamedElement>> message = new Function<ConsiderIgnoreFragment, EList<NamedElement>>() {
		public EList<NamedElement> apply(ConsiderIgnoreFragment s) {
			return s.getMessages();
		}
	};
	
	/**
	 * @see org.eclipse.uml2.uml.ConsiderIgnoreFragment#validateConsiderOrIgnore()
	 * @generated
	 */
	public static Predicate<ConsiderIgnoreFragment> validateConsiderOrIgnore(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConsiderIgnoreFragment>() {
			public boolean apply(ConsiderIgnoreFragment s) {
				return s.validateConsiderOrIgnore(diagnostics, context);
			}
		};
	}

	/**
	 * @see org.eclipse.uml2.uml.ConsiderIgnoreFragment#validateType()
	 * @generated
	 */
	public static Predicate<ConsiderIgnoreFragment> validateType(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		return new Predicate<ConsiderIgnoreFragment>() {
			public boolean apply(ConsiderIgnoreFragment s) {
				return s.validateType(diagnostics, context);
			}
		};
	}

}
