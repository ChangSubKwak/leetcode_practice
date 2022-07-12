package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0473_Matchsticks_to_Square_Test {
	LC0473_Matchsticks_to_Square test;
	
	@BeforeEach
	void setUp() {
		test = new LC0473_Matchsticks_to_Square();
	}
	
	@Test
	void test() {
		assertThat(test.makesquare(new int[] {1, 1, 2, 2, 2})).isEqualTo(true);
		assertThat(test.makesquare(new int[] {3, 3, 3, 3, 4})).isEqualTo(false);
	}
}
