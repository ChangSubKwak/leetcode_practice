package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1304_Find_N_Unique_Integers_Sum_up_to_Zero_Test {
	LC1304_Find_N_Unique_Integers_Sum_up_to_Zero test;
	
	@BeforeEach
	void setUp() {
		test = new LC1304_Find_N_Unique_Integers_Sum_up_to_Zero();
	}
	
	@Test
	void test() {
		assertThat(test.sumZero(5)).isEqualTo(new int[]{-7, -1, 1, 3, 4});
		assertThat(test.sumZero(3)).isEqualTo(new int[]{-1, 0, 1});
		assertThat(test.sumZero(1)).isEqualTo(new int[]{0});
	}
}
