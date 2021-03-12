package main.java.leetcode;

public class LC0014_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	int len = strs.length;
    	
    	if (len < 1)
    		return "";
    	
    	boolean isBreak = false;
    	int idx = 0;
    	while (true) {
	    	for (int i = 0 ; i < len ; i++) {
	    		if (idx > strs[i].length() - 1) {
	    			isBreak = true;
	    			break;
	    		}
	    		if (strs[i].charAt(idx) != strs[0].charAt(idx)) {
	    			isBreak = true;
	    			break;
	    		}
	    	}
	    	if (isBreak)
	    		break;
	    	idx++;
    	}
    	
        return strs[0].substring(0, idx);
    }
	
	public static void main(String[] args) {
		LC0014_LongestCommonPrefix lc = new LC0014_LongestCommonPrefix();
		
//		String[] str = {"flower","flow","flight"};
//		String[] str = {"dog","racecar","car"};
		
		System.out.println(lc.longestCommonPrefix(new String[]{"a"}));
		System.out.println(lc.longestCommonPrefix(new String[]{""}));
		System.out.println(lc.longestCommonPrefix(new String[]{}));
		System.out.println(lc.longestCommonPrefix(new String[]{"flower","flow","flight"}));
		System.out.println(lc.longestCommonPrefix(new String[]{"dog","racecar","car"}));
		
		
	}
}
