package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3136_Valid_Word_Test {
    @Test
    void test() {
        LC3136_Valid_Word test = new LC3136_Valid_Word();

        assertThat(test.isValid("234Adas")).isEqualTo(true);
        assertThat(test.isValid("b3")).isEqualTo(false);
        assertThat(test.isValid("a3$e")).isEqualTo(false);
    }
}
