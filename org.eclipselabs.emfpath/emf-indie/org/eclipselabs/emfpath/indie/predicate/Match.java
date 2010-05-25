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
package org.eclipselabs.emfpath.indie.predicate;

import java.util.regex.Pattern;

import org.eclipselabs.emfpath.indie.util.ComposablePredicate;


/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public abstract class Match extends ComposablePredicate<String> {

	/**
	 * @param regex
	 * @return
	 */
	public static Match regex(String regex) {
		return new StringRegexMatch(regex);
	}

	/**
	 * @param regex
	 * @return
	 */
	public static Match regex(Pattern regex) {
		return new PatternRegexMatch(regex);
	}

	/**
	 * 
	 */
	Match() {
		// prevent instanciation
	}

	private static class StringRegexMatch extends Match {

		private final String regex;

		/**
		 * @param regex
		 */
		public StringRegexMatch(String regex) {
			this.regex = regex;
		}

		public boolean apply(String input) {
			return input.matches(this.regex);
		}
	}

	private static class PatternRegexMatch extends Match {

		private final Pattern regex;

		/**
		 * @param regex
		 */
		public PatternRegexMatch(Pattern regex) {
			this.regex = regex;
		}

		public boolean apply(String input) {
			return this.regex.matcher(input).matches();
		}
	}
}
