package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0300_Longest_Increasing_Sequence_Test {
	LC0300_Longest_Increasing_Sequence_X test;
	
	@BeforeEach
	void setUp() {
		test = new LC0300_Longest_Increasing_Sequence_X();
	}
	
	@Test
	void test() {
		assertThat(test.lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101, 18})).isEqualTo(4);
		assertThat(test.lengthOfLIS(new int[] {0, 1, 0, 3, 2, 3})).isEqualTo(4);
		assertThat(test.lengthOfLIS(new int[] {7, 7, 7, 7, 7, 7, 7})).isEqualTo(1);
	}
}
