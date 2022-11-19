package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0587_Erect_the_Fence_Test {
	@Test
	void test() {
		LC0587_Erect_the_Fence_X test = new LC0587_Erect_the_Fence_X();
		assertThat(test.outerTrees(new int[][]{{1, 1}, {2, 2}, {2, 0}, {2, 4}, {3, 3}, {4, 2}})).isEqualTo(
			new int[][] {
				{1, 1}, {2, 0}, {3, 3}, {2, 4}, {4, 2}
			}
		);

		assertThat(test.outerTrees(new int[][]{{1, 2}, {2, 2}, {4, 2}})).isEqualTo(
			new int[][] {
				{4, 2}, {2, 2}, {1, 2}
			}
		);
	}
}
