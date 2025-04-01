package leetcode;

public class LC2140_Solving_Questions_With_Brainpower {
    public long mostPoints(int[][] questions) {
        int length = questions.length;
        long[] memo = new long[length];
        memo[length - 1] = questions[length - 1][0];

        for (int i = length - 2; i >= 0; i--) {
            memo[i] = questions[i][0];
            int nextIndex = i + questions[i][1] + 1;

            if (nextIndex < length) {
                memo[i] += memo[nextIndex];
            }

            memo[i] = Math.max(memo[i], memo[i + 1]);
            // System.out.println(i + " : " + memo[i] + " : " + memo[i + 1] + " : " + Arrays.toString(memo));
        }

        return memo[0];
    }
}
