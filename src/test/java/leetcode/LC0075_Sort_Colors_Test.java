package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0075_Sort_Colors_Test {

	@Test
	void test() {
		LC0075_Sort_Colors test = new LC0075_Sort_Colors();

		assertThat(test.sortColors(new int[]{2, 0, 2, 1, 1, 0})).isEqualTo(new int[]{0, 0, 1, 1, 2, 2});
		assertThat(test.sortColors(new int[]{2, 0, 1})).isEqualTo(new int[]{0, 1, 2});
	}
}
