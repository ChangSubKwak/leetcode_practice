package leetcode;

public class LC0680_Valid_Palindrome_II {
    public boolean checkPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean validPalindrome(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--){
            if (s.charAt(i) != s.charAt(j)) {
                String s1 = s.substring(0, i) + s.substring(i + 1, s.length());
                String s2 = s.substring(0, j) + s.substring(j + 1, s.length());
                return checkPalindrome(s1) || checkPalindrome(s2);
            }
        }
        return true;
    }
}
