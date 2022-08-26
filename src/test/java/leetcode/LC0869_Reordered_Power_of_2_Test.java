package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0869_Reordered_Power_of_2_Test {
    LC0869_Reordered_Power_of_2_X test;

    @BeforeEach
    void setUp() {
        test = new LC0869_Reordered_Power_of_2_X();
    }

    @Test
    void test() {
        assertThat(test.reorderedPowerOf2(1)).isTrue();
        assertThat(test.reorderedPowerOf2(10)).isFalse();
    }
}
