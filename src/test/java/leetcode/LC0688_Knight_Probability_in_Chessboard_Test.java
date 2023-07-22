package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC0688_Knight_Probability_in_Chessboard_Test {
	@Test
	void minimumTotal() {
		LC0688_Knight_Probability_in_Chessboard test = new LC0688_Knight_Probability_in_Chessboard();
		assertThat(test.knightProbability(3, 2, 0, 0)).isEqualTo(0.0625);
		assertThat(test.knightProbability(1, 0, 0, 0)).isEqualTo(1);
	}
}
