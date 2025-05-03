package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1007_Minimum_Domino_Rotations_For_Equal_Row_Test {
    @Test
    void test() {
        LC1007_Minimum_Domino_Rotations_For_Equal_Row test = new LC1007_Minimum_Domino_Rotations_For_Equal_Row();

        assertThat(test.minDominoRotations(new int[]{2, 1, 2, 4, 2, 2}, new int[]{5, 2, 6, 2, 3, 2})).isEqualTo(2);
        assertThat(test.minDominoRotations(new int[]{3, 5, 1, 2, 3}, new int[]{3, 6, 3, 3, 4})).isEqualTo(-1);
    }

}
