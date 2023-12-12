package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0867_Transpose_Matrix_Test {

    @Test
    void test() {
        LC0867_Transpose_Matrix test = new LC0867_Transpose_Matrix();
        assertThat(test.transpose(new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        })).isEqualTo(8);
    }
}
