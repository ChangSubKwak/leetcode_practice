package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3169_Count_Days_Without_Meetings_Test {
    @Test
    void test() {
        LC3169_Count_Days_Without_Meetings test = new LC3169_Count_Days_Without_Meetings();

        assertThat(test.countDays(10, new int[][]{{5, 7}, {1, 3}, {9, 10}})).isEqualTo(2);
        assertThat(test.countDays(5, new int[][]{{2, 4}, {1, 3}})).isEqualTo(1);
        assertThat(test.countDays(6, new int[][]{{1, 6}})).isEqualTo(0);
    }
}
