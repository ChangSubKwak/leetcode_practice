package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1232_Check_If_It_Is_a_Straight_Line_Test {
    
    @Test
    void test() {
        LC1232_Check_If_It_Is_a_Straight_Line test = new LC1232_Check_If_It_Is_a_Straight_Line();
        assertThat(test.checkStraightLine(new int[][]{
            {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}
        })).isTrue();
        assertThat(test.checkStraightLine(new int[][]{
            {1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}
        })).isFalse();
    }
}
