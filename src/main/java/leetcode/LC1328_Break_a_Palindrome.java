package leetcode;

public class LC1328_Break_a_Palindrome {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return "";
        }

        char[] charArray = palindrome.toCharArray();
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (charArray[i] != 'a') {
                charArray[i] = 'a';
                return String.valueOf(charArray);
            }
        }

        charArray[palindrome.length() - 1] = 'b';
        return String.valueOf(charArray);
    }
}
