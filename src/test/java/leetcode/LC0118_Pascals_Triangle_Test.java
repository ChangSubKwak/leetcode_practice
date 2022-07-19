package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC0118_Pascals_Triangle_Test {
    LC0118_Pascals_Triangle test;
    TreeNode one;
    
    @BeforeEach
    void setUp() {
        test = new LC0118_Pascals_Triangle();
    }
    
    @Test
    void test() {
        assertThat(test.generate(5)).isEqualTo(Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(1, 1),
            Arrays.asList(1, 2, 1),
            Arrays.asList(1, 3, 3, 1),
            Arrays.asList(1, 4, 6, 4, 1)
        ));
    }
}