package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3174_Clear_Digits_Test {
    @Test
    void test() {
        LC3174_Clear_Digits test = new LC3174_Clear_Digits();

        assertThat(test.clearDigits("abc")).isEqualTo("abc");
        assertThat(test.clearDigits("cb34")).isEqualTo("");
    }
}
