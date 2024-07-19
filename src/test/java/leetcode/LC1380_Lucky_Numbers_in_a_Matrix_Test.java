package leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.Assertions.assertThat;

class LC1380_Lucky_Numbers_in_a_Matrix_Test {

    @Test
    void test() {
        LC1380_Lucky_Numbers_in_a_Matrix test = new LC1380_Lucky_Numbers_in_a_Matrix();

        assertThat(test.luckyNumbers(new int[][]{
            {3, 7, 8}, {9, 11, 13}, {15, 16, 17}
        })).isEqualTo(Arrays.asList(15));

        assertThat(test.luckyNumbers(new int[][]{
            {1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}
        })).isEqualTo(Arrays.asList(12));

        assertThat(test.luckyNumbers(new int[][]{
            {7, 8}, {1, 2}
        })).isEqualTo(Arrays.asList(7));
    }
}
