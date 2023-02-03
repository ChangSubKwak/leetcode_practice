package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0006_Zigzag_Conversion_Test {
	@Test
	void test() {
		LC0006_Zigzag_Conversion test = new LC0006_Zigzag_Conversion();
		assertThat(test.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
		assertThat(test.convert("PAYPALISHIRING", 4)).isEqualTo("PINALSIGYAHRPI");
		assertThat(test.convert("A", 1)).isEqualTo("A");
	}
}
