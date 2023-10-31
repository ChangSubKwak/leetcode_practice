package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2433_Find_The_Original_Array_of_Prefix_Xor_Test {

    @Test
    void exampleTest() {
        LC2433_Find_The_Original_Array_of_Prefix_Xor test = new LC2433_Find_The_Original_Array_of_Prefix_Xor();
        assertThat(test.findArray(new int[]{5, 2, 0, 3, 1})).isEqualTo(new int[]{5, 7, 2, 3, 2});
        assertThat(test.findArray(new int[]{13})).isEqualTo(new int[]{13});
    }
}
