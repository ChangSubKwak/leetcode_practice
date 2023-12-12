package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC1464_Maximum_Product_of_Two_Elements_in_an_Array_Test {
    @Test
    void test() {
        LC1464_Maximum_Product_of_Two_Elements_in_an_Array test = new LC1464_Maximum_Product_of_Two_Elements_in_an_Array();

        assertThat(test.maxProduct(new int[]{3, 4, 5, 2})).isEqualTo(12);
        assertThat(test.maxProduct(new int[]{1, 5, 4, 5})).isEqualTo(16);
        assertThat(test.maxProduct(new int[]{3, 7})).isEqualTo(12);
    }
}
