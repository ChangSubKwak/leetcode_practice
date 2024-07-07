package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1518_Water_Bottles_Test {

	@Test
	void test() {
		LC1518_Water_Bottles test = new LC1518_Water_Bottles();

		assertThat(test.numWaterBottles(9, 3)).isEqualTo(13);
		assertThat(test.numWaterBottles(15, 4)).isEqualTo(19);
	}
}
