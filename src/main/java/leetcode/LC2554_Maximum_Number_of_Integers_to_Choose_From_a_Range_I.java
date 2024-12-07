package leetcode;

import java.util.Arrays;

public class LC2554_Maximum_Number_of_Integers_to_Choose_From_a_Range_I {
    public int maxCount(int[] banned, int n, int maxSum) {
        Arrays.sort(banned);
        int count = 0;

        for (int num = 1; num <= n; num++) {
             if (Arrays.binarySearch(banned, num) >= 0) {
                continue;
            }

            maxSum -= num;
            if (maxSum < 0) {
                break;
            }
            count++;
        }

        return count;
    }
}
