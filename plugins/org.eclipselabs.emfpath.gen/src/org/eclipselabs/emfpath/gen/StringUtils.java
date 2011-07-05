package org.eclipselabs.emfpath.gen;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Splitter;

public class StringUtils {

	public List<String> split(String s, int n) {
		List<String> ret = new ArrayList<String>();
		Iterable<String> split = Splitter.on(' ').split(s);
		StringBuilder sb = new StringBuilder();
		for (String string : split) {
			sb.append(string);
			if (sb.length() > n) {
				ret.add(sb.toString());
				sb = new StringBuilder();
			} else {
				sb.append(' ');
			}
		}
		
		if (sb.length() > 0) {
			ret.add(sb.toString());
		}
		
		return ret;
	}
	
}
