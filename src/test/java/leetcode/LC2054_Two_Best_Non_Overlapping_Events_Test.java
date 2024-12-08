package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2054_Two_Best_Non_Overlapping_Events_Test {
    @Test
    void exampleTest() {
        LC2054_Two_Best_Non_Overlapping_Events test = new LC2054_Two_Best_Non_Overlapping_Events();

        assertThat(test.maxTwoEvents(new int[][]{{1, 3, 2}, {4, 5, 2}, {2, 4, 3}})).isEqualTo(4);
        assertThat(test.maxTwoEvents(new int[][]{{1, 3, 2}, {4, 5, 2}, {1, 5, 5}})).isEqualTo(5);
        assertThat(test.maxTwoEvents(new int[][]{{1, 5, 3}, {1, 5, 1}, {6, 6, 5}})).isEqualTo(8);
    }
}
