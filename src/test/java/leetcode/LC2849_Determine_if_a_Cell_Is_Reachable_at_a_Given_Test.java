package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC2849_Determine_if_a_Cell_Is_Reachable_at_a_Given_Test {
    @Test
    void test() {
        LC2849_Determine_if_a_Cell_Is_Reachable_at_a_Given test = new LC2849_Determine_if_a_Cell_Is_Reachable_at_a_Given();
        assertThat(test.isReachableAtTime(2, 4, 7, 7, 6)).isEqualTo(true);
        assertThat(test.isReachableAtTime(3, 1, 7, 3, 3)).isEqualTo(false);
    }
}
