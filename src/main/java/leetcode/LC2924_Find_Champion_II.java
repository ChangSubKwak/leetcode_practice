package leetcode;

import java.util.Arrays;

public class LC2924_Find_Champion_II {
    public int findChampion(int n, int[][] edges) {
        boolean[] isWins = new boolean[n];
        Arrays.fill(isWins, true);

        for (int[] edge : edges) {
            int loser = edge[1];
            isWins[loser] = false;
        }

        int champion = -1;
        int championcount = 0;

        for (int i = 0; i < n; i++) {
            boolean isWin = isWins[i];
            if (isWin) {
                champion = i;
                championcount++;
            }

            if (championcount > 1) {
                return -1;
            }
        }

        return champion;
    }
}
