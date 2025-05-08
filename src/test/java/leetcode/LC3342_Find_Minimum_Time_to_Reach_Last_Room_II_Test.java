package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3342_Find_Minimum_Time_to_Reach_Last_Room_II_Test {

    @Test
    void test() {
        LC3342_Find_Minimum_Time_to_Reach_Last_Room_II test = new LC3342_Find_Minimum_Time_to_Reach_Last_Room_II();

        assertThat(test.minTimeToReach(new int[][]{{0, 4}, {4, 4}})).isEqualTo(7);
        assertThat(test.minTimeToReach(new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}})).isEqualTo(6);
        assertThat(test.minTimeToReach(new int[][]{{0, 1}, {1, 2}})).isEqualTo(4);
    }
}
