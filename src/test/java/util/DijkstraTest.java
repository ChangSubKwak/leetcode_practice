package util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DijkstraTest {
    private static final int INFINITE = 1_000_000_000;
    private int[][] adjacentInfo;
    private Dijkstra dijkstra = new Dijkstra();


    @BeforeEach
    void setUp() {
        adjacentInfo = new int[][]{
            {0, 10, 3, INFINITE, INFINITE, INFINITE},
            {10, 0, 4, INFINITE, INFINITE, 2},
            {3, 4, 0, 2, INFINITE, INFINITE},
            {INFINITE, INFINITE, 2, 0, 5, INFINITE},
            {INFINITE, INFINITE, INFINITE, 5, 0, 1},
            {INFINITE, 2, INFINITE, INFINITE, 1, 0}
        };
    }

    @Test
    void test() {
        assertThat(dijkstra.execute(0, adjacentInfo)).isEqualTo(new int[]{0, 7, 3, 5, 10, 9});
    }
}
