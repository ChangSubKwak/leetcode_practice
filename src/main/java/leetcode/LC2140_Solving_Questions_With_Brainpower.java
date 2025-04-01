package leetcode;

public class LC2140_Solving_Questions_With_Brainpower {
    private long recur(long[] memo, int[][] questions, int start) {
        int length = questions.length;
        for (int i = start; i < length; i++) {
            //memo[i] = Math.max(memo[i], questions[i][0]
        }
        return 0;
    }

    public long mostPoints(int[][] questions) {
        long[] memo = new long[questions.length];

        return recur(memo, questions, 0);
    }
}
