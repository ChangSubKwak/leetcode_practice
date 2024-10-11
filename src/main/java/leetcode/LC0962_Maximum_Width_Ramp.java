package leetcode;

import java.util.Arrays;

public class LC0962_Maximum_Width_Ramp {
    public int maxWidthRamp(int[] nums) {
        int length = nums.length;
        Integer[] indices = new Integer[length];

        for (int i = 0; i < length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (i, j) ->
            nums[i] != nums[j] ? nums[i] - nums[j] : i - j
        );
        System.out.println(Arrays.toString(indices));

        int minIndex = length;
        int maxWidth = 0;

        for (int i : indices) {
            maxWidth = Math.max(maxWidth, i - minIndex);
            minIndex = Math.min(minIndex, i);
        }

        return maxWidth;
    }
}
