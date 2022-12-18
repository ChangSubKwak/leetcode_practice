package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

import leetcode.LC0729_My_Calendar_I.*;

class LC0739_Daily_Temperatures_Test {
	@Test
	void test() {
		LC0739_Daily_Temperatures test = new LC0739_Daily_Temperatures();
		assertThat(test.dailyTemperatures(new int []{73, 74, 75, 71, 69, 72, 76, 73})).isEqualTo(new int[]{1, 1, 4, 2, 1, 1, 0, 0});
	}
}
