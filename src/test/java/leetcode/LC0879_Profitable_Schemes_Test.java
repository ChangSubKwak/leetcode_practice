package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0879_Profitable_Schemes_Test {
    @Test
    void test() {
        LC0879_Profitable_Schemes test = new LC0879_Profitable_Schemes();
        assertThat(test.profitableSchemes(5, 3, new int[]{2, 2}, new int[]{2, 3})).isEqualTo(2);
        assertThat(test.profitableSchemes(10, 5, new int[]{2, 3, 5}, new int[]{6, 7, 8})).isEqualTo(7);
    }
}
