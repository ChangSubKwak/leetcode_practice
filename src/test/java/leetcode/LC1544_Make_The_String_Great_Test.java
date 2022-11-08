package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1544_Make_The_String_Great_Test {

	@Test
	void test() {
		LC1544_Make_The_String_Great test = new LC1544_Make_The_String_Great();
		assertThat(test.makeGood("leEeetcode")).isEqualTo("leetcode");
		assertThat(test.makeGood("abBAcC")).isEqualTo("");
		assertThat(test.makeGood("s")).isEqualTo("s");
	}
}
