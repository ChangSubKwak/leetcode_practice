package leetcode;

public class LC0567_Permutation_in_String {
    public boolean checkInclusion(String s1, String s2) {
        int[] countMap1 = new int[26];
        int[] countMap2 = new int[26];
        
        if (s1.length() > s2.length()) {
            return false;
        }
        
        for (int i = 0; i < s1.length(); i++) {
            countMap1[s1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s1.length(); i++) {
            countMap2[s2.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (i > 0) {
                countMap2[s2.charAt(i - 1) - 'a']--;
                countMap2[s2.charAt(i + s1.length() - 1) - 'a']++;
            }
            
            boolean isMatch = true;
            for (int j = 0; j < 26; j++) {
                if (countMap1[j] != countMap2[j]) {
                    isMatch = false;
                    break;
                }
            }
            
            if (isMatch) {
                return true;
            }
        }
        
        return false;
    }
}
