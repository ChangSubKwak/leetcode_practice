package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0073_Set_Matrix_Zeroes {
	public void setZeroes(int[][] matrix) {
		List<int[]> list = new ArrayList<>();
		for (int y = 0; y < matrix.length; y++) {
			for (int x = 0; x < matrix[0].length; x++) {
				if (matrix[y][x] == 0) {
					list.add(new int[]{y, x});
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			int[] original = list.get(i);

			for (int x = 0; x < matrix[0].length; x++) {
				matrix[original[0]][x] = 0;
			}

			for (int y = 0; y < matrix.length; y++) {
				matrix[y][original[1]] = 0;
			}
		}
	}
}
