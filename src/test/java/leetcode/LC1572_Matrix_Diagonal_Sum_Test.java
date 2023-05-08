package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1572_Matrix_Diagonal_Sum_Test {

	@Test
	void test() {
		LC1572_Matrix_Diagonal_Sum test = new LC1572_Matrix_Diagonal_Sum();
		assertThat(test.diagonalSum(new int[][]{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		})).isEqualTo(25);

		assertThat(test.diagonalSum(new int[][]{
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		})).isEqualTo(8);

		assertThat(test.diagonalSum(new int[][]{
			{5}
		})).isEqualTo(5);
	}
}
