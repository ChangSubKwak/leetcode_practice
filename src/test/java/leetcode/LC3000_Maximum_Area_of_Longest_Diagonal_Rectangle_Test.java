package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC3000_Maximum_Area_of_Longest_Diagonal_Rectangle_Test {

    @Test
    void test() {
        LC3000_Maximum_Area_of_Longest_Diagonal_Rectangle test = new LC3000_Maximum_Area_of_Longest_Diagonal_Rectangle();

        assertThat(test.areaOfMaxDiagonal(new int[][]{{9, 3}, {8, 6}})).isEqualTo(48);
        assertThat(test.areaOfMaxDiagonal(new int[][]{{3, 4}, {4, 3}})).isEqualTo(12);
    }
}
