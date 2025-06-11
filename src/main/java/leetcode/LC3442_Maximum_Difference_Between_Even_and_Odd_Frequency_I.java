package leetcode;

import java.util.Arrays;

public class LC3442_Maximum_Difference_Between_Even_and_Odd_Frequency_I {
    public int maxDifference(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

//        System.out.println(Arrays.toString(count));

        int diffMax = -1000;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count.length; j++) {
                if (i == j || count[i] == 0 || count[j] == 0) {
                    continue;
                }

                if (count[i] % 2 == 0 && count[j] % 2 != 0) {
                    diffMax = Math.max(diffMax, count[j] - count[i]);
                }
                else if (count[i] % 2 != 0 && count[j] % 2 == 0) {
                    diffMax = Math.max(diffMax, count[i] - count[j]);
                }

            }
        }

        return diffMax;
    }
}
