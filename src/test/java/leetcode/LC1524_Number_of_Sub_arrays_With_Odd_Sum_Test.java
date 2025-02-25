package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC1524_Number_of_Sub_arrays_With_Odd_Sum_Test {

	@Test
	void test() {
		LC1524_Number_of_Sub_arrays_With_Odd_Sum test = new LC1524_Number_of_Sub_arrays_With_Odd_Sum();

		assertThat(test.numOfSubarrays(new int[]{1, 3, 5})).isEqualTo(4);
		assertThat(test.numOfSubarrays(new int[]{2, 4, 6})).isEqualTo(0);
		assertThat(test.numOfSubarrays(new int[]{1, 2, 3, 4, 5, 6, 7})).isEqualTo(16);
	}
}
