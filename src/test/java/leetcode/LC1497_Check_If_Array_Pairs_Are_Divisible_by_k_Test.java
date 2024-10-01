package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1497_Check_If_Array_Pairs_Are_Divisible_by_k_Test {
	@Test
	void test() {
		LC1497_Check_If_Array_Pairs_Are_Divisible_by_k test = new LC1497_Check_If_Array_Pairs_Are_Divisible_by_k();

		assertThat(test.canArrange(new int[]{1, 2, 3, 4, 5, 10, 6, 7, 8, 9}, 5)).isEqualTo(true);
		assertThat(test.canArrange(new int[]{1, 2, 3, 4, 5, 6}, 7)).isEqualTo(true);
		assertThat(test.canArrange(new int[]{1, 2, 3, 4, 5, 6}, 10)).isEqualTo(false);
	}
}
