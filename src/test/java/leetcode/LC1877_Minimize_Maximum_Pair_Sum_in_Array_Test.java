package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1877_Minimize_Maximum_Pair_Sum_in_Array_Test {
    @Test
    void exampleTest() {
        LC1877_Minimize_Maximum_Pair_Sum_in_Array test = new LC1877_Minimize_Maximum_Pair_Sum_in_Array();
        
        assertThat(test.minPairSum(new int[]{3, 5, 2, 3})).isEqualTo(7);
        assertThat(test.minPairSum(new int[]{3, 5, 4, 2, 4, 6})).isEqualTo(8);
    }
}
