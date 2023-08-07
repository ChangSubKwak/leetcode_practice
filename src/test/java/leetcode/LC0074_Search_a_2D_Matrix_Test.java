package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0074_Search_a_2D_Matrix_Test {

	@Test
	void test() {
		LC0074_Search_a_2D_Matrix test = new LC0074_Search_a_2D_Matrix();

		assertThat(test.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3)).isEqualTo(true);
		assertThat(test.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13)).isEqualTo(false);
	}
}
