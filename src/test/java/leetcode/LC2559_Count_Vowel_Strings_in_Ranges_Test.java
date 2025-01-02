package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2559_Count_Vowel_Strings_in_Ranges_Test {
    @Test
    void test() {
        LC2559_Count_Vowel_Strings_in_Ranges test = new LC2559_Count_Vowel_Strings_in_Ranges();

        assertThat(test.vowelStrings(
            new String[]{"aba", "bcb", "ece", "aa", "e"},
            new int [][] {{0, 2}, {1, 4}, {1, 1}})
        ).isEqualTo(new int[]{2, 3, 0});

        assertThat(test.vowelStrings(
            new String[]{"a","e","i"},
            new int [][] {{0, 2}, {0, 1}, {2, 2}})
        ).isEqualTo(new int[]{3, 2, 1});
    }
}
