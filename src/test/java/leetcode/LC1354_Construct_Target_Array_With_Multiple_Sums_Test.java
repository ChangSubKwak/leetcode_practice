package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1354_Construct_Target_Array_With_Multiple_Sums_Test {
    LC1354_Construct_Target_Array_With_Multiple_Sums_X test;
    
    @BeforeEach
    void setUp() {
        test = new LC1354_Construct_Target_Array_With_Multiple_Sums_X();
    }
    
    @Test
    void test() {
        assertThat(test.isPossible(new int[]{9, 3, 5})).isTrue();
        assertThat(test.isPossible(new int[]{1, 1, 1, 2})).isFalse();
        assertThat(test.isPossible(new int[]{8, 5})).isTrue();
    }
}
