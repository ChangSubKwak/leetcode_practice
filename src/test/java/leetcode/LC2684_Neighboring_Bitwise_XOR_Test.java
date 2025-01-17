package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2684_Neighboring_Bitwise_XOR_Test {
    @Test
    void test() {
        LC2684_Neighboring_Bitwise_XOR test = new LC2684_Neighboring_Bitwise_XOR();

        assertThat(test.doesValidArrayExist(new int[]{1, 1, 0})).isEqualTo(true);
        assertThat(test.doesValidArrayExist(new int[]{1, 1})).isEqualTo(true);
        assertThat(test.doesValidArrayExist(new int[]{1, 0})).isEqualTo(false);
    }
}
