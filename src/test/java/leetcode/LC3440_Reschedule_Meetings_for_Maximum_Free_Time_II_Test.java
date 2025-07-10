package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3440_Reschedule_Meetings_for_Maximum_Free_Time_II_Test {
    @Test
    void test() {
        LC3440_Reschedule_Meetings_for_Maximum_Free_Time_II test = new LC3440_Reschedule_Meetings_for_Maximum_Free_Time_II();

        assertThat(test.maxFreeTime(5, new int[]{1, 3}, new int[]{2, 5})).isEqualTo(2);
        assertThat(test.maxFreeTime(10, new int[]{0, 7, 9}, new int[]{1, 8, 10})).isEqualTo(7);
        assertThat(test.maxFreeTime(10, new int[]{0, 3, 7, 9}, new int[]{1, 4, 8, 10})).isEqualTo(6);
    }
}
