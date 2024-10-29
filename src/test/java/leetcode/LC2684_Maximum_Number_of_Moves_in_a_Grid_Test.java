package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2684_Maximum_Number_of_Moves_in_a_Grid_Test {
    @Test
    void test() {
        LC2684_Maximum_Number_of_Moves_in_a_Grid test = new LC2684_Maximum_Number_of_Moves_in_a_Grid();

        assertThat(test.maxMoves(new int[][]{
            {2, 4, 3, 5},
            {5, 4, 9, 3},
            {3, 4, 2, 11},
            {10, 9, 13, 15}
        })).isEqualTo(3);

        assertThat(test.maxMoves(new int[][]{
            {3, 2, 4},
            {2, 1, 9},
            {1, 1, 7}
        })).isEqualTo(0);
    }
}
