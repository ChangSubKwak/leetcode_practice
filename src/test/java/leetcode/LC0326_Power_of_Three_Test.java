package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0326_Power_of_Three_Test {
    LC0326_Power_of_Three test;
    
    @BeforeEach
    void setUp() {
        test = new LC0326_Power_of_Three();
    }
    
    @Test
    void test() {
        assertThat(test.isPowerOfThree(27)).isTrue();
        assertThat(test.isPowerOfThree(0)).isFalse();
        assertThat(test.isPowerOfThree(1)).isTrue();
    }
}
