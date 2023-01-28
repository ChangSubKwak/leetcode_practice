package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0352_Data_Stream_as_Disjoint_Intervals_Test {
    @Test
    void minimumTotal() {
        LC0352_Data_Stream_as_Disjoint_Intervals.SummaryRanges test = new LC0352_Data_Stream_as_Disjoint_Intervals.SummaryRanges();
        test.addNum(1);
        assertThat(test.getIntervals()).isEqualTo(new int[][]{{1, 1}});
        test.addNum(3);
        assertThat(test.getIntervals()).isEqualTo(new int[][]{{1, 1}, {3, 3}});
        test.addNum(7);
        assertThat(test.getIntervals()).isEqualTo(new int[][]{{1, 1}, {3, 3}, {7, 7}});
        test.addNum(2);
        assertThat(test.getIntervals()).isEqualTo(new int[][]{{1, 3}, {7, 7}});
        test.addNum(6);
        assertThat(test.getIntervals()).isEqualTo(new int[][]{{1, 3}, {6, 7}});
    }
}
