package leetcode;

public class LC1140_Stone_Game_II {
    private int recur(int[] piles, int[][][] dp, int turn, int index, int m) {
        if (index == piles.length) {
            return 0;
        }
        
        if (dp[turn][index][m] != -1) {
            return dp[turn][index][m];
        }
        
        int result = turn == 1 ? 1000000 : -1;
        int s = 0;
        for (int x = 1; x <= Math.min(2 * m, piles.length - index); x++) {
            s += piles[index + x - 1];
            if (turn == 0) {
                result = Math.max(result, s + recur(piles, dp, 1, index + x, Math.max(m, x)));
            } else {
                result = Math.min(result,     recur(piles, dp, 0, index + x, Math.max(m, x)));
            }
        }
        
        dp[turn][index][m] = result;
        return dp[turn][index][m];
    }

    public int stoneGameII(int[] piles) {
        int length = piles.length;
        int[][][] dp = new int[2][length + 1][length + 1];
        
        for (int turn = 0; turn < 2; turn++) {
            for (int index = 0; index <= length; index++) {
                for (int m = 0; m <= length; m++) {
                    dp[turn][index][m] = -1;
                }
            }
        }
        
        return recur(piles, dp, 0, 0, 1);
    }
}
