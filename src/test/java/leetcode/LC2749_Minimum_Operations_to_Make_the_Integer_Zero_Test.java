package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2749_Minimum_Operations_to_Make_the_Integer_Zero_Test {
	LC2749_Minimum_Operations_to_Make_the_Integer_Zero test;
	
	@BeforeEach
	void setUp() {
		test = new LC2749_Minimum_Operations_to_Make_the_Integer_Zero();
	}
	
	@Test
	void test() {
		assertThat(test.makeTheIntegerZero(3, 2)).isEqualTo(3);
		assertThat(test.makeTheIntegerZero(5, 7)).isEqualTo(-1);
	}
}
