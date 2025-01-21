package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2017_Grid_Game_Test {
    LC2017_Grid_Game test = new LC2017_Grid_Game();

    @Test
    void exampleTest() {
        assertThat(test.gridGame(new int[][]{
                {2, 5, 4}, {1, 5, 1}
        })).isEqualTo(4);

        assertThat(test.gridGame(new int[][]{
                {3, 3, 1}, {8, 5, 2}
        })).isEqualTo(4);

        assertThat(test.gridGame(new int[][]{
                {1, 3, 1, 15}, {1, 3, 3, 1}
        })).isEqualTo(7);
    }
}
