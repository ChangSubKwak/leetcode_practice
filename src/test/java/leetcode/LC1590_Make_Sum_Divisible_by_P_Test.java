package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1590_Make_Sum_Divisible_by_P_Test {

	@Test
	void test() {
		LC1590_Make_Sum_Divisible_by_P test = new LC1590_Make_Sum_Divisible_by_P();

		assertThat(test.minSubarray(new int[]{3, 1, 4, 2}, 6)).isEqualTo(1);
		assertThat(test.minSubarray(new int[]{6, 3, 5, 2}, 9)).isEqualTo(2);
		assertThat(test.minSubarray(new int[]{1, 2, 3}, 3)).isEqualTo(0);
	}
}
