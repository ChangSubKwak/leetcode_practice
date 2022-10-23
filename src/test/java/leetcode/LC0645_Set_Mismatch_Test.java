package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0645_Set_Mismatch_Test {

	@Test
	void test() {
		LC0645_Set_Mismatch test = new LC0645_Set_Mismatch();
		assertThat(test.findErrorNums(new int[]{1, 2, 2, 4})).isEqualTo(new int[]{2, 3});
		assertThat(test.findErrorNums(new int[]{1, 1})).isEqualTo(new int[]{1, 2});
	}
}
