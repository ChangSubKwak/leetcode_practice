package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0498_Diagonal_Traverse_Test {
	@Test
	void test() {
		LC0498_Diagonal_Traverse test = new LC0498_Diagonal_Traverse();

		assertThat(test.findDiagonalOrder(new int[][]{
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		})).isEqualTo(new int []{1, 2, 4, 7, 5, 3, 6, 8, 9});

		assertThat(test.findDiagonalOrder(new int[][]{
				{1, 2}, {3, 4}
		})).isEqualTo(new int []{1, 2, 3, 4});
	}
}
