package leetcode;

import java.util.*;

public class LC1338_Minimum_Difficulty_of_a_Job_Schedule_X {
    public int minDifficulty(int[] jobDifficulty, int d) {
        final int length = jobDifficulty.length;
        if (length < d) {
            return -1;
        }

        int[][] dp = new int[length][d + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return dfs(d, 0, jobDifficulty, dp);
    }

    private int dfs(int day, int length, int[] jobDifficulty, int[][] dp) {
        final int jobDifficultyLength = jobDifficulty.length;
        if (day == 0 && length == jobDifficultyLength) {
            return 0;
        }

        if (day == 0 || length == jobDifficultyLength) {
            return Integer.MAX_VALUE;
        }

        if (dp[length][day] != -1) {
            return dp[length][day];
        }

        int max = jobDifficulty[length];
        int min = Integer.MAX_VALUE;
        for (int i = length; i < jobDifficultyLength; i++) {
            max = Math.max(max, jobDifficulty[i]);
            int dfsResult = dfs(day - 1, i + 1, jobDifficulty, dp);
            if (dfsResult != Integer.MAX_VALUE) {
                min = Math.min(min, dfsResult + max);
            }
        }

        return dp[length][day] = min;
    }
}
