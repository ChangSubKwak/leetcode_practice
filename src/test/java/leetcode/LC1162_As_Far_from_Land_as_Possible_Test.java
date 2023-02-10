package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1162_As_Far_from_Land_as_Possible_Test {
    @Test
    void test() {
        LC1162_As_Far_from_Land_as_Possible test = new LC1162_As_Far_from_Land_as_Possible();
        assertThat(test.maxDistance(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}})).isEqualTo(2);
        assertThat(test.maxDistance(new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}})).isEqualTo(4);
    }
}
