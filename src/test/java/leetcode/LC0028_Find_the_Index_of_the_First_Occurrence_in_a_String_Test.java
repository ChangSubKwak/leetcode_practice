package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0028_Find_the_Index_of_the_First_Occurrence_in_a_String_Test {
	@Test
	void test() {
		LC0028_Find_the_Index_of_the_First_Occurrence_in_a_String test = new LC0028_Find_the_Index_of_the_First_Occurrence_in_a_String();
		assertThat(test.strStr("sadbutsad", "sad")).isEqualTo(0);
		assertThat(test.strStr("leetcode", "leeto")).isEqualTo(-1);
	}
}
