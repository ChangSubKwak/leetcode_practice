package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0744_Find_Smallest_Letter_Greater_Than_Target_Test {
	@Test
	void test() {
		LC0744_Find_Smallest_Letter_Greater_Than_Target test = new LC0744_Find_Smallest_Letter_Greater_Than_Target();
		assertThat(test.nextGreatestLetter("cfj".toCharArray(), 'a')).isEqualTo('c');
		assertThat(test.nextGreatestLetter("cfj".toCharArray(), 'c')).isEqualTo('f');
		assertThat(test.nextGreatestLetter("xxyy".toCharArray(), 'z')).isEqualTo('x');
	}
}
