package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3133_Minimum_Array_End_Test {
    @Test
    void test() {
        LC3133_Minimum_Array_End test = new LC3133_Minimum_Array_End();

        assertThat(test.minEnd(3, 4)).isEqualTo(6);
        assertThat(test.minEnd(2, 7)).isEqualTo(15);
    }
}
