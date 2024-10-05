package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0567_Permutation_in_String_Test {
    @Test
    void test() {
        LC0567_Permutation_in_String test = new LC0567_Permutation_in_String();
    
        assertThat(test.checkInclusion("ab", "eidbaooo")).isEqualTo(true);
        assertThat(test.checkInclusion("ab", "eidboaoo")).isEqualTo(false);
    }
}
