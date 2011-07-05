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
package org.eclipselabs.emfpath.base;

import java.util.regex.Pattern;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Strings;

/**
 * @author mbarbero
 *
 */
public final class Strings2 {

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
	public static final Function<CharSequence, Integer> length = new Function<CharSequence, Integer>() {
		public Integer apply(CharSequence from) {
			Preconditions.checkNotNull(from);
			return Integer.valueOf(from.length());
		}
	};

	/**
	 * 
	 */
	public static final Function<String, String> nullToEmpty = new Function<String, String>() {
		public String apply(String input) {
			return Strings.nullToEmpty(input);
		}
	};

	/**
	 * 
	 */
	public static final Function<String, String> emptyToNull = new Function<String, String>() {
		public String apply(String input) {
			return Strings.emptyToNull(input);
		}
	};

	/**
	 * 
	 */
	public static final Predicate<String> isNullOrEmpty = new Predicate<String>() {
		public boolean apply(String input) {
			return Strings.isNullOrEmpty(input);
		}
	};

	/**
	 * Returns a {@link Function} that pads the given input {@link String} with the behavior of
	 * {@link Strings#padStart(String, int, char)}.
	 * <p>
	 * The returned {@link Function} throws {@link NullPointerException} if it is given a <code>null</code> String.
	 * 
	 * @param minLength the minimum length the resulting string must have. Can be zero or negative, in which case the
	 *        input string is always returned by the function.
	 * @param padChar the character to insert at the beginning of the result until the minimum length is reached.
	 * @return the {@link Function} that pads.
	 * @see Strings#padStart(String, int, char)
	 */
	public static Function<String, String> padStart(final int minLength, final char padChar) {
		return new Function<String, String>() {
			public String apply(String input) {
				return Strings.padStart(input, minLength, padChar);
			}
		};
	}

	/**
	 * Returns a {@link Function} that pads the given input {@link String} with the behavior of
	 * {@link Strings#padEnd(String, int, char)}.
	 * <p>
	 * The returned {@link Function} throws {@link NullPointerException} if it is given a <code>null</code> String.
	 * 
	 * @param minLength the minimum length the resulting string must have. Can be zero or negative, in which case the
	 *        input string is always returned by the function.
	 * @param padChar the character to insert at the beginning of the result until the minimum length is reached.
	 * @return the {@link Function} that pads.
	 * @see Strings#padEnd(String, int, char)
	 */
	public static Function<String, String> padEnd(final int minLength, final char padChar) {
		return new Function<String, String>() {
			public String apply(String input) {
				return Strings.padEnd(input, minLength, padChar);
			}
		};
	}

	/**
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static Function<CharSequence, String> replaceAll(final String pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return replaceAll(Pattern.compile(pattern), replacement);
	}

	/**
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static Function<CharSequence, String> replaceAll(final Pattern pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return new Function<CharSequence, String>() {
			public String apply(CharSequence from) {
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
	public static Function<CharSequence, String> replaceFirst(final String pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return replaceFirst(Pattern.compile(pattern), replacement);
	}

	/**
	 * @param pattern
	 * @return
	 */
	public static Predicate<CharSequence> matches(final String pattern) {
		Preconditions.checkArgument(pattern != null);
		return matches(Pattern.compile(pattern));
	}

	/**
	 * @param pattern
	 * @return
	 */
	public static Predicate<CharSequence> matches(final Pattern pattern) {
		Preconditions.checkArgument(pattern != null);
		return new Predicate<CharSequence>() {
			public boolean apply(CharSequence input) {
				Preconditions.checkNotNull(input);
				return pattern.matcher(input).matches();
			}
		};
	}

	/**
	 * @param pattern
	 * @param replacement
	 * @return
	 */
	public static Function<CharSequence, String> replaceFirst(final Pattern pattern, final String replacement) {
		Preconditions.checkArgument(pattern != null);
		Preconditions.checkArgument(replacement != null);
		return new Function<CharSequence, String>() {
			public String apply(CharSequence from) {
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
