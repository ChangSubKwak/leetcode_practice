package leetcode;

public class LC0647_Palindromic_Substrings_X {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int count = 0;
        for (int i = 0; i < s.length(); i++) {          // i is the mid point
            count += extendPalindrome(s, i, i);         // odd length;
            count += extendPalindrome(s, i, i + 1);     // even length
        }
        
        return count;
    }
    
    private int extendPalindrome(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}