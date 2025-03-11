package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1358_Number_of_Substrings_Containing_All_Three_Characters_Test {

    @Test
    void test() {
        LC1358_Number_of_Substrings_Containing_All_Three_Characters test = new LC1358_Number_of_Substrings_Containing_All_Three_Characters();

        assertThat(test.numberOfSubstrings("abcabc")).isEqualTo(10);
        assertThat(test.numberOfSubstrings("aaacb")).isEqualTo(3);
        assertThat(test.numberOfSubstrings("abc")).isEqualTo(1);
    }
}
