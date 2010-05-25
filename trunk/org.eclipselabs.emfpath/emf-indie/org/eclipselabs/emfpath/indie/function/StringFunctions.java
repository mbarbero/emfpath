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
package org.eclipselabs.emfpath.indie.function;

import java.util.regex.Pattern;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikaël Barbero</a>
 * @since 0.3
 */
public final class StringFunctions {

	private StringFunctions() {
		// prevent instantiation
	}

	/**
	 * 
	 */
	public static final Function<String, String> trim = new Function<String, String>() {
		public String apply(String from) {
			Preconditions.checkNotNull(from);
			return from.trim();
		}
	};

	/**
	 * 
	 */
	public static final Function<String, String> toL1Case = new Function<String, String>() {
		public String apply(String from) {
			Preconditions.checkNotNull(from);
			String ret = ""; //$NON-NLS-1$
			if (from.length() > 0) {
				StringBuilder sb = new StringBuilder(from.length());
				sb.append(Character.toLowerCase(from.charAt(0))).append(from.substring(1));
				ret = sb.toString();
			}
			return ret;
		}
	};

	/**
	 * 
	 */
	public static final Function<String, String> toU1Case = new Function<String, String>() {
		public String apply(String from) {
			Preconditions.checkNotNull(from);
			String ret = ""; //$NON-NLS-1$
			if (from.length() > 0) {
				StringBuilder sb = new StringBuilder(from.length());
				sb.append(Character.toUpperCase(from.charAt(0))).append(from.substring(1));
				ret = sb.toString();
			}
			return ret;
		}
	};

	/**
	 * 
	 */
	public static final Function<String, String> toLowerCase = new Function<String, String>() {
		public String apply(String from) {
			Preconditions.checkNotNull(from);
			return from.toLowerCase();
		}
	};

	/**
	 * 
	 */
	public static final Function<String, String> toUpperCase = new Function<String, String>() {
		public String apply(String from) {
			Preconditions.checkNotNull(from);
			return from.toUpperCase();
		}
	};

	/**
	 * 
	 */
	public static final Function<String, Integer> length = new Function<String, Integer>() {
		public Integer apply(String from) {
			Preconditions.checkNotNull(from);
			return Integer.valueOf(from.length());
		}
	};

	/**
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static Function<String, String> replaceAll(final String pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return StringFunctions.replaceAll(Pattern.compile(pattern), replacement);
	}

	/**
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static Function<String, String> replaceAll(final Pattern pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return new Function<String, String>() {
			public String apply(String from) {
				Preconditions.checkNotNull(from);
				return pattern.matcher(from).replaceAll(replacement);
			}
		};
	}

	/**
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static Function<String, String> replaceFirst(final String pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return StringFunctions.replaceFirst(Pattern.compile(pattern), replacement);
	}

	/**
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static Function<String, String> replaceFirst(final Pattern pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return new Function<String, String>() {
			public String apply(String from) {
				Preconditions.checkNotNull(from);
				return pattern.matcher(from).replaceFirst(replacement);
			}
		};
	}

	/**
	 * @param begin
	 * @return
	 */
	public static Function<String, String> substring(final int begin) {
		Preconditions.checkArgument(begin > 0);
		return new Function<String, String>() {
			public String apply(String from) {
				Preconditions.checkNotNull(from);
				// call copy constructor (String()) to avoid memory leak
				return new String(from.substring(begin));
			}
		};
	}

	/**
	 * @param begin
	 * @param end
	 * @return
	 */
	public static Function<String, String> substring(final int begin, final int end) {
		Preconditions.checkArgument(begin > 0);
		Preconditions.checkArgument(end > 0);
		return new Function<String, String>() {
			public String apply(String from) {
				Preconditions.checkNotNull(from);
				Preconditions.checkArgument(end < from.length());
				// call copy constructor (String()) to avoid memory leak
				return new String(from.substring(begin, end));
			}
		};
	}
}
