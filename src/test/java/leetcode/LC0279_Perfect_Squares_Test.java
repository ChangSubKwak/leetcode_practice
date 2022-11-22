package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0279_Perfect_Squares_Test {

	@Test
	void test() {
		LC0279_Perfect_Squares test = new LC0279_Perfect_Squares();
		assertThat(test.numSquares(12)).isEqualTo(3);
		assertThat(test.numSquares(13)).isEqualTo(2);
	}
}
