package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2040_Kth_Smallest_Product_of_Two_Sorted_Arrays_Test {
    @Test
    void exampleTest() {
        LC2040_Kth_Smallest_Product_of_Two_Sorted_Arrays test = new LC2040_Kth_Smallest_Product_of_Two_Sorted_Arrays();

        assertThat(test.kthSmallestProduct(new int[]{2, 5}, new int[]{3, 4}, 2)).isEqualTo(8);
        assertThat(test.kthSmallestProduct(new int[]{-4, -2, 0, 3}, new int[]{2, 4}, 6)).isEqualTo(0);
        assertThat(test.kthSmallestProduct(new int[]{-2, -1, 0, 1, 2}, new int[]{-3, -1, 2, 4, 5}, 3)).isEqualTo(-6);
    }
}
