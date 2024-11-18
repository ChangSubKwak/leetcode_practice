package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0862_Shortest_Subarray_with_Sum_at_Least_K_Test {
    LC0862_Shortest_Subarray_with_Sum_at_Least_K test;
    
    @BeforeEach
    void setUp() {
        test = new LC0862_Shortest_Subarray_with_Sum_at_Least_K();
    }
    
    @Test
    void test() {
        assertThat(test.shortestSubarray(new int[]{1}, 1)).isEqualTo(1);
        assertThat(test.shortestSubarray(new int[]{1, 2}, 4)).isEqualTo(-1);
        assertThat(test.shortestSubarray(new int[]{2, -1, 2}, 3)).isEqualTo(3);
    }
}
