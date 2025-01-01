package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1422_Maximum_Score_After_Splitting_a_String_Test {
    @Test
    void test() {
        LC1422_Maximum_Score_After_Splitting_a_String test = new LC1422_Maximum_Score_After_Splitting_a_String();

        assertThat(test.maxScore("011101")).isEqualTo(5);
        assertThat(test.maxScore("00111")).isEqualTo(5);
        assertThat(test.maxScore("1111")).isEqualTo(3);
    }
}
