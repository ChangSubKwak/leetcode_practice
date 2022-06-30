package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0001_Two_Sum_Test {
	LC0001_Two_Sum test;
	
	@BeforeEach
	void setUp() {
		test = new LC0001_Two_Sum();
	}
	
	@Test
	void test() {
		assertThat(test.twoSum(new int[] {2, 7, 11, 15}, 9)).isEqualTo(new int[] {0, 1});
		assertThat(test.twoSum(new int[] {3, 2, 4}, 6)).isEqualTo(new int[] {1, 2});
		assertThat(test.twoSum(new int[] {3, 3}, 6)).isEqualTo(new int[] {0, 1});
	}
}
