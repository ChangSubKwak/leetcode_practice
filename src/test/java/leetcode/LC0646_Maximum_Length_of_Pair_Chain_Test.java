package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0646_Maximum_Length_of_Pair_Chain_Test {

	@Test
	void test() {
		LC0646_Maximum_Length_of_Pair_Chain test = new LC0646_Maximum_Length_of_Pair_Chain();
		assertThat(test.findLongestChain(new int[][]{{1, 2}, {2, 3}, {3, 4}})).isEqualTo(2);
		assertThat(test.findLongestChain(new int[][]{{1, 2}, {7, 8}, {4, 5}})).isEqualTo(3);
	}
}
