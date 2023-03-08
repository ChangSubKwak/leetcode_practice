package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0875_Koko_Eating_Bananas_Test {
    LC0875_Koko_Eating_Bananas test;

    @BeforeEach
    void setUp() {
        test = new LC0875_Koko_Eating_Bananas();
    }

    @Test
    void test() {
        assertThat(test.minEatingSpeed(new int[]{3, 6, 7, 11}, 8)).isEqualTo(4);
        assertThat(test.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5)).isEqualTo(30);
        assertThat(test.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6)).isEqualTo(23);
    }
}
