package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

class LC0030_Substring_with_Concatenation_of_All_Words_Test {
    LC0030_Substring_with_Concatenation_of_All_Words test;

    @BeforeEach
    void setUp() {
        test = new LC0030_Substring_with_Concatenation_of_All_Words();
    }

    @Test
    void test() {
        assertThat(test.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"})).isEqualTo(Arrays.asList(0, 9));
        assertThat(test.findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"})).isEqualTo(Arrays.asList());
        assertThat(test.findSubstring("barfoofoobarthefoobarman", new String[]{"bar","foo","the"})).isEqualTo(Arrays.asList(6, 9, 12));
    }
}