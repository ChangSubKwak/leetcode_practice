package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0781_Rabbits_in_Forest_Test {
	@Test
	void test() {
		LC0781_Rabbits_in_Forest test = new LC0781_Rabbits_in_Forest();

		assertThat(test.numRabbits(new int[]{1, 1, 2})).isEqualTo(5);
		assertThat(test.numRabbits(new int[]{10, 10, 10})).isEqualTo(11);
	}
}
