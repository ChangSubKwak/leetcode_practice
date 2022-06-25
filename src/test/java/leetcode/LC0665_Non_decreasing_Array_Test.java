package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC0665_Non_decreasing_Array_Test {
	LC0665_Non_decreasing_Array_X test;

	@BeforeEach
	void setUp() {
		test = new LC0665_Non_decreasing_Array_X();
	}

	@Test
	void minimumTotal() {
		assertThat(test.checkPossibility(new int[] { 4, 2, 3 })).isTrue();
		assertThat(test.checkPossibility(new int[] { 4, 2, 1 })).isFalse();
		assertThat(test.checkPossibility(new int[] { 3, 4, 2, 3 })).isFalse();
	}
}
