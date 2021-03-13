package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0054_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> res = new ArrayList<>();
    	boolean[][] isVisit = new boolean[matrix.length][matrix[0].length];
    	
    	int dir = 0;
    	int[][] dxdy = { {0,1}, {1,0}, {0,-1}, {-1,0} };
    	int y = 0, x = 0;
    	while(true) {
    		res.add(matrix[y][x]);
    		isVisit[y][x] = true;
    		if (res.size() == matrix.length * matrix[0].length) break;
    		if (y + dxdy[dir][0] < 0 || y + dxdy[dir][0] >= matrix.length || 
    			x + dxdy[dir][1] < 0 || x + dxdy[dir][1] >= matrix[0].length ||
    			isVisit[y + dxdy[dir][0]][x + dxdy[dir][1]]) {
    			dir = (dir + 1) % 4;
    		}
    		y += dxdy[dir][0];
    		x += dxdy[dir][1];
    	}
    	
        return res;
    }
	
	public static void main(String[] args) {
		LC0054_SpiralMatrix t = new LC0054_SpiralMatrix();
		System.out.println(t.spiralOrder(new int[][] {{1}}));
		System.out.println(t.spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
		System.out.println(t.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
	}
}
