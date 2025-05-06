package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1920_Build_Array_from_Permutation_Test {
    @Test
    void exampleTest() {
        LC1920_Build_Array_from_Permutation test = new LC1920_Build_Array_from_Permutation();

        assertThat(test.buildArray(new int[]{0, 2, 1, 5, 3, 4})).isEqualTo(new int[]{0, 1, 2, 4, 5, 3});
        assertThat(test.buildArray(new int[]{5, 0, 1, 2, 3, 4})).isEqualTo(new int[]{4, 5, 0, 1, 2, 3});
    }
}
