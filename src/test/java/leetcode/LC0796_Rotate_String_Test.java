package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0796_Rotate_String_Test {
	LC0796_Rotate_String test;
	
	@Test
	void test() {
		test = new LC0796_Rotate_String();
		assertThat(test.rotateString("abcde", "cdeab")).isEqualTo(true);
		assertThat(test.rotateString("abcde", "abced")).isEqualTo(false);
	}
}
