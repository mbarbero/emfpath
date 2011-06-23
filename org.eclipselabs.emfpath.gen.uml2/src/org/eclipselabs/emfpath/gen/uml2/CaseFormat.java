package org.eclipselabs.emfpath.gen.uml2;

public class CaseFormat {

	public String lowerUnderscoreToUpperCamel(String from) {
		boolean nextToUpper = true;
		char[] charArray = from.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < charArray.length; i++) {
			if ('_' == charArray[i]) {
				nextToUpper = true;
				continue;
			}
			
			if (nextToUpper) {
				sb.append(Character.toUpperCase(charArray[i]));
				nextToUpper = false;
			} else {
				sb.append(charArray[i]);
			}
		}
		
		return sb.toString();
	}
	
}
