package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1574_Shortest_Subarray_to_be_Removed_to_Make_Array_Sorted_Test {

	@Test
	void test() {
		LC1574_Shortest_Subarray_to_be_Removed_to_Make_Array_Sorted test = new LC1574_Shortest_Subarray_to_be_Removed_to_Make_Array_Sorted();

		assertThat(test.findLengthOfShortestSubarray(new int[]{1, 2, 3, 10, 4, 2, 3, 5})).isEqualTo(3);
		assertThat(test.findLengthOfShortestSubarray(new int[]{5, 4, 3, 2, 1})).isEqualTo(4);
		assertThat(test.findLengthOfShortestSubarray(new int[]{1, 2, 3})).isEqualTo(0);
	}
}
