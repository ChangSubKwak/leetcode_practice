package leetcode.biweekly.contest108;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class Problem2_Test {
    @Test
    void test() {
        Problem2 test = new Problem2();
        assertThat(test.relocateMarbles(new int[]{1, 6, 7, 8}, new int[]{1, 7, 2}, new int[]{2, 9, 5})).isEqualTo(
            Arrays.asList(5, 6, 8, 9)
        );
        assertThat(test.relocateMarbles(new int[]{1, 1, 3, 3}, new int[]{1, 3}, new int[]{2, 2})).isEqualTo(
            Arrays.asList(2)
        );
    }

}