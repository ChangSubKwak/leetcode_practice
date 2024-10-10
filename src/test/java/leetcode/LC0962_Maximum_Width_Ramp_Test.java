package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0962_Maximum_Width_Ramp_Test {
    LC0962_Maximum_Width_Ramp test;
    
    @BeforeEach
    void setUp() {
        test = new LC0962_Maximum_Width_Ramp();
    }
    
    @Test
    void test() {
        assertThat(test.maxWidthRamp(new int[]{6, 0, 8, 2, 1, 5})).isEqualTo(4);
        assertThat(test.maxWidthRamp(new int[]{9, 8, 1, 0, 1, 9, 4, 0, 4, 1})).isEqualTo(7);
    }
}
