package leetcode;

import java.util.Arrays;

public class LC0743_Network_Delay_Time_X {
    public int networkDelayTime(int[][] times, int n, int k) {
        long[][] disTo = new long[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(disTo[i], Integer.MAX_VALUE);
        }
        
        for (int i = 0; i < n; i++) {
            disTo[i][i] = 0;
        }
        
        for (int[] edge: times) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;
            int w = edge[2];
            disTo[u][v] = w;
        }
        
        for (int l = 0; l < n; l++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (disTo[i][j] > disTo[i][l] + disTo[l][j]) {
                        disTo[i][j] = disTo[i][l] + disTo[l][j];
                    }
                }
            }
        }
        
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (disTo[k - 1][i] == Integer.MAX_VALUE) {
                return -1;
            }
            max = Math.max(max, disTo[k - 1][i]);
        }
        return (int)max;
    }
}
