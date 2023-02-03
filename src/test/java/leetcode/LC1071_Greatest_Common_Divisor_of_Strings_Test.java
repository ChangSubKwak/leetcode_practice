package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1071_Greatest_Common_Divisor_of_Strings_Test {
    @Test
    void test() {
        LC1071_Greatest_Common_Divisor_of_Strings test = new LC1071_Greatest_Common_Divisor_of_Strings();
        assertThat(test.gcdOfStrings("ABCABC", "ABC")).isEqualTo("ABC");
        assertThat(test.gcdOfStrings("ABABAB", "ABAB")).isEqualTo("AB");
        assertThat(test.gcdOfStrings("LEET", "CODE")).isEqualTo("");
        assertThat(test.gcdOfStrings("ABCDEF", "ABC")).isEqualTo("");
    }
}
