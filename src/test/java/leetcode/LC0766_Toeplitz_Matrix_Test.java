package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0766_Toeplitz_Matrix_Test {
	@Test
	void test() {
		LC0766_Toeplitz_Matrix test = new LC0766_Toeplitz_Matrix();
		assertThat(test.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}})).isTrue();
		assertThat(test.isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}})).isFalse();
	}
}
