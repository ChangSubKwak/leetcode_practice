package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer_Test {
    @Test
    void test() {
        LC2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer test = new LC2529_Maximum_Count_of_Positive_Integer_and_Negative_Integer();

        assertThat(test.maximumCount(new int[]{-2, -1, -1, 1, 2, 3})).isEqualTo(3);
        assertThat(test.maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2})).isEqualTo(3);
        assertThat(test.maximumCount(new int[]{5, 20, 66, 1314})).isEqualTo(4);
    }
}
