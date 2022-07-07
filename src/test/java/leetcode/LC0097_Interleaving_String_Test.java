package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0097_Interleaving_String_Test {
	LC0097_Interleaving_String_X test;
	
	@BeforeEach
	void setUp() {
		test = new LC0097_Interleaving_String_X();
	}
	
	@Test
	void test() {
		assertThat(test.isInterleave("aabcc", "dbbca", "aadbbcbcac")).isTrue();
		assertThat(test.isInterleave("aabcc", "dbbca", "aadbbbaccc")).isFalse();
		assertThat(test.isInterleave("", "", "")).isTrue();
	}
}
