package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0689_Maximum_Sum_of_3_Non_Overlapping_Subarrays_Test {
	@Test
	void minimumTotal() {
		LC0689_Maximum_Sum_of_3_Non_Overlapping_Subarrays test = new LC0689_Maximum_Sum_of_3_Non_Overlapping_Subarrays();

		assertThat(test.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 6, 7, 5, 1}, 2)).isEqualTo(new int[]{0, 3, 5});
		assertThat(test.maxSumOfThreeSubarrays(new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1}, 2)).isEqualTo(new int[]{0, 2, 4});
	}
}
