package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1319_Number_of_Operations_to_Make_Network_Test {
	@Test
	void test() {
		LC1319_Number_of_Operations_to_Make_Network test = new LC1319_Number_of_Operations_to_Make_Network();
		assertThat(test.makeConnected(4, new int[][]{{0, 1}, {0, 2}, {1, 2}})).isEqualTo(1);
		assertThat(test.makeConnected(6, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}})).isEqualTo(2);
		assertThat(test.makeConnected(6, new int[][]{{0, 1}, {0, 2}, {1, 2}})).isEqualTo(-1);
	}
}
