package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2751_Robot_Collisions_Test {
    @Test
    void test() {
        LC2751_Robot_Collisions test = new LC2751_Robot_Collisions();
        assertThat(test.survivedRobotsHealths(new int[]{5, 4, 3, 2, 1}, new int[]{2, 17, 9, 15, 10}, "RRRRR")).isEqualTo(new int[]{2, 17, 9, 15, 10});
    }
}
