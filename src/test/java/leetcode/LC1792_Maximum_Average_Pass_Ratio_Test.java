package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1792_Maximum_Average_Pass_Ratio_Test {
    LC1792_Maximum_Average_Pass_Ratio test = new LC1792_Maximum_Average_Pass_Ratio();

    @Test
    void exampleTest() {
        assertThat(test.maxAverageRatio(new int[][]{{1, 2}, {3, 5}, {2, 2}}, 2)).isEqualTo(0.78333);
        assertThat(test.maxAverageRatio(new int[][]{{2, 4}, {3, 9}, {4, 5}, {2, 10}}, 4)).isEqualTo(0.53485);
    }
}
