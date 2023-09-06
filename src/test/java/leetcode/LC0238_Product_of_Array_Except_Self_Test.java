package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0238_Product_of_Array_Except_Self_Test {
    @Test
    void test() {
        LC0238_Product_of_Array_Except_Self test = new LC0238_Product_of_Array_Except_Self();

        assertThat(test.productExceptSelf(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{24, 12, 8, 6});
        assertThat(test.productExceptSelf(new int[]{-1, 1, 0, -3, 3})).isEqualTo(new int[]{0, 0, 9, 0, 0});

    }
}
