package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC1458_Max_Dot_Product_of_Two_Subsequences_Test {
    @Test
    void test() {
        LC1458_Max_Dot_Product_of_Two_Subsequences test = new LC1458_Max_Dot_Product_of_Two_Subsequences();
        assertThat(test.maxDotProduct(new int[]{2, 1, -2, 5}, new int[]{3, 0, -6})).isEqualTo(18);
        assertThat(test.maxDotProduct(new int[]{3, -2}, new int[]{2, -6, 7})).isEqualTo(21);
        assertThat(test.maxDotProduct(new int[]{-1, -1}, new int[]{1, 1})).isEqualTo(-1);
    }
}
