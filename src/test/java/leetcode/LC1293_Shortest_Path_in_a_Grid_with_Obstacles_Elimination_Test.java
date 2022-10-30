package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1293_Shortest_Path_in_a_Grid_with_Obstacles_Elimination_Test {
	@Test
	void test() {
		LC1293_Shortest_Path_in_a_Grid_with_Obstacles_Elimination_X test = new LC1293_Shortest_Path_in_a_Grid_with_Obstacles_Elimination_X();
		assertThat(test.shortestPath(new int[][] {
			{0, 0, 0},
			{1, 1, 0},
			{0, 0, 0},
			{0, 1, 1},
			{0, 0, 0}
		}, 1)).isEqualTo(6);

		assertThat(test.shortestPath(new int[][] {
			{0, 1, 1},
			{1, 1, 1},
			{1, 0, 0}
		}, 1)).isEqualTo(-1);
	}
}
