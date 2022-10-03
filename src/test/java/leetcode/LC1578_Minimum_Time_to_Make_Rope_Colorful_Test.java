package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1578_Minimum_Time_to_Make_Rope_Colorful_Test {

	@Test
	void test1() {
		LC1578_Minimum_Time_to_Make_Rope_Colorful test = new LC1578_Minimum_Time_to_Make_Rope_Colorful();
		assertThat(test.minCost("abaac", new int[]{1, 2, 3, 4, 5})).isEqualTo(3);
		assertThat(test.minCost("abc", new int[]{1, 2, 3})).isEqualTo(0);
		assertThat(test.minCost("aabaa", new int[]{1, 2, 3, 4, 1})).isEqualTo(2);
	}
}
