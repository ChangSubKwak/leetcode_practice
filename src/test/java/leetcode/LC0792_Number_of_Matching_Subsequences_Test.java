package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0792_Number_of_Matching_Subsequences_Test {
	LC0792_Number_of_Matching_Subsequences test;
	
	@BeforeEach
	void setUp() {
		test = new LC0792_Number_of_Matching_Subsequences();
	}
	
	@Test
	void test() {
		assertThat(test.numMatchingSubseq("abcde", new String[] {"a", "bb", "acd", "ace"})).isEqualTo(3);
		assertThat(test.numMatchingSubseq("dsahjpjauf", new String[] {"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"})).isEqualTo(2);
	}
}
