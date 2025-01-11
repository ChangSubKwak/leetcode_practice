package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1400_Construct_K_Palindrome_Strings_Test {
    @Test
    void test() {
        LC1400_Construct_K_Palindrome_Strings test = new LC1400_Construct_K_Palindrome_Strings();

        assertThat(test.canConstruct("annabelle", 2)).isEqualTo(true);
        assertThat(test.canConstruct("leetcode", 3)).isEqualTo(true);
        assertThat(test.canConstruct("true", 4)).isEqualTo(true);
    }
}
