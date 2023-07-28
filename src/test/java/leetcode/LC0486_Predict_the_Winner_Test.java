package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0486_Predict_the_Winner_Test {
	@Test
	void test() {
		LC0486_Predict_the_Winner test = new LC0486_Predict_the_Winner();
		assertThat(test.PredictTheWinner(new int[] {1, 5, 2})).isEqualTo(false);
		assertThat(test.PredictTheWinner(new int[] {1, 5, 233, 7})).isEqualTo(true);
	}
}
