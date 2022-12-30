package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LC0797_All_Paths_From_Source_to_Target_Test {
	@Test
	void test() {
		LC0797_All_Paths_From_Source_to_Target test = new LC0797_All_Paths_From_Source_to_Target();

		Assertions.assertThat(test.allPathsSourceTarget(new int[][]{
			{1, 2}, {3}, {3}, {}
		})).isEqualTo(Arrays.asList(
			Arrays.asList(0, 1, 3),
			Arrays.asList(0, 2, 3)
		));

		Assertions.assertThat(test.allPathsSourceTarget(new int[][]{
			{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}
		})).isEqualTo(Arrays.asList(
			Arrays.asList(0, 4),
			Arrays.asList(0, 3, 4),
			Arrays.asList(0, 1, 3, 4),
			Arrays.asList(0, 1, 2, 3, 4),
			Arrays.asList(0, 1, 4)
		));
	}
}
