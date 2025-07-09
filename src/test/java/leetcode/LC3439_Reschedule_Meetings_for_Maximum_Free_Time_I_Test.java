package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3439_Reschedule_Meetings_for_Maximum_Free_Time_I_Test {
    @Test
    void test() {
        LC3439_Reschedule_Meetings_for_Maximum_Free_Time_I test = new LC3439_Reschedule_Meetings_for_Maximum_Free_Time_I();

        assertThat(test.maxFreeTime(5, 1, new int[]{1, 3}, new int[]{2, 5})).isEqualTo(2);
        assertThat(test.maxFreeTime(10, 1, new int[]{0, 2, 9}, new int[]{1, 4, 10})).isEqualTo(6);
        assertThat(test.maxFreeTime(5, 2, new int[]{0, 1, 2, 3, 4}, new int[]{1, 2, 3,4, 5})).isEqualTo(0);


    }
}
