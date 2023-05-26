package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1140_Stone_Game_II_Test {
    @Test
    void test() {
        LC1140_Stone_Game_II test = new LC1140_Stone_Game_II();
        assertThat(test.stoneGameII(new int[]{2, 7, 9, 4, 4})).isEqualTo(10);
        assertThat(test.stoneGameII(new int[]{1, 2, 3, 4, 5, 100})).isEqualTo(104);
    }
}
