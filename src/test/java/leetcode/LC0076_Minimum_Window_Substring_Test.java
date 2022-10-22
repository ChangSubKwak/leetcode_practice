package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0076_Minimum_Window_Substring_Test {
	@Test
	void test() {
		LC0076_Minimum_Window_Substring_X2 test = new LC0076_Minimum_Window_Substring_X2();
		assertThat(test.minWindow("ADOBECODEBANC", "ABC")).isEqualTo("BANC");
		assertThat(test.minWindow("a", "a")).isEqualTo("a");
		assertThat(test.minWindow("a", "aa")).isEqualTo("");
	}
}
