package leetcode;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1557_Minimum_Number_of_Vertices_to_Reach_All_Test {

	@Test
	void test() {
		LC1557_Minimum_Number_of_Vertices_to_Reach_All test = new LC1557_Minimum_Number_of_Vertices_to_Reach_All();
		assertThat(test.findSmallestSetOfVertices(6,
			Arrays.asList(
				Arrays.asList(0, 1),
				Arrays.asList(0, 2),
				Arrays.asList(2, 5),
				Arrays.asList(3, 4),
				Arrays.asList(4, 2)
			))
		).isEqualTo(Arrays.asList(0, 3));

		assertThat(test.findSmallestSetOfVertices(5,
			Arrays.asList(
				Arrays.asList(0, 1),
				Arrays.asList(2, 1),
				Arrays.asList(3, 1),
				Arrays.asList(1, 4),
				Arrays.asList(2, 4)
			))
		).isEqualTo(Arrays.asList(0, 2, 3));
	}
}
