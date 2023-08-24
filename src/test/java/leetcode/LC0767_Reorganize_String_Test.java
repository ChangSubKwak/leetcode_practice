package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0767_Reorganize_String_Test {
	@Test
	void test() {
		LC0767_Reorganize_String test = new LC0767_Reorganize_String();
		assertThat(test.reorganizeString("aab")).isEqualTo("aba");
		assertThat(test.reorganizeString("aaab")).isEqualTo("");
	}
}
