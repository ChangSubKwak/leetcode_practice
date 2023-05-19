package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0785_Is_Graph_Bipartite_Test {
	@Test
	void test() {
		LC0785_Is_Graph_Bipartite test = new LC0785_Is_Graph_Bipartite();
		assertThat(test.isBipartite(new int[][]{
			{1, 2, 3},
			{0, 2},
			{0, 1, 3},
			{0, 2}
		})).isEqualTo(false);

		assertThat(test.isBipartite(new int[][]{
			{1, 3},
			{0, 2},
			{0, 3},
			{0, 2}
		})).isEqualTo(false);
	}
}
