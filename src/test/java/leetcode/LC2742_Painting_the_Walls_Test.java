package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2742_Painting_the_Walls_Test {
    @Test
    void test() {
        LC2742_Painting_the_Walls test = new LC2742_Painting_the_Walls();
        assertThat(test.paintWalls(new int[]{1, 2, 3, 2}, new int[]{1, 2, 3, 2})).isEqualTo(3);
        assertThat(test.paintWalls(new int[]{2, 3, 4, 2}, new int[]{1, 1, 1, 1})).isEqualTo(4);
    }
}
