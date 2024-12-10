package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2981_Find_Longest_Special_Substring_That_Occurs_Thrice_I_Test {

    @Test
    void test() {
        LC2981_Find_Longest_Special_Substring_That_Occurs_Thrice_I test = new LC2981_Find_Longest_Special_Substring_That_Occurs_Thrice_I();

        assertThat(test.maximumLength("aaaa")).isEqualTo(2);
        assertThat(test.maximumLength("abcdef")).isEqualTo(-1);
        assertThat(test.maximumLength("abcaba")).isEqualTo(1);
    }
}
