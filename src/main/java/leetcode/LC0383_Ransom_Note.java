package leetcode;

public class LC0383_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] countRansomNote = new int[26];
        int[] countMagazine = new int[26];
        
        for (int i = 0; i < ransomNote.length(); i++) {
            countRansomNote[ransomNote.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < magazine.length(); i++) {
            countMagazine[magazine.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < 26; i++) {
            if (countRansomNote[i] > countMagazine[i]) {
                return false;
            }
        }
        
        return true;
    }
}
