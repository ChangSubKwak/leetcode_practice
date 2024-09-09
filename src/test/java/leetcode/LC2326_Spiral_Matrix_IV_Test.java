package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.Arrays;

public class LC2326_Spiral_Matrix_IV_Test {
    @Test
    void test1() {
        LC2326_Spiral_Matrix_IV test = new LC2326_Spiral_Matrix_IV();

        ListNode head = ListNode.setArray(new int[]{3, 0, 2, 6, 8, 1, 7, 9, 4, 2, 5, 5, 0});
        assertThat(test.spiralMatrix(3, 5, head)).isEqualTo(new int[][]{
            {3, 0, 2, 6, 8},
            {5, 0, -1, -1, 1},
            {5, 2, 4, 9, 7}
        });
    }

    @Test
    void test2() {
        LC2326_Spiral_Matrix_IV test = new LC2326_Spiral_Matrix_IV();

        ListNode head = ListNode.setArray(new int[]{0, 1, 2});
        assertThat(test.spiralMatrix(1, 4, head)).isEqualTo(new int[][]{
            {0, 1, 2, -1},
        });
    }
}
