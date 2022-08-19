package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0659_Split_Array_into_Consecutive_Subsequences_Test {
	LC0659_Split_Array_into_Consecutive_Subsequences_X test;
	
	@BeforeEach
	void setUp() {
		test = new LC0659_Split_Array_into_Consecutive_Subsequences_X();
	}
	
	@Test
	void test() {
		assertThat(test.isPossible(new int[] {1, 2, 3, 3, 4, 5})).isTrue();
		assertThat(test.isPossible(new int[] {1, 2, 3, 3, 4, 4, 5, 5})).isTrue();
		assertThat(test.isPossible(new int[] {1, 2, 3, 4, 4, 5})).isFalse();
	}
}
