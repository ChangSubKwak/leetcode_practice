package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3306_Count_of_Substrings_Containing_Every_Vowel_and_K_Consonants_II_Test {
    @Test
    void test() {
        LC3306_Count_of_Substrings_Containing_Every_Vowel_and_K_Consonants_II test = new LC3306_Count_of_Substrings_Containing_Every_Vowel_and_K_Consonants_II();

        assertThat(test.countOfSubstrings("aeioqq", 1)).isEqualTo(0);
        assertThat(test.countOfSubstrings("aeiou", 0)).isEqualTo(1);
        assertThat(test.countOfSubstrings("ieaouqqieaouqq", 1)).isEqualTo(3);
    }
}
