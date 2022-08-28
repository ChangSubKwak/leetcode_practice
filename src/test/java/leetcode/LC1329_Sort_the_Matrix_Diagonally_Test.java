package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1329_Sort_the_Matrix_Diagonally_Test {
    LC1329_Sort_the_Matrix_Diagonally test;
    
    @BeforeEach
    void setUp() {
        test = new LC1329_Sort_the_Matrix_Diagonally();
    }
    
    @Test
    void test() {
        assertThat(test.diagonalSort(new int[][]{
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        })).isEqualTo(new int[][] {
            {1, 1, 1, 1},
            {1, 2, 2, 2},
            {1, 2, 3, 3}
        });

        assertThat(test.diagonalSort(new int[][]{
            {11, 25, 66, 1, 69, 7},
            {23, 55, 17, 45, 15, 52},
            {75, 31, 36, 44, 58, 8},
            {22, 27, 33, 25, 68, 4},
            {84, 28, 14, 11, 5, 50}
        })).isEqualTo(new int[][] {
            {5, 17, 4, 1, 52, 7},
            {11, 11, 25, 45, 8, 69},
            {75, 31, 36, 44, 58, 8},
            {14, 23, 25, 44, 58, 15},
            {22, 27, 31, 36, 50, 66}
        });
    }
}
