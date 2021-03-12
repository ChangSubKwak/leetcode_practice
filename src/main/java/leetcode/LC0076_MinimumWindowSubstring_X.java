package main.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0076_MinimumWindowSubstring_X {
	public String minWindow(String s, String t) {
    	Map<Character, Integer> map = new HashMap<>();
    	for (int i = 0 ; i < t.length() ; i++) {
    		char c = t.charAt(i);
    		if (map.containsKey(c)) map.put(c, map.get(c) + 1);
    		else                    map.put(c, 1);
    	}
    	
    	int required = t.length(), l = 0, r = 0, windowStart = 0, min = Integer.MAX_VALUE;
    	while(r < s.length()) {
    		char c = s.charAt(r);
    		if (map.containsKey(c) && map.get(c) > 0)
    			required--;
    		
    		if (map.containsKey(c))
    			map.put(c, map.get(c) - 1);
    		else
    			map.put(c, -1);
    		
    		r++;
    		while (required == 0) {
    			if (min > r - l ) {
    				min = r - l;
    				windowStart = l;
    			}
    			
    			c = s.charAt(l);
    			if (map.get(c) == 0)
    				required++;
    			
    			if (map.containsKey(c))
    				map.put(c, map.get(c) + 1);
        		else
        			map.put(c, 1);
    			
    			l++;
    		}
    		
    	}
    	return min == Integer.MAX_VALUE ? "" : s.substring(windowStart, windowStart+min);
	}
	
	
	/*
    public String minWindow(String s, String t) {
    	Map<Character, Integer> smap = new HashMap<>(); 
    	Map<Character, Integer> tmap = new HashMap<>();
    	for (int i = 0 ; i < t.length() ; i++) {
    		char c = t.charAt(i);
    		if (tmap.containsKey(c)) tmap.put(c, tmap.get(c) + 1);
    		else                     tmap.put(c, 1);
    	}
    	
    	int min = Integer.MAX_VALUE;
    	int sLen = s.length();
    	String res = "";
    	for (int i = 0 ; i < sLen ; i++) {
    		smap.clear();
    		for (int j = i; j < sLen ; j++) {
    			char c = s.charAt(j);
        		if   (tmap.containsKey(c)) {
        			if (smap.containsKey(c)) smap.put(c, smap.get(c) + 1);
        			else                     smap.put(c, 1);
        			
        			boolean flag = true;
        			for(Map.Entry<Character, Integer> e : tmap.entrySet()) {
        				char key = e.getKey();
        				
        				if (!smap.containsKey(key) || tmap.get(key) > smap.get(key) ) {
        					flag = false;
        					break;
        				}
        			}
        			
        			if (flag && min > j - i + 1) {
        				min = j - i + 1;
        				res = s.substring(i, j+1);
        			}
        		}
    		}
    	}
        return res;
    }
    */
	
	/*
	public String minWindow(String s, String t) {
	      if (s.length() == 0 || t.length() == 0) {
	          return "";
	      }
	      
	      Map<Character, Integer> dictT = new HashMap<Character, Integer>();
	      for (int i = 0; i < t.length(); i++) {
	          int count = dictT.getOrDefault(t.charAt(i), 0);
	          dictT.put(t.charAt(i), count + 1);
	      }
	      System.out.println(dictT);
	      
	      // Number of unique characters in t, which need to be present in the desired window.
	      int required = dictT.size();

	      // Left and Right pointer
	      int l = 0, r = 0;
	      int formed = 0;
	      Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();
	      int[] ans = {-1, 0, 0};
	      
	      while (r < s.length()) {
	          char c = s.charAt(r);
	          int count = windowCounts.getOrDefault(c, 0);
	          windowCounts.put(c, count + 1);

	          // If the frequency of the current character added equals to the desired count in t then increment the formed count by 1.
	          if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
	              formed++;
	          }
	          
	          while (l <= r && formed == required) {
	              c = s.charAt(l);
	              // Save the smallest window until now.
	              if (ans[0] == -1 || r - l + 1 < ans[0]) {
	                  ans[0] = r - l + 1;
	                  ans[1] = l;
	                  ans[2] = r;
	              }
	              
	              windowCounts.put(c, windowCounts.get(c) - 1);
	              if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
	                  formed--;
	              }
	              l++;
	          }
	          r++;
	      }
	      
	      
	      return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
	}
	*/
	
	/*
	public String minWindow(String s, String t) {
		int[] map = new int[128];
		for (int i = 0 ; i < t.length() ; i++)
			map[t.charAt(i)]++;
		
		int counter = t.length(), left = 0, right = 0, min = Integer.MAX_VALUE, head = 0;
		while(right < s.length()) {
			if (map[s.charAt(right++)]-->0) 
				counter--;
			
			while(counter == 0) {

				if (min > right - left)
					min = right - (head = left);		// 최소값의 경우라면 윈도우의 크기 변경
				if (map[s.charAt(left++)]++ == 0)
					counter++;
			}
		}
		
		return min == Integer.MAX_VALUE ? "" : s.substring(head, head + min);
	}
	*/
    
	public static void main(String[] args) {
		//System.out.println("ABC".contains("BC"));
		LC0076_MinimumWindowSubstring_X t = new LC0076_MinimumWindowSubstring_X();
		System.out.println(t.minWindow("ab", "a"));
//		System.out.println(t.minWindow("aaaaaaaaaaaabbbbbcdd", "abcdd"));
//		System.out.println(t.minWindow("a", "aa"));
//		System.out.println(t.minWindow("ADOBECODEBANC", "ABC"));
//		System.out.println(t.minWindow("a", "a"));
	}
}
