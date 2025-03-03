package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2161_Partition_Array_According_to_Given_Pivot_Test {
    @Test
    void exampleTest() {
        LC2161_Partition_Array_According_to_Given_Pivot test = new LC2161_Partition_Array_According_to_Given_Pivot();

        assertThat(test.pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)).isEqualTo(new int[]{9, 5, 3, 10, 10, 12, 14});
        assertThat(test.pivotArray(new int[]{-3, 4, 3, 2}, 2)).isEqualTo(new int[]{-3, 2, 4, 3});
    }
}
