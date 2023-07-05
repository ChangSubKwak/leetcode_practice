package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC1493_Longest_Subarray_of_1s_After_Deleting_One_Element_Test {
	@Test
	void test() {
		LC1493_Longest_Subarray_of_1s_After_Deleting_One_Element test = new LC1493_Longest_Subarray_of_1s_After_Deleting_One_Element();
		assertThat(test.longestSubarray(new int[]{1, 1, 0, 1})).isEqualTo(3);
		assertThat(test.longestSubarray(new int[]{0, 1, 1, 0, 1, 1, 0, 1})).isEqualTo(5);
		assertThat(test.longestSubarray(new int[]{0, 1, 1, 0, 1, 1, 0, 1})).isEqualTo(5);
	}
}
