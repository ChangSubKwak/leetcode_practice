package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0059_SpiralMatrixII {
    public int[][] generateMatrix(int n) {
    	List<Integer> res = new ArrayList<>();
    	//boolean[][] isVisit = new boolean[m][n];
    	int[][] matrix = new int[n][n];
    	
    	int dir = 0;
    	int[][] dxdy = { {0,1}, {1,0}, {0,-1}, {-1,0} };
    	int y = 0, x = 0;
    	int c = 1;
    	while(true) {
    		matrix[y][x] = c++;
    		if (c == n*n + 1) break;
    		if (res.size() == matrix.length * matrix[0].length) break;
    		if (y + dxdy[dir][0] < 0 || y + dxdy[dir][0] >= matrix.length || 
    			x + dxdy[dir][1] < 0 || x + dxdy[dir][1] >= matrix[0].length ||
    			matrix[y + dxdy[dir][0]][x + dxdy[dir][1]] != 0) {
    			dir = (dir + 1) % 4;
    		}
    		y += dxdy[dir][0];
    		x += dxdy[dir][1];
    	}
    	//System.out.println(Arrays.deepToString(matrix)); 
    	
    	return matrix;
    }
	
	public static void main(String[] args) {
		LC0059_SpiralMatrixII t = new LC0059_SpiralMatrixII();
		System.out.println(Arrays.deepToString(t.generateMatrix(3)));
		System.out.println(Arrays.deepToString(t.generateMatrix(1)));
		System.out.println(Arrays.deepToString(t.generateMatrix(20)));
	}
}
