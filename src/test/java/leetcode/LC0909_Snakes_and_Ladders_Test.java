package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0909_Snakes_and_Ladders_Test {
    @Test
    void test() {
        LC0909_Snakes_and_Ladders test = new LC0909_Snakes_and_Ladders();

        assertThat(test.snakesAndLadders(new int[][]{
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 35, -1, -1, 13, -1},
            {-1, -1, -1, -1, -1, -1},
            {-1, 15, -1, -1, -1, -1}
        })).isEqualTo(4);

        assertThat(test.snakesAndLadders(new int[][]{
            {-1, -1},
            {-1,  3}
        })).isEqualTo(1);

    }
}
