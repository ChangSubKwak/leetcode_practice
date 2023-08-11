package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0518_Coin_Change_II_Test {
	@Test
	void test() {
		LC0518_Coin_Change_II  test = new LC0518_Coin_Change_II();
		assertThat(test.change(5,  new int[]{1, 2, 5})).isEqualTo(4);
		assertThat(test.change(3,  new int[]{2})).isEqualTo(0);
		assertThat(test.change(10, new int[]{10})).isEqualTo(1);
	}
}
