package leetcode;

import java.util.Arrays;

public class LC0875_Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        int answer = -1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            long takenTimes = 0;
            for (int i = 0; i < piles.length; i++) {
                takenTimes += (int) Math.ceil((double) piles[i] / (double) mid);
            }

            if (takenTimes <= h) {
                answer = mid;
                max = mid -1;
                continue;
            }

            min = mid + 1;
        }

        return answer;
    }
}
