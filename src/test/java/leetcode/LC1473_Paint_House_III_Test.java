package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1473_Paint_House_III_Test {
	LC1473_Paint_House_III test;
	
	@BeforeEach
	void setUp() {
		test = new LC1473_Paint_House_III();
	}
	
	@Test
	void test1() {
		assertThat(test.minCost(new int[] {0, 0, 0, 0, 0}, new int[][] {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}}, 5, 2, 3)).isEqualTo(9);
	}
	
	@Test
	void test2() {
		assertThat(test.minCost(new int[] {0, 2, 1, 2, 0}, new int[][] {{1, 10}, {10, 1}, {10, 1}, {1, 10}, {5, 1}}, 5, 2, 3)).isEqualTo(11);
	}
	
	@Test
	void test3() {
		assertThat(test.minCost(new int[] {3, 1, 2, 3}, new int[][] {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}, {1, 1, 1}}, 4, 3, 3)).isEqualTo(-1);
	}
}
