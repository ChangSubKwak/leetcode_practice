package leetcode;

import java.util.Arrays;

public class LC1647_Minimum_Deletions_to_Make_Character_Frequencies_Unique_X {
    
    public int minDeletions(String s) {
        int[] freq = new int[26];
    
        for (char c : s.toCharArray()){
            freq[c - 'a']++;
        }
    
        Arrays.sort(freq);
        int deleteCount = 0;
        for (int i = 24; i >= 0; i--) {
            if (freq[i] == 0) {
                break;
            }
        
            if (freq[i] >= freq[i + 1]) {
                int prev = freq[i];
                freq[i] = Math.max(0, freq[i + 1] -1);
                deleteCount += prev - freq[i];
            }
        }
        return deleteCount;
    }
}
