package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0542_01_Matrix_Test {
    @Test
    void test() {
        LC0542_01_Matrix test = new LC0542_01_Matrix();
        assertThat(test.updateMatrix(new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        })).isEqualTo(new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        });
        
        assertThat(test.updateMatrix(new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        })).isEqualTo(new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {1, 2, 1}
        });
    }
}
