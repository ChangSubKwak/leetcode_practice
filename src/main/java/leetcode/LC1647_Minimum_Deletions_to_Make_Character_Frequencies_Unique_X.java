package leetcode;

import java.util.Arrays;

public class LC1647_Minimum_Deletions_to_Make_Character_Frequencies_Unique_X {
    
    public int minDeletions(String s) {
        int[] count = new int[26];
    
        for (char c : s.toCharArray()){
            count[c - 'a']++;
        }
    
        Arrays.sort(count);
        int deleteCount = 0;
        for (int i = 24; i >= 0; i--) {
            if (count[i] == 0) {
                break;
            }
        
            if (count[i] >= count[i + 1]) {
                int prev = count[i];
                count[i] = Math.max(0, count[i + 1] -1);
                deleteCount += prev - count[i];
            }
        }
        return deleteCount;
    }
}
