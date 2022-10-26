package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0523_Continuous_Subarray_Sum_Test {
	@Test
	void test() {
		LC0523_Continuous_Subarray_Sum test = new LC0523_Continuous_Subarray_Sum();
		assertThat(test.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6)).isTrue());
		assertThat(test.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6)).isTrue();
		assertThat(test.checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6)).isFalse();
	}
}
