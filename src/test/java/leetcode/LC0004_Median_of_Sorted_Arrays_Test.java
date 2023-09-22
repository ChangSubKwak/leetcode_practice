package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0004_Median_of_Sorted_Arrays_Test {
    @Test
    void test() {
        LC0004_Median_of_Sorted_Arrays test = new LC0004_Median_of_Sorted_Arrays();
        assertThat(test.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isEqualTo(2);
        assertThat(test.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(2.5);
    }
}
