package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3097_Shortest_Subarray_With_OR_at_Least_K_II_Test {
    @Test
    void test() {
        LC3097_Shortest_Subarray_With_OR_at_Least_K_II test = new LC3097_Shortest_Subarray_With_OR_at_Least_K_II();

        assertThat(test.minimumSubarrayLength(new int[]{1, 2, 3}, 2)).isEqualTo(1);
        assertThat(test.minimumSubarrayLength(new int[]{2, 1, 8}, 10)).isEqualTo(3);
        assertThat(test.minimumSubarrayLength(new int[]{1, 2}, 0)).isEqualTo(1);
    }
}
