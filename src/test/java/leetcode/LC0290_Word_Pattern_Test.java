package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0290_Word_Pattern_Test {

	@Test
	void test() {
		LC0290_Word_Pattern test = new LC0290_Word_Pattern();
		assertThat(test.wordPattern("abba", "dog cat cat dog")).isTrue();
		assertThat(test.wordPattern("abba", "dog cat cat fish")).isFalse();
		assertThat(test.wordPattern("aaaa", "dog cat cat dog")).isFalse();
	}
}
