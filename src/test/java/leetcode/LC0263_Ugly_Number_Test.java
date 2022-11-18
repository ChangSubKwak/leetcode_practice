package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0263_Ugly_Number_Test {

	@Test
	void test() {
		LC0263_Ugly_Number test = new LC0263_Ugly_Number();
		assertThat(test.isUgly(6)).isTrue();
		assertThat(test.isUgly(1)).isTrue();
		assertThat(test.isUgly(14)).isFalse();
	}
}
