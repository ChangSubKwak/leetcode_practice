package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3227_Vowels_Game_in_a_String_Test {
	LC3227_Vowels_Game_in_a_String test;
	
	@BeforeEach
	void setUp() {
		test = new LC3227_Vowels_Game_in_a_String();
	}
	
	@Test
	void test() {
		assertThat(test.twoSum("leetcoder")).doesAliceWin(true);
		assertThat(test.twoSum("bbcd")).doesAliceWin(false);
	}
}
