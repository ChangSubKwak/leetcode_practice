package leetcode;

public class LC0074_Search_a_2D_Matrix {
    public boolean searchMatrix2(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        
        if (row == 1) {
            for (int i = 0; i < column; i++) {
                if (matrix[0][i] == target) {
                    return true;
                }
            }
            return false;
        }
        
        for (int i = 0; i < row - 1; i++) {
            if (matrix[i][0] <= target && target <= matrix[i+1][0]) {
                for(int j = 0; j < column; j++) {
                    if (matrix[i][j] == target){
                        return true;
                    }
                }
            }
        }
        
        for (int i = 0; i < column; i++) {
            if (matrix[row - 1][i] == target) {
                return true;
            }
        }
        return false;
    }
	
	
    public boolean searchMatrix1(int[][] matrix, int target) {
    	int row = matrix.length;
    	if (row == 0) return false;
    	
    	int col = matrix[0].length;
    	if (col == 0) return false;
    	
   		for (int y = 0 ; y < row; y++) {
   			if (target <= matrix[y][col - 1]) {
   				for (int x = 0 ; x < col; x++) {
   					if (matrix[y][x] == target)
   						return true;
   				}
   				return false;	
   			}
    	}
    	return false;
    }
}
