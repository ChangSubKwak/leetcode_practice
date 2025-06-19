package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2294_Partition_Array_Such_That_Maximum_Difference_Is_K_Test {
    @Test
    void test() {
        LC2294_Partition_Array_Such_That_Maximum_Difference_Is_K test = new LC2294_Partition_Array_Such_That_Maximum_Difference_Is_K();

        assertThat(test.partitionArray(new int[]{3, 6, 1, 2, 5}, 2)).isEqualTo(2);
        assertThat(test.partitionArray(new int[]{1, 2, 3}, 1)).isEqualTo(2);
        assertThat(test.partitionArray(new int[]{2, 2, 4, 5}, 0)).isEqualTo(3);
    }
}
