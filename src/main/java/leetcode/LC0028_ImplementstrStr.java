package leetcode;

public class LC0028_ImplementstrStr {
    public int strStr(String haystack, String needle) {
//    	if (haystack.length() < needle.length())
//    		return -1;
    	
    	if ("".equals(needle))
    		return 0;

    	for (int i = 0 ; i < haystack.length() ; i++) {
    		boolean isMatch = true;
    		if (haystack.charAt(i) == needle.charAt(0)) {
    			for (int j = 1 ; j < needle.length() ; j++) {
    				if (i+j >= haystack.length())
    					return -1;
    				
    				if (haystack.charAt(i+j) != needle.charAt(j)) {
    					isMatch = false;
//    					i = i + ((j == 1) ? j - 1 : j - 2);
    					break;
    				}
    			}
				if (isMatch) return i;
    		}
    	}
        return -1;
    }
	
	public static void main(String[] args) {
		LC0028_ImplementstrStr t = new LC0028_ImplementstrStr();
		System.out.println(t.strStr("aabaaabaaac", "aabaaac"));
		System.out.println(t.strStr("mississippi", "pi"));
		System.out.println(t.strStr("mississippi", "issipi"));
		System.out.println(t.strStr("mississippi", "issip"));
		System.out.println(t.strStr("aaa", "aaaa"));
		System.out.println(t.strStr("a", "a"));
		System.out.println(t.strStr("hello", "ll"));
		System.out.println(t.strStr("aaaaa", "bba"));
		
	}
}
