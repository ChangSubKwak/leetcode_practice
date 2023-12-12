package leetcode;

public class LC0343_Integer_Break {

    private int[] dp;

    private int recur(int num) {
        if (num <= 3) {
            return num;
        }

        if (dp[num] != 0) {
            return dp[num];
        }

        int answer = num;
        for (int i = 2; i < num; i++) {
            answer = Math.max(answer, i * recur(num - i));
        }

        dp[num] = answer;
        return answer;
    }

    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }

        dp = new int[n + 1];
        return recur(n);
    }
}
