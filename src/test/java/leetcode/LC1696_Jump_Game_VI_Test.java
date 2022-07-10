package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1696_Jump_Game_VI_Test {

    LC1696_Jump_Game_VI test = new LC1696_Jump_Game_VI();

    @Test
    void test() {
        assertThat(test.maxResult(new int[] {1, -1, -2, 4, -7, 3}, 2)).isEqualTo(7);
        assertThat(test.maxResult(new int[] {10, -5, -2, 4, 0, 3}, 3)).isEqualTo(17);
        assertThat(test.maxResult(new int[] {1, -5, -20, 4, -1, 3, -6, -3}, 2)).isEqualTo(0);
    }
}
