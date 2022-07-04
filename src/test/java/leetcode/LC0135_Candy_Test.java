package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0135_Candy_Test {
    LC0135_Candy_X test;
    
    @BeforeEach
    void setUp() {
        test = new LC0135_Candy_X();
    }
    
    @Test
    void test() {
        assertThat(test.candy(new int[] { 1, 0, 2 })).isEqualTo(5);
        assertThat(test.candy(new int[] { 1, 2, 2 })).isEqualTo(4);
    }
}