package leetcode;

import java.util.Arrays;

public class LC0452_Minimum_Number_of_Arrows_to_Burst_Balloons_X {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1[1], p2[1]));
        
        int count = 0;
        int xAxis = 0;
        for (int i = 0; i < points.length; i++) {
            if (count == 0 || points[i][0] > xAxis) {
                count++;
                xAxis = points[i][1];
            }
        }
        return count;
    }
}
