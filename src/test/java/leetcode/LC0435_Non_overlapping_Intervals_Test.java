package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LC0435_Non_overlapping_Intervals_Test {

    @Test
    void test() {
        LC0435_Non_overlapping_Intervals test = new LC0435_Non_overlapping_Intervals();
        assertThat(test.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}})).isEqualTo(1);
        assertThat(test.eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}})).isEqualTo(2);
        assertThat(test.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}})).isEqualTo(0);
    }
}
