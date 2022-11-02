package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1706_Where_Will_the_Ball_Fall_Test {
    LC1706_Where_Will_the_Ball_Fall test = new LC1706_Where_Will_the_Ball_Fall();

    @Test
    void exampleTest() {
        assertThat(test.findBall(new int[][]{
            {1, 1, 1, -1, -1},
            {1, 1, 1, -1, -1},
            {-1, -1, -1, 1, 1},
            {1, 1, 1, 1, -1},
            {-1, -1, -1, -1, -1},
        })).isEqualTo(new int[]{1, -1, -1, -1, -1});

        assertThat(test.findBall(new int[][]{
            {-1},
        })).isEqualTo(new int[]{-1});

        assertThat(test.findBall(new int[][]{
            {1, 1, 1, 1, 1, 1},
            {-1, -1, -1, -1, -1, -1},
            {1, 1, 1, 1, 1, 1},
            {-1, -1, -1, -1, -1, -1}
        })).isEqualTo(new int[]{0, 1, 2, 3, 4, -1});
    }
}
