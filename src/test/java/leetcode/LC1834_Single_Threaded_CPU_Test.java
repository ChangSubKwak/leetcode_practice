package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1834_Single_Threaded_CPU_Test {
    @Test
    void exampleTest() {
        LC1834_Single_Threaded_CPU test = new LC1834_Single_Threaded_CPU();
        assertThat(test.getOrder(new int[][]{{1, 2}, {2, 4}, {3, 2}, {4, 1}})).isEqualTo(new int[]{0, 2, 3, 1});
        assertThat(test.getOrder(new int[][]{{7, 10}, {7, 12}, {7, 5}, {7, 4}, {7, 2}})).isEqualTo(new int[]{4, 3, 2, 0, 1});
    }
}
