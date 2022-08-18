package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1338_Reduce_Array_Size_to_The_Half_Test {
    LC1338_Reduce_Array_Size_to_The_Half test;
    
    @BeforeEach
    void setUp() {
        test = new LC1338_Reduce_Array_Size_to_The_Half();
    }
    
    @Test
    void test() {
        assertThat(test.minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2 ,7})).isEqualTo(2);
        assertThat(test.minSetSize(new int[]{7, 7, 7, 7, 7, 7})).isEqualTo(1);
    }
}
