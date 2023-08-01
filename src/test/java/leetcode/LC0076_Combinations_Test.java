package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LC0076_Combinations_Test {
	@Test
	void test() {
		LC0076_Combinations test = new LC0076_Combinations();
		assertThat(test.combine(4, 2)).isEqualTo(
			Arrays.asList(
				Arrays.asList(1, 2),
				Arrays.asList(1, 3),
				Arrays.asList(1, 4),
				Arrays.asList(2, 3),
				Arrays.asList(2, 4),
				Arrays.asList(3, 4)
			)
		);

		assertThat(test.combine(1, 1)).isEqualTo(
			Arrays.asList(
				Arrays.asList(1)
			)
		);
	}
}
