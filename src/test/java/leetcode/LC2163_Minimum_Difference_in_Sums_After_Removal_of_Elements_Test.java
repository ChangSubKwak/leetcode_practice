package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2163_Minimum_Difference_in_Sums_After_Removal_of_Elements_Test {
    @Test
    void exampleTest() {
        LC2163_Minimum_Difference_in_Sums_After_Removal_of_Elements test = new LC2163_Minimum_Difference_in_Sums_After_Removal_of_Elements();

        assertThat(test.minimumDifference(new int[]{3, 1, 2})).isEqualTo(-1);
        assertThat(test.minimumDifference(new int[]{7, 9, 5, 8, 1, 3})).isEqualTo(1);
    }
}
