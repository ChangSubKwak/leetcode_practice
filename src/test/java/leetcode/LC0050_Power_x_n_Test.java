package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0050_Power_x_n_Test {

	@Test
	void test() {
		LC0050_Power_x_n test = new LC0050_Power_x_n();
		assertThat(test.myPow(2, 10)).isEqualTo(1024);
		assertThat(test.myPow(2.1, 3)).isEqualTo(9.261);
		assertThat(test.myPow(2, -2)).isEqualTo(0.25);
	}
}
