package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2561_Rearranging_Fruits_Test {
    @Test
    void test() {
        LC2561_Rearranging_Fruits test = new LC2561_Rearranging_Fruits();

        assertThat(test.minCost(new int[]{4, 2, 2, 2}, new int[]{1, 4, 1, 2})).isEqualTo(1);
        assertThat(test.minCost(new int[]{2, 3, 4, 1}, new int[]{3, 2, 5, 1})).isEqualTo(-1);

    }
}
