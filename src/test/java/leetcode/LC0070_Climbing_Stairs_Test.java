package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0070_Climbing_Stairs_Test {
	LC0070_Climbing_Stairs test;
	
	@BeforeEach
	void setUp() {
		test = new LC0070_Climbing_Stairs();
	}
	
	@Test
	void test() {
		assertThat(test.climbStairs(2)).isEqualTo(2);
		assertThat(test.climbStairs(3)).isEqualTo(3);
		assertThat(test.climbStairs(45)).isEqualTo(1836311903);
	}
}
