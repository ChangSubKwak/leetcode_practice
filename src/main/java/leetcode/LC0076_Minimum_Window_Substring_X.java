package leetcode;

import java.util.HashMap;
import java.util.Map;

import org.checkerframework.checker.units.qual.*;

public class LC0076_Minimum_Window_Substring_X {
	public String minWindow(String s, String t) {
    	Map<Character, Integer> map = new HashMap<>();
    	for (int i = 0 ; i < t.length() ; i++) {
    		char c = t.charAt(i);
    		if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
				continue;
			}
    		map.put(c, 1);
    	}
    	
    	int required = t.length();
		int l = 0, r = 0;
		int windowStart = 0;
		int min = Integer.MAX_VALUE;

    	while (r < s.length()) {
    		char c = s.charAt(r);
    		if (map.containsKey(c) && map.get(c) > 0) {
				required--;
			}
    		
    		if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
			}
    		else {
				map.put(c, -1);
			}
    		
    		r++;
    		while (required == 0) {
    			if (min > r - l ) {
    				min = r - l;
    				windowStart = l;
    			}
    			
    			c = s.charAt(l);
    			if (map.get(c) == 0) {
					required++;
				}
    			
    			if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}
        		else {
					map.put(c, 1);
				}
    			
    			l++;
    		}
    	}
    	return min == Integer.MAX_VALUE ? "" : s.substring(windowStart, windowStart + min);
	}
}
