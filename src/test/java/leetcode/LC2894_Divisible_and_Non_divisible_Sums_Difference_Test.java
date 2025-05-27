package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2894_Divisible_and_Non_divisible_Sums_Difference_Test {
    @Test
    void test() {
        LC2894_Divisible_and_Non_divisible_Sums_Difference test = new LC2894_Divisible_and_Non_divisible_Sums_Difference();

        assertThat(test.differenceOfSums(10, 3)).isEqualTo(19);
        assertThat(test.differenceOfSums(5, 6)).isEqualTo(15);
        assertThat(test.differenceOfSums(5, 1)).isEqualTo(-15);

    }
}
