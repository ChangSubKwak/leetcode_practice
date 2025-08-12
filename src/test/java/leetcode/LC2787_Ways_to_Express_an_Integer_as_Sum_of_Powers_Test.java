package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2787_Ways_to_Express_an_Integer_as_Sum_of_Powers_Test {
    @Test
    void test() {
        LC2787_Ways_to_Express_an_Integer_as_Sum_of_Powers test = new LC2787_Ways_to_Express_an_Integer_as_Sum_of_Powers();

        assertThat(test.numberOfWays(10, 2)).isEqualTo(1);
        assertThat(test.numberOfWays(4, 1)).isEqualTo(2);
    }
}
