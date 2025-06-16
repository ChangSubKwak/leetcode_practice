package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2016_Maximum_Difference_Between_Increasing_Elements_Test {
    LC2016_Maximum_Difference_Between_Increasing_Elements test = new LC2016_Maximum_Difference_Between_Increasing_Elements();

    @Test
    void exampleTest() {
        assertThat(test.maximumDifference(new int[]{7, 1, 5, 4})).isEqualTo(4);
        assertThat(test.maximumDifference(new int[]{9, 4, 3, 2})).isEqualTo(-1);
        assertThat(test.maximumDifference(new int[]{1, 5, 2, 10})).isEqualTo(9);
    }
}
