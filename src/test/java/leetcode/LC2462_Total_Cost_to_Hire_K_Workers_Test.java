package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2462_Total_Cost_to_Hire_K_Workers_Test {

    @Test
    void test() {
        LC2462_Total_Cost_to_Hire_K_Workers test = new LC2462_Total_Cost_to_Hire_K_Workers();
        assertThat(test.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4)).isEqualTo(11);
        assertThat(test.totalCost(new int[]{1, 2, 4, 1}, 3, 3)).isEqualTo(4);
    }
}
