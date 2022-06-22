package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0215_Kth_Largest_Element_in_an_Array_Test {
    LC0215_Kth_Largest_Element_in_an_Array test;
    
    @BeforeEach
    void setUp() {
        test = new LC0215_Kth_Largest_Element_in_an_Array();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2)).isEqualTo(5);
        assertThat(test.findKthLargest(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4)).isEqualTo(4);
    }
}
