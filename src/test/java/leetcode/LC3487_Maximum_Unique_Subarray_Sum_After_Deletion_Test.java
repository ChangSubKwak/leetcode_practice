package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3487_Maximum_Unique_Subarray_Sum_After_Deletion_Test {
    @Test
    void test() {
        LC3487_Maximum_Unique_Subarray_Sum_After_Deletion test = new LC3487_Maximum_Unique_Subarray_Sum_After_Deletion();

        assertThat(test.maxSum(new int[]{1, 2, 3, 4, 5})).isEqualTo(15);
        assertThat(test.maxSum(new int[]{1, 1, 0, 1, 1})).isEqualTo(1);
        assertThat(test.maxSum(new int[]{1, 2, -1, -2, 1, 0, -1})).isEqualTo(3);
    }
}
