package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1575_Count_All_Possible_Routes_Test {

	@Test
	void test() {
		LC1575_Count_All_Possible_Routes test = new LC1575_Count_All_Possible_Routes();
		assertThat(test.countRoutes(new int[]{2, 3, 6, 8, 4}, 1, 3, 5)).isEqualTo(4);
		assertThat(test.countRoutes(new int[]{4, 3, 1}, 1, 0, 6)).isEqualTo(5);
		assertThat(test.countRoutes(new int[]{5, 2, 1}, 0, 2, 3)).isEqualTo(0);
	}
}
