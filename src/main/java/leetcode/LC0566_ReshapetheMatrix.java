package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0566_ReshapetheMatrix {
    
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                list.add(mat[i][j]);
            }
        }
        
        if (r * c != list.size()) {
            return mat;
        }
        //System.out.println(list);
        
        int listIndex = 0;
        for (int i = 0; i < r; i++) {
            res[i] = new int[c];
            for (int j = 0; j < c; j++) {
                res[i][j] = list.get(listIndex++);
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		LC0566_ReshapetheMatrix t = new LC0566_ReshapetheMatrix();
		System.out.println(Arrays.deepToString(t.matrixReshape(new int[][] { {1, 2}, {3, 4} }, 1, 4)));		// [[1,2,3,4]]
		System.out.println(Arrays.deepToString(t.matrixReshape(new int[][] { {1, 2}, {3, 4} }, 2, 4)));		// [[1,2],[3,4]]
	}
}
