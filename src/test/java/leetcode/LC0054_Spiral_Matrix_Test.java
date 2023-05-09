package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0054_Spiral_Matrix_Test {

	@Test
	void test() {
		LC0054_Spiral_Matrix test = new LC0054_Spiral_Matrix();

		assertThat(test.spiralOrder(new int[][]{
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		})).isEqualTo(
			Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5)
		);

		assertThat(test.spiralOrder(new int[][]{
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		})).isEqualTo(
			Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
		);
	}
}
