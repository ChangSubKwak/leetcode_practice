package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LC0973_K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Double.compare(a[0]*a[0] + a[1]*a[1], b[0]*b[0] + b[1]*b[1]);
            }
        });
        
        int[][] res = new int[k][2];
        System.arraycopy(points, 0, res, 0, k);
        
        return res;
    }
}
