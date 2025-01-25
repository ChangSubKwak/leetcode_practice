package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2948_Make_Lexicographically_Smallest_Array_by_Swapping_Elements_Test {

    @Test
    void test() {
        LC2948_Make_Lexicographically_Smallest_Array_by_Swapping_Elements test = new LC2948_Make_Lexicographically_Smallest_Array_by_Swapping_Elements();

        assertThat(test.lexicographicallySmallestArray(new int[]{1, 5, 3, 9, 8}, 2)).isEqualTo(new int[]{1, 3, 5, 8, 9});
        assertThat(test.lexicographicallySmallestArray(new int[]{1, 7, 6, 18, 2, 1}, 3)).isEqualTo(new int[]{1, 6, 7, 18, 1, 2});
        assertThat(test.lexicographicallySmallestArray(new int[]{1, 7, 28, 19, 10}, 3)).isEqualTo(new int[]{1, 7, 28, 19, 10});
    }
}
