package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2566_Maximum_Difference_by_Remapping_a_Digit_Test {
    @Test
    void test() {
        LC2566_Maximum_Difference_by_Remapping_a_Digit test = new LC2566_Maximum_Difference_by_Remapping_a_Digit();

        assertThat(test.minMaxDifference(11891)).isEqualTo(99009);
        assertThat(test.minMaxDifference(90)).isEqualTo(99);

    }
}
