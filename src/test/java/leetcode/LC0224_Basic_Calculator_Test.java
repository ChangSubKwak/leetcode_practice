package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0224_Basic_Calculator_Test {
    @Test
    void minimumTotal() {
        LC0224_Basic_Calculator test = new LC0224_Basic_Calculator();
        assertThat(test.calculate("1 + 1")).isEqualTo(2);
        assertThat(test.calculate(" 2-1 + 2 ")).isEqualTo(3);
        assertThat(test.calculate("(1+(4+5+2)-3)+(6+8)")).isEqualTo(23);
    }
}
