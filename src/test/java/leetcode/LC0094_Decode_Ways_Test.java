package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0094_Decode_Ways_Test {
	@Test
	void test() {
		LC0094_Decode_Ways test = new LC0094_Decode_Ways();
		assertThat(test.numDecodings("12")).isEqualTo(2);
		assertThat(test.numDecodings("226")).isEqualTo(3);
		assertThat(test.numDecodings("06")).isEqualTo(0);
	}
}
