package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3264_Final_Array_State_After_K_Multiplication_Operations_I_Test {
    @Test
    void test() {
        LC3264_Final_Array_State_After_K_Multiplication_Operations_I test = new LC3264_Final_Array_State_After_K_Multiplication_Operations_I();

        assertThat(test.getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2)).isEqualTo(new int[]{8, 4, 6, 5, 6});
        assertThat(test.getFinalState(new int[]{1, 2}, 3, 4)).isEqualTo(new int[]{16, 8});
    }
}
