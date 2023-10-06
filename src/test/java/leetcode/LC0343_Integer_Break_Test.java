package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC0343_Integer_Break_Test {

    @Test
    void minimumTotal() {
        LC0343_Integer_Break test = new LC0343_Integer_Break();
        Assertions.assertThat(test.integerBreak(2)).isEqualTo(1);
        Assertions.assertThat(test.integerBreak(10)).isEqualTo(36);
    }
}
