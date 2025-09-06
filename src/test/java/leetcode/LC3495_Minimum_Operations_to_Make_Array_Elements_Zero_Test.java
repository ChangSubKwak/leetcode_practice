package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3495_Minimum_Operations_to_Make_Array_Elements_Zero_Test {
	LC3495_Minimum_Operations_to_Make_Array_Elements_Zero test;
	
	@BeforeEach
	void setUp() {
		test = new LC3495_Minimum_Operations_to_Make_Array_Elements_Zero();
	}
	
	@Test
	void test() {
		assertThat(test.minOperations(new int[][]{{1, 2}, {2, 4}})).isEqualTo(3);
		assertThat(test.minOperations(new int[][]{{2, 6}})).isEqualTo(4);
	}
}
