package leetcode;

public class LC0073_SetMatrixZeroes {
    public boolean searchMatrix(int[][] matrix, int target) {
    	int row = matrix.length;
    	if (row == 0) return false;
    	
    	int col = matrix[0].length;
    	if (col == 0) return false;
    	
   		for (int y = 0 ; y < row ; y++) {
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
    
	public static void main(String[] args) {
		LC0073_SetMatrixZeroes t = new LC0073_SetMatrixZeroes();
		System.out.println(t.searchMatrix(new int[][] {{1}}, 1));
		System.out.println(t.searchMatrix(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 3));
		System.out.println(t.searchMatrix(new int[][] {{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 13));
	}
}
