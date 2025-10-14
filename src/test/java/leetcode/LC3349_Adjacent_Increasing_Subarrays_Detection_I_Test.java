package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3349_Adjacent_Increasing_Subarrays_Detection_I_Test {
    @Test
    void test() {
        LC3349_Adjacent_Increasing_Subarrays_Detection_I test = new LC3349_Adjacent_Increasing_Subarrays_Detection_I();

        assertThat(test.hasIncreasingSubarrays(Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3)).isEqualTo(true);
        assertThat(test.hasIncreasingSubarrays(Arrays.asList(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5)).isEqualTo(false);
    }
}
