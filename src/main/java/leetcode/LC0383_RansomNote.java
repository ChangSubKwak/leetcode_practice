package leetcode;

public class LC0383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for (int i = 0; i < ransomNote.length(); i++) {
            count1[ransomNote.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < magazine.length(); i++) {
            count2[magazine.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (count2[i] - count1[i] < 0) {
                return false;
            }
        }
        
        return true;
    }
}
