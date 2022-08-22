package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0342_Power_of_Four_Test {
    LC0342_Power_of_Four test;
    
    @BeforeEach
    void setUp() {
        test = new LC0342_Power_of_Four();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.isPowerOfFour(16)).isTrue();
        assertThat(test.isPowerOfFour(5)).isFalse();
        assertThat(test.isPowerOfFour(1)).isTrue();
    }
}
