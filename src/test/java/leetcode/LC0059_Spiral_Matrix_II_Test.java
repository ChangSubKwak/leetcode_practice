package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0059_Spiral_Matrix_II_Test {

	@Test
	void test() {
		LC0059_Spiral_Matrix_II test = new LC0059_Spiral_Matrix_II();

		assertThat(test.generateMatrix(3)).isEqualTo(
			new int[][] {
				{1, 2, 3},
				{8, 9, 4},
				{7, 6, 5}
			}
		);
		
		assertThat(test.generateMatrix(1)).isEqualTo(
			new int[][] {
				{1}
			}
		);
	}
}
