package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0462_Minimum_Moves_to_Equal_Array_Elements_II_Test {
    LC0462_Minimum_Moves_to_Equal_Array_Elements_II test;
    
    @BeforeEach
    void setUp() {
        test = new LC0462_Minimum_Moves_to_Equal_Array_Elements_II();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.minMoves2(new int[] {1, 2, 3})).isEqualTo(2);
        assertThat(test.minMoves2(new int[] {1, 10, 2, 9})).isEqualTo(16);
    }
}
