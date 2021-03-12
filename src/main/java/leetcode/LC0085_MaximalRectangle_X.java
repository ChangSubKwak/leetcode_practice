package main.java.leetcode;

import java.util.*;

public class LC0085_MaximalRectangle_X {
	/*
    public int maximalRectangle(char[][] matrix) {
    	int row = matrix.length;
    	if (row == 0) return 0;
    	
    	int col = matrix[0].length;
    	if (col == 0) return 0;
    	
    	int[][] calc = new int[row][col];
    	
    	
        return 0;
    }
    //*/
    public int maximalRectangle(char[][] matrix) {
    	int rLen = matrix.length, cLen = rLen == 0 ? 0 : matrix[0].length, max = 0;
    	int[] h = new int[cLen+1];
    	
    	for (int row = 0; row < rLen; row++) {
    		Stack<Integer> s = new Stack<Integer>();
    		s.push(-1);
    		
    		for (int i = 0; i <= cLen ;i++) {
    			if(i < cLen && matrix[row][i] == '1')
    				h[i] += 1;
    			else h[i] = 0;

                while(s.peek() != -1 && h[i] < h[s.peek()]) {
                	int height = h[s.pop()];
                	int width  = (i - s.peek() - 1);
                	max = Math.max(max, height * width);
                }
                s.push(i);
    		}
    	}
    	return max;
    }
	
	
	public static void main(String[] args) {
		LC0085_MaximalRectangle_X t = new LC0085_MaximalRectangle_X();
		System.out.println(t.maximalRectangle(new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}));
		//System.out.println(t.maximalRectangle(new char[][] {{}}));
	}
}
