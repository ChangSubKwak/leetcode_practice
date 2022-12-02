package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1657_Determine_if_Two_Strings_Are_Close_Test {

    @Test
    void exampleTest() {
        LC1657_Determine_if_Two_Strings_Are_Close test = new LC1657_Determine_if_Two_Strings_Are_Close();
        assertThat(test.closeStrings("abc", "bca")).isTrue();
        assertThat(test.closeStrings("a", "aa")).isFalse();
        assertThat(test.closeStrings("cabbba", "abbccc")).isTrue();
    }
}
