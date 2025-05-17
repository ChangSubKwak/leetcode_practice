package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0075_Sort_Colors {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        List<Integer> zRow = new ArrayList<>();
        List<Integer> zCol = new ArrayList<>();
        
        for (int y = 0 ; y < row ; y++) for (int x = 0 ; x < col ; x++)
        	if (matrix[y][x] == 0) { zRow.add(y); break; }
        
        for (int x = 0 ; x < col ; x++) for (int y = 0 ; y < row ; y++)
        	if (matrix[y][x] == 0) { zCol.add(x); break; }
        
        for (int i = 0 ; i < zRow.size() ; i++)
        	for(int x = 0 ; x < col ; x++)
        		matrix[zRow.get(i)][x] = 0;
        
        for (int i = 0 ; i < zCol.size() ; i++)
        	for(int y = 0 ; y < row ; y++)
        		matrix[y][zCol.get(i)] = 0;
    }
    
	public static void main(String[] args) {
		LC0075_Sort_Colors t = new LC0075_Sort_Colors();
		//int[][] matrix = new int[][] {{1,1,1},{1,0,1},{1,1,1}};
		int[][] matrix = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		t.setZeroes(matrix);
		for (int i = 0 ; i < matrix.length ; i++)
			System.out.println(Arrays.toString(matrix[i]));
		
	}
}
