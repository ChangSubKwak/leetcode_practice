package leetcode;

public class LC2309_Greatest_English_Letter_in_Upper_and_Lower_Case {
    public String greatestLetter(String s) {
        int l = s.length();
        boolean[] isLower = new boolean[26];
        boolean[] isUpper = new boolean[26];
        
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            int commonIndex = -1;
            
            if (Character.isLowerCase(c)) {
                isLower[c - 'a'] = true;
                commonIndex = c - 'a';
            }
            
            if (Character.isUpperCase(c)) {
                isUpper[c - 'A'] = true;
                commonIndex = c - 'A';
            }
        }
        
        for (int i = 25; i >= 0; i--) {
            if (isLower[i] && isUpper[i]) {
                return String.valueOf((char)('A' + i));
            }
        }
        
        return "";
    }
}
