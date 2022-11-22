package leetcode;

public class LC0279_Perfect_Squares {
    public int numSquares(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= (int)Math.sqrt(n); i++) {

            int j = i * i;
            int k = 1;
            while(j <= n) {
                result[j] = Math.min(result[j], k);
                j += i * i;
                k++;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                result[j] = Math.min(result[j - i] + result[i], result[j]);
            }
        }

        return result[n];
    }
}
