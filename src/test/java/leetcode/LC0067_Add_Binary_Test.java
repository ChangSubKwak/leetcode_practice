package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0067_Add_Binary_Test {
    @Test
    void test() {
        LC0067_Add_Binary test = new LC0067_Add_Binary();
        assertThat(test.addBinary("11", "1")).isEqualTo("100");
        assertThat(test.addBinary("1010", "1011")).isEqualTo("10101");
    }
}
