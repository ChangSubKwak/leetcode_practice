package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1822_Sign_of_the_Product_of_an_Array_Test {
    @Test
    void exampleTest() {
        LC1822_Sign_of_the_Product_of_an_Array test = new LC1822_Sign_of_the_Product_of_an_Array();
        assertThat(test.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1})).isEqualTo(1);
        assertThat(test.arraySign(new int[]{1, 5, 0, 2, -3})).isEqualTo(0);
        assertThat(test.arraySign(new int[]{-1, 1, -1, 1, -1})).isEqualTo(-1);
    }
}
