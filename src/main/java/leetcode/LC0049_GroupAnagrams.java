package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0049_GroupAnagrams {
	public boolean isEqual(String s1, String s2) {
		int[] c1 = new int[26];
		int[] c2 = new int[26];
		
		if (s1.length() != s2.length()) return false;
		for (int i = 0 ; i < s1.length() ; i++) {
			c1[s1.charAt(i) - 'a']++;
			c2[s2.charAt(i) - 'a']++;
		}
		for (int i = 0 ; i < 26 ; i++) {
			if (c1[i] != c2[i]) return false;
		}
		
		
		return true;
	}
	
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> result = new ArrayList<>();
    	List<String> org = new ArrayList<>();
    	org.addAll(Arrays.asList(strs));
    	
    	List<String> list = new ArrayList<>();
    	while(org.size() != 0) {
    		String s = org.get(0);
    		for (int i = 0 ; i < org.size() ; i++) {
    			String t = org.get(i);
    			if (isEqual(s, t)) {
    				list.add(org.get(i));
    				org.remove(i);
    				i--;
    			}
    		}
    		result.add(list);
    		list = new ArrayList<>();
    	}
    	
        return result;
    }
    
	public static void main(String[] args) {
		LC0049_GroupAnagrams t = new LC0049_GroupAnagrams();
		List<List<String>> l = t.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
		//List<List<String>> l = t.groupAnagrams(new String[]{""});
		//List<List<String>> l = t.groupAnagrams(new String[]{"a"});
		for (int i = 0 ; i < l.size() ; i++)
			System.out.println(l.get(i));
	}
}
