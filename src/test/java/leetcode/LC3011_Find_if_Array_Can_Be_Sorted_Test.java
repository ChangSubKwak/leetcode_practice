package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3011_Find_if_Array_Can_Be_Sorted_Test {
    @Test
    void test() {
        LC3011_Find_if_Array_Can_Be_Sorted test = new LC3011_Find_if_Array_Can_Be_Sorted();
        assertThat(test.canSortArray(new int[]{8, 4, 2, 30, 15})).isEqualTo(true);
        assertThat(test.canSortArray(new int[]{1, 2, 3, 4, 5})).isEqualTo(true);
        assertThat(test.canSortArray(new int[]{3, 16, 8, 4, 2})).isEqualTo(false);
    }
}
