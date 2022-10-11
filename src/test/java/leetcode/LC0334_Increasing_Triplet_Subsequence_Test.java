package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0334_Increasing_Triplet_Subsequence_Test {

    @Test
    void test() {
        LC0334_Increasing_Triplet_Subsequence test = new LC0334_Increasing_Triplet_Subsequence();
        assertThat(test.increasingTriplet(new int[]{1, 2, 3, 4, 5})).isTrue();
        assertThat(test.increasingTriplet(new int[]{5, 4, 3, 2, 1})).isFalse();
    }
}
