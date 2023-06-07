package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1502_Can_Make_Arithmetic_Progression_From_Sequence_Test {

	@Test
	void test() {
		LC1502_Can_Make_Arithmetic_Progression_From_Sequence test = new LC1502_Can_Make_Arithmetic_Progression_From_Sequence();
		assertThat(test.canMakeArithmeticProgression(new int[]{3, 5, 1})).isTrue();
		assertThat(test.canMakeArithmeticProgression(new int[]{1, 2, 4})).isFalse();
	}
}
