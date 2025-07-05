package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1394_Find_Lucky_Integer_in_an_Array_Test {
    LC1394_Find_Lucky_Integer_in_an_Array test;

    @BeforeEach
    void setUp() {
        test = new LC1394_Find_Lucky_Integer_in_an_Array();
    }
    
    @Test
    void test() {
        assertThat(test.findLucky(new int[]{2, 2, 3, 4})).isEqualTo(2);
        assertThat(test.findLucky(new int[]{1, 2, 2, 3, 3, 3})).isEqualTo(3);
        assertThat(test.findLucky(new int[]{2, 2, 2, 3, 3})).isEqualTo(-1);
    }
}
