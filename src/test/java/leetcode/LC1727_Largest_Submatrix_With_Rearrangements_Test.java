package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1727_Largest_Submatrix_With_Rearrangements_Test {

    @Test
    void exampleTest() {
        LC1727_Largest_Submatrix_With_Rearrangements test = new LC1727_Largest_Submatrix_With_Rearrangements();

        assertThat(test.largestSubmatrix(new int[][]{{
            new int[]{0, 0, 1},
            new int[]{1, 1, 1},
            new int[]{1, 0, 1}
        }})).isEqualTo(4);

    }
}
