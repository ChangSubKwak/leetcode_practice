package leetcode;

import java.util.TreeSet;

public class LC1675_Minimize_Deviation_in_Array {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                set.add(num);
                continue;
            }
            set.add(num * 2);
        }

        int answer = Integer.MAX_VALUE;
        while (true) {
            int maxValue = set.last();
            int minValue = set.first();
            answer = Math.min(answer, maxValue - minValue);

            if (maxValue % 2 == 0) {
                set.remove(maxValue);
                set.add(maxValue / 2);
                continue;
            }

            break;
        }

        return answer;
    }
}
