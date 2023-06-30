package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1970_Last_Day_Where_You_Can_Still_Cross_Test {
    @Test
    void test() {
        LC1970_Last_Day_Where_You_Can_Still_Cross test = new LC1970_Last_Day_Where_You_Can_Still_Cross();
        assertThat(test.latestDayToCross(2, 2,
            new int[][]{{1, 1}, {2, 1}, {1, 2}, {2, 2}}
        )).isEqualTo(2);

        assertThat(test.latestDayToCross(2, 2,
            new int[][]{{1, 1}, {1, 2}, {2, 1}, {2, 2}}
        )).isEqualTo(1);

        assertThat(test.latestDayToCross(2, 2,
            new int[][]{{1, 2}, {2, 1}, {3, 3}, {2, 2}, {1, 1}, {1, 3}, {2, 3}, {3, 2}, {3, 1}}
        )).isEqualTo(3);
    }
}
