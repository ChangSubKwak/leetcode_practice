package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0790_Domino_and_Tromino_Tiling_Test {
	@Test
	void test() {
		LC0790_Domino_and_Tromino_Tiling test = new LC0790_Domino_and_Tromino_Tiling();

		assertThat(test.numTilings(3)).isEqualTo(5);
		assertThat(test.numTilings(1)).isEqualTo(1);
	}
}
