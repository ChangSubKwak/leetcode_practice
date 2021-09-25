package leetcode;

import java.util.List;

public class LC0131_PalindromePartitioning {
	private boolean isPalindrome(String input) {
		int length = input.length();
		if (length == 1) {
			return true;
		}
		int mid = length / 2;
		System.out.println(input.substring(0, mid));
		System.out.println(new StringBuilder(input.substring(mid + length % 2 , length)).reverse());
		
		String left = input.substring(0, mid);
		String right = new StringBuilder(input.substring(mid + length % 2 , length)).reverse().toString();
		
		return left.equals(right);
	}
	
    public List<List<String>> partition(String s) {
        return null;
    }
	
	public static void main(String[] args) {
		LC0131_PalindromePartitioning t = new LC0131_PalindromePartitioning();
//		System.out.println(t.partition("aab"));
//		t.isPalindrome("ab");
//		t.isPalindrome("aba");
	}
}
