package leetcode;

import java.util.Arrays;

public class LC1029_Two_City_Scheduling_X {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b)-> (a[0] - a[1]) - (b[0] - b[1]));
        
        int result = 0;
        int halfIndex = costs.length / 2;
        for (int i = 0; i < halfIndex; i++) {
            result +=costs[i][0];
        }
        
        for (int i = halfIndex; i < costs.length; i++) {
            result +=costs[i][1];
        }
        
        return result;
    }
}