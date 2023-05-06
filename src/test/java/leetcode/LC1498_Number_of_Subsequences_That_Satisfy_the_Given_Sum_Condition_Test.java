package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition_Test {
	@Test
	void test() {
		LC1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition test = new LC1498_Number_of_Subsequences_That_Satisfy_the_Given_Sum_Condition();
		assertThat(test.numSubseq(new int[]{3, 5, 6, 7}, 9)).isEqualTo(4);
		assertThat(test.numSubseq(new int[]{3, 3, 6, 8}, 10)).isEqualTo(6);
		assertThat(test.numSubseq(new int[]{2, 3, 3, 4, 6, 7}, 12)).isEqualTo(61);
	}
}
