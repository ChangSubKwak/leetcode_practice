package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2966_Divide_Array_Into_Arrays_With_Max_Difference_Test {

    @Test
    void test() {
        LC2966_Divide_Array_Into_Arrays_With_Max_Difference test = new LC2966_Divide_Array_Into_Arrays_With_Max_Difference();

        assertThat(test.divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 2)).isEqualTo(new int[][]{
                {1, 1, 3},
                {3, 4, 5},
                {7, 8, 9}
        });

        assertThat(test.divideArray(new int[]{2, 4, 2, 2, 5, 2}, 2)).isEqualTo(new int[][]{});

        assertThat(test.divideArray(new int[]{4, 2, 9, 8, 2, 12, 7, 12, 10, 5, 8, 5, 5, 7, 9, 2, 5, 11},  14)).isEqualTo(new int[][]{
                {2, 2, 12},
                {4, 8, 5},
                {5, 9, 7},
                {7, 8, 5},
                {5, 9, 10},
                {11, 12, 2}
        });
    }
}
