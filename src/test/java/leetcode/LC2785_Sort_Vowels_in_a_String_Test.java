package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2785_Sort_Vowels_in_a_String_Test {
    @Test
    void test() {
        LC2785_Sort_Vowels_in_a_String test = new LC2785_Sort_Vowels_in_a_String();
        assertThat(test.sortVowels("lEetcOde")).isEqualTo("lEOtcede");
        assertThat(test.sortVowels("lYmpH")).isEqualTo("lYmpH");
    }
}
