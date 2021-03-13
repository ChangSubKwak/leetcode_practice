package leetcode;

public class LC0009_PalindromeNumber {
    public boolean isPalindrome(int x) {
    	String s = String.valueOf(x);
    	StringBuilder sb = new StringBuilder(s);
    	sb.reverse();
    	
        return s.equals(sb.toString());
    }
	
	public static void main(String[] args) {
		LC0009_PalindromeNumber lc = new LC0009_PalindromeNumber();
		System.out.println(lc.isPalindrome(121));
		System.out.println(lc.isPalindrome(-121));
		System.out.println(lc.isPalindrome(10));
		
	}
}
