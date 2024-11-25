package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0773_Sliding_Puzzle_Test {
	@Test
	void test() {
		LC0773_Sliding_Puzzle test = new LC0773_Sliding_Puzzle();

		assertThat(test.slidingPuzzle(new int[][]{
				{1, 2, 3},
				{4, 0, 5}
		})).isEqualTo(1);

		assertThat(test.slidingPuzzle(new int[][]{
				{1, 2, 3},
				{5, 4, 0}
		})).isEqualTo(-1);

		assertThat(test.slidingPuzzle(new int[][]{
				{4, 1, 2},
				{5, 0, 3}
		})).isEqualTo(5);
	}
}
