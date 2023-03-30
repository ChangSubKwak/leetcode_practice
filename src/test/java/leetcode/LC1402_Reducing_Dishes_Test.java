package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1402_Reducing_Dishes_Test {
    @Test
    void test() {
        LC1402_Reducing_Dishes test = new LC1402_Reducing_Dishes();
        assertThat(test.maxSatisfaction(new int[]{-1, -8, 0, 5, -9})).isEqualTo(14);
        assertThat(test.maxSatisfaction(new int[]{4, 3, 2})).isEqualTo(20);
        assertThat(test.maxSatisfaction(new int[]{-1, -4, -5})).isEqualTo(0);
    }
}
