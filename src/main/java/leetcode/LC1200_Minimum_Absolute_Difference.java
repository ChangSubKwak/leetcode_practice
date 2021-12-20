package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1200_Minimum_Absolute_Difference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int minDiff = 2000000;
        
        for (int i = 1; i < arr.length; i++) {
            int absDiff = Math.abs(arr[i-1] - arr[i]);
            if (absDiff < minDiff) {
                minDiff = absDiff;
            }
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int absDiff = Math.abs(arr[i-1] - arr[i]);
            if (absDiff == minDiff) {
                res.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return res;
    }
}
