package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0046_Permutations_Test {

	@Test
	void test() {
		LC0046_Permutations test = new LC0046_Permutations();
		assertThat(test.permute(new int[]{1, 2, 3})).isEqualTo(
			Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(1, 3, 2),
				Arrays.asList(2, 1, 3),
				Arrays.asList(2, 3, 1),
				Arrays.asList(3, 1, 2),
				Arrays.asList(3, 2, 1)
			)
		);

		assertThat(test.permute(new int[]{0, 1})).isEqualTo(
			Arrays.asList(
				Arrays.asList(0, 1),
				Arrays.asList(1, 0)
			)
		);

		assertThat(test.permute(new int[]{1})).isEqualTo(
			Arrays.asList(
				Arrays.asList(1)
			)
		);

	}
}
