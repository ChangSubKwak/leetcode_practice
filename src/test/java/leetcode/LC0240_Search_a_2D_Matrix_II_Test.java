package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0240_Search_a_2D_Matrix_II_Test {
	LC0240_Search_a_2D_Matrix_II test;
	
	@BeforeEach
	void setUp() {
		test = new LC0240_Search_a_2D_Matrix_II();
	}
	
	@Test
	void test() {
		assertThat(test.searchMatrix(new int[][] {
			{1, 4, 7, 11, 15},
			{2, 5, 8, 12, 19},
			{3, 6, 9, 16, 22},
			{10, 13, 14, 17, 24},
			{18, 21, 23, 26, 30}
		}, 5)).isTrue();

		assertThat(test.searchMatrix(new int[][] {
			{1, 4, 7, 11, 15},
			{2, 5, 8, 12, 19},
			{3, 6, 9, 16, 22},
			{10, 13, 14, 17, 24},
			{18, 21, 23, 26, 30}
		}, 20)).isFalse();
	}
}
