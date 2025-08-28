package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3459_Length_of_Longest_V_Shaped_Diagonal_Segment_Test {
	LC3459_Length_of_Longest_V_Shaped_Diagonal_Segment test;
	
	@BeforeEach
	void setUp() {
		test = new LC3459_Length_of_Longest_V_Shaped_Diagonal_Segment();
	}
	
	@Test
	void test() {
		assertThat(test.lenOfVDiagonal(new int[][]{
				{2, 2, 1, 2, 2},
				{2, 0, 2, 2, 0},
				{2, 0, 1, 1, 0},
				{1, 0, 2, 2, 2},
				{2, 0, 0, 2, 2}
		})).isEqualTo(5);

		assertThat(test.lenOfVDiagonal(new int[][]{
				{2, 2, 2, 2, 2},
				{2, 0, 2, 2, 0},
				{2, 0, 1, 1, 0},
				{1, 0, 2, 2, 2},
				{2, 0, 0, 2, 2}
		})).isEqualTo(4);

		assertThat(test.lenOfVDiagonal(new int[][]{
				{1, 2, 2, 2, 2},
				{2, 2, 2, 2, 0},
				{2, 0, 0, 0, 0},
				{0, 0, 2, 2, 2},
				{2, 0, 0, 2, 0}
		})).isEqualTo(5);
	}
}
