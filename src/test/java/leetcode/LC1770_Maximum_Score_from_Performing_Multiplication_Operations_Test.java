package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1770_Maximum_Score_from_Performing_Multiplication_Operations_Test {
    LC1770_Maximum_Score_from_Performing_Multiplication_Operations test = new LC1770_Maximum_Score_from_Performing_Multiplication_Operations();

    @Test
    void exampleTest() {
        assertThat(test.maximumScore(new int[]{1, 2, 3}, new int[]{3, 2, 1})).isEqualTo(14);
        assertThat(test.maximumScore(new int[]{-5, -3, -3, -2, 7, 1}, new int[]{-10, -5, 3, 4, 6})).isEqualTo(102);
    }
}
