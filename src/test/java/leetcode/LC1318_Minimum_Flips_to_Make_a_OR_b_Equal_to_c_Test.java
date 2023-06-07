package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1318_Minimum_Flips_to_Make_a_OR_b_Equal_to_c_Test {
	@Test
	void test() {
		LC1318_Minimum_Flips_to_Make_a_OR_b_Equal_to_c test = new LC1318_Minimum_Flips_to_Make_a_OR_b_Equal_to_c();
		assertThat(test.minFlips(2, 6, 5)).isEqualTo(3);
		assertThat(test.minFlips(4, 2, 7)).isEqualTo(1);
		assertThat(test.minFlips(1, 2, 3)).isEqualTo(0);
	}
}
