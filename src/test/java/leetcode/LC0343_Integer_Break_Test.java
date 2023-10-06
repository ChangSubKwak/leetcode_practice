package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC0343_Integer_Break_Test {

    @Test
    void minimumTotal() {
        LC0343_Integer_Break test = new LC0343_Integer_Break();
        assertThat(test.integerBreak(2)).isEqualTo(1);
        assertThat(test.integerBreak(10)).isEqualTo(36);
    }
}
