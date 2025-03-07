package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2523_Closest_Prime_Numbers_in_Range_Test {
    @Test
    void test() {
        LC2523_Closest_Prime_Numbers_in_Range test = new LC2523_Closest_Prime_Numbers_in_Range();

        assertThat(test.closestPrimes(10, 19)).isEqualTo(new int[]{11, 13});
        assertThat(test.closestPrimes(4, 6)).isEqualTo(new int[]{-1, -1});
    }
}
