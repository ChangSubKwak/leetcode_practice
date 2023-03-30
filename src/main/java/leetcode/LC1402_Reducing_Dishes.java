package leetcode;

import java.util.Arrays;

public class LC1402_Reducing_Dishes {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int start = satisfaction.length - 1;

        while(start >= 0 && satisfaction[start] >= 0) {
            start--;
        }

        if (start == satisfaction.length - 1) {
            return 0;
        }

        start++;

        int result = 0;
        for (int i = start; i >= 0; i--) {
            int sum = 0;
            for (int j = i, k = 1; j < satisfaction.length; j++, k++) {
                sum += k * satisfaction[j];
            }
            result = Math.max(result, sum);
        }

        return result;
    }
}
