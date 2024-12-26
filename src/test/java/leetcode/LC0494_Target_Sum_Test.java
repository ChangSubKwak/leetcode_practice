package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0494_Target_Sum_Test {
	@Test
	void test() {
		LC0494_Target_Sum test = new LC0494_Target_Sum();

		assertThat(test.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3)).isEqualTo(3);
		assertThat(test.findTargetSumWays(new int[]{1}, 1)).isEqualTo(1);
	}
}
