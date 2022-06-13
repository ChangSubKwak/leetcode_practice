package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0120_Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        
        int row = triangle.size();
        int[] dp = new int[row];
        
        for (int i = 0; i < row; i++) {
            dp[i] = triangle.get(row - 1).get(i);
        }
        
        for (int i = row - 2; i >= 0; i--) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                dp[j] = Math.min(dp[j] + list.get(j), dp[j + 1] + list.get(j));
            }
        }
        
        return dp[0];
    }
    
    /*
    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int[] dp = new int[size];
        for (int i = 0 ; i < triangle.get(size - 1).size() ; i++)
        	dp[i] = triangle.get(size - 1).get(i);
        
        for (int y = size - 2 ; y >= 0 ; y--) {
        	for (int x = 0 ; x < triangle.get(y).size() ; x++) {
        		dp[x] = Math.min(triangle.get(y).get(x) + dp[x], triangle.get(y).get(x) + dp[x+1]);
        	}
        }
        return dp[0];
    }
    */
}
