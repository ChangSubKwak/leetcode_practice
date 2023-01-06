package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0452_Minimum_Number_of_Arrows_to_Burst_Balloons_Test {

    @Test
    void minimumTotal() {
        LC0452_Minimum_Number_of_Arrows_to_Burst_Balloons test = new LC0452_Minimum_Number_of_Arrows_to_Burst_Balloons();

        assertThat(test.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}})).isEqualTo(2);
        assertThat(test.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}})).isEqualTo(4);
        assertThat(test.findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}})).isEqualTo(2);
        assertThat(test.findMinArrowShots(new int[][]{{-2147483646,-2147483645}, {2147483646,2147483647}})).isEqualTo(2);
        assertThat(test.findMinArrowShots(new int[][]{{3, 9}, {7, 12}, {3, 8}, {6, 8}, {9, 10}, {2, 9}, {0, 9}, {3, 9}, {0, 6}, {2, 8}})).isEqualTo(2);
        assertThat(test.findMinArrowShots(new int[][]{{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}})).isEqualTo(2);
    }
}
