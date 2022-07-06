package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0746_Min_Cost_Climbing_Stairs_Test {
	LC0746_Min_Cost_Climbing_Stairs test;
	
	@BeforeEach
	void setUp() {
		test = new LC0746_Min_Cost_Climbing_Stairs();
	}
	
	@Test
	void test() {
		assertThat(test.minCostClimbingStairs(new int[] {10, 15, 20})).isEqualTo(15);
		assertThat(test.minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1})).isEqualTo(6);
	}
}
