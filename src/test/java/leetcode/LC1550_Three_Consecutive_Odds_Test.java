package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1550_Three_Consecutive_Odds_Test {

	@Test
	void test() {
		LC1550_Three_Consecutive_Odds test = new LC1550_Three_Consecutive_Odds();

		assertThat(test.threeConsecutiveOdds(new int[]{2, 6, 4, 1})).isEqualTo(false);
		assertThat(test.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12})).isEqualTo(true);
	}
}
