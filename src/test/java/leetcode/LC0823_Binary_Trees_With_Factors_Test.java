package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0823_Binary_Trees_With_Factors_Test {
    
    LC0823_Binary_Trees_With_Factors_X test;
    
    @BeforeEach
    void setUp() {
        test = new LC0823_Binary_Trees_With_Factorsc();
    }
    
    @Test
    void test() {
        assertThat(test.numFactoredBinaryTrees(new int[]{2, 4})).isEqualTo(3);
        assertThat(test.numFactoredBinaryTrees(new int[]{2, 4, 5, 10})).isEqualTo(7);
    }
}
