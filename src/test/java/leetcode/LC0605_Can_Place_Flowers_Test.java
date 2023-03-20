package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC0605_Can_Place_Flowers_Test {
	@Test
	void test() {
		LC0605_Can_Place_Flowers test = new LC0605_Can_Place_Flowers();
		assertThat(test.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1)).isTrue();
		assertThat(test.canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2)).isFalse();
	}
}
