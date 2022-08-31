package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0048_Rotate_Image_Test {
	LC0048_Rotate_Image test;
	
	@BeforeEach
	void setUp() {
		test = new LC0048_Rotate_Image();
	}
	
	@Test
	void test() {
		int[][] matrix = new int[][] {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		test.rotate(matrix);
		assertThat(matrix).isEqualTo(new int[][] {
			{7, 4, 1},
			{8, 5, 2},
			{9, 6, 3}
		});
	}
}
