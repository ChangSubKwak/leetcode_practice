package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1863_Sum_of_All_Subset_XOR_Totals_Test {
    @Test
    void exampleTest() {
        LC1863_Sum_of_All_Subset_XOR_Totals test = new LC1863_Sum_of_All_Subset_XOR_Totals();
        
        assertThat(test.subsetXORSum(new int[]{1, 3})).isEqualTo(6);
        assertThat(test.subsetXORSum(new int[]{5, 1, 6})).isEqualTo(28);
        assertThat(test.subsetXORSum(new int[]{3, 4, 5, 6, 7, 8})).isEqualTo(480);
    }
}
