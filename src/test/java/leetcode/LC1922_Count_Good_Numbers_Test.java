package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LC1922_Count_Good_Numbers_Test {
    @Test
    void examlpeTest() {
        LC1922_Count_Good_Numbers test = new LC1922_Count_Good_Numbers();

        Assertions.assertThat(test.countGoodNumbers(1)).isEqualTo(5);
        Assertions.assertThat(test.countGoodNumbers(4)).isEqualTo(400);
        Assertions.assertThat(test.countGoodNumbers(50)).isEqualTo(564908303);
    }
}
