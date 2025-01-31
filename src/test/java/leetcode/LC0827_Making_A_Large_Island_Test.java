package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0827_Making_A_Large_Island_Test {
    
    @Test
    void test() {
        LC0827_Making_A_Large_Island test = new LC0827_Making_A_Large_Island();

        assertThat(test.largestIsland(new int[][]{{1, 0}, {0, 1}})).isEqualTo(3);
        assertThat(test.largestIsland(new int[][]{{1, 1}, {1, 0}})).isEqualTo(4);
        assertThat(test.largestIsland(new int[][]{{1, 1}, {1, 1}})).isEqualTo(4);
    }
}
