package leetcode;

import java.util.Arrays;

public class LC0048_RotateImage {
	/*
    public void rotate(int[][] matrix) {
    	int len = matrix.length;
    	
    	int[][] copy;
    	copy = new int[len][len];
    	//if (len % 2 == 1) copy = new int[len][len];
    	//else              copy = new int[len+1][len+1];
        
        int cx = len / 2;
        int cy = len / 2;
        
        for (int y = 0 ; y < len ; y++) {
        	for (int x = 0 ; x < len ; x++) {
        		int mx =-y + cy + cx - (len % 2 == 0 ? 1 : 0);
        		int my = x - cx + cy;
        		copy[my][mx] = matrix[y][x];
        	}
        }
        //System.out.println(Arrays.deepToString(matrix));
//        for (int i = 0 ; i < len ; i++) System.out.println(Arrays.toString(matrix[i]));
//        for (int i = 0 ; i < len ; i++) System.out.println(Arrays.toString(copy[i]));
        
    }*/
    public void rotate(int[][] matrix) {
    	int len = matrix.length;
    	
    	for (int i = 0 ; i < len ; i++) System.out.println(Arrays.toString(matrix[i]));
        for (int y = 0 ; y < len ; y++) {
        	for (int x = y + 1 ; x < len ; x++) {
        		int temp = matrix[y][x];
        		matrix[y][x] = matrix[x][y];
        		matrix[x][y] = temp;
        	}
        }
        
        for (int y = 0 ; y < len ; y++) {
        	for (int x = 0 ; x < len / 2 ; x++) {
        		int temp = matrix[y][x];
        		matrix[y][x] = matrix[y][len - x - 1];
        		matrix[y][len - x - 1] = temp;
        	}
        }
        
        for (int i = 0 ; i < len ; i++) System.out.println(Arrays.toString(matrix[i]));
    }
    
	
	public static void main(String[] args) {
		LC0048_RotateImage t = new LC0048_RotateImage();
//		int data[][] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int data[][] = new int[][] {{5,1,9,11}, {2,4,8,10}, {13,3,6,7},{15,14,12,16}};
		t.rotate(data);
		//System.out.println(Arrays.deepToString(data));
	}
}
