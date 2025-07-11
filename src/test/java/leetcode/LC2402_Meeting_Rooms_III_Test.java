package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2402_Meeting_Rooms_III_Test {
    @Test
    void exampleTest() {
        LC2402_Meeting_Rooms_III test = new LC2402_Meeting_Rooms_III();

        assertThat(test.mostBooked(2, new int[][]{{0, 10}, {1, 5}, {2, 7}, {3, 4}})).isEqualTo(0);
        assertThat(test.mostBooked(3, new int[][]{{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}})).isEqualTo(1);
    }
}
