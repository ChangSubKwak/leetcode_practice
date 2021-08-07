package leetcode;


public class LC0125_ValidPalindrome {
    public boolean isPalindrome(String s) {
    	int length = s.length();
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0 ; i < length ; i++) {
    		if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
    			sb.append(s.charAt(i));
    		}
    		
    		if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
    			sb.append((char)('a' + s.charAt(i) - 'A'));
    		}
    		
    		if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
    			sb.append(s.charAt(i));
    		}
    	}
    	
    	for (int i = 0 ; i <= sb.length() / 2 ; i++) {
    		if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
    			return false;
    		}
    	}
    	
    	return true;
    }
	
	public static void main(String[] args) {
		LC0125_ValidPalindrome t = new LC0125_ValidPalindrome();
		
		System.out.println(t.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(t.isPalindrome("race a car"));
		System.out.println(t.isPalindrome("0P"));
		System.out.println(t.isPalindrome("1a2"));
	}
}
