package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0073_Set_Matrix_Zeroes_Test {

	@Test
	void test1() {
		LC0073_Set_Matrix_Zeroes test = new LC0073_Set_Matrix_Zeroes();

		int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
		test.setZeroes(matrix);
		assertThat(matrix).isEqualTo(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}});
	}

	@Test
	void test2() {
		LC0073_Set_Matrix_Zeroes test = new LC0073_Set_Matrix_Zeroes();

		int[][] matrix = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		test.setZeroes(matrix);
		assertThat(matrix).isEqualTo(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}});
	}
}
