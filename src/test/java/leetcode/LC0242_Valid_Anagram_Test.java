package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0242_Valid_Anagram_Test {
	LC0242_Valid_Anagram test;
	
	@BeforeEach
	void setUp() {
		test = new LC0242_Valid_Anagram();
	}
	
	@Test
	void test() {
		assertThat(test.isAnagram("anagram", "nagaram")).isEqualTo(true);
		assertThat(test.isAnagram("rat", "car")).isEqualTo(false);
	}
}
