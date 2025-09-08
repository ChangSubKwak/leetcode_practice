package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1304_Find_N_Unique_Integers_Sum_up_to_Zero_Test {
	LC1304_Find_N_Unique_Integers_Sum_up_to_Zero test;
	
	@BeforeEach
	void setUp() {
		test = new LC1304_Find_N_Unique_Integers_Sum_up_to_Zero();
	}
	
	@Test
	void test() {
		assertThat(Arrays.stream(test.sumZero(5)).sum()).isEqualTo(0);
		assertThat(Arrays.stream(test.sumZero(3)).sum()).isEqualTo(0);
		assertThat(Arrays.stream(test.sumZero(1)).sum()).isEqualTo(0);
	}
}
