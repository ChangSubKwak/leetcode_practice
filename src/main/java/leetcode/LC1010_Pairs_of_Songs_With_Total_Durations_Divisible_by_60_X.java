package leetcode;

import java.util.Arrays;

public class LC1010_Pairs_of_Songs_With_Total_Durations_Divisible_by_60_X {
    public int numPairsDivisibleBy60(int[] time) {
        int[] arr = new int[60];
        int ans = 0;
        
        for(int i = 0; i < time.length; i++) {
            arr[time[i]%60]++;
        }
        
        for (int i = 0; i <= 30; i++) {
            if (Arrays.asList(0, 30).contains(i)) {
                int n = arr[i];
                ans += (n * (n-1)) / 2;
                continue;
            }
            
            ans += arr[i] * arr[60-i];
        }
        return ans;
    }
}