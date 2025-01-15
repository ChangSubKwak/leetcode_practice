package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2429_Minimize_XOR_Test {
    LC2429_Minimize_XOR test = new LC2429_Minimize_XOR();

    @Test
    void exampleTest() {
        assertThat(test.minimizeXor(3, 5)).isEqualTo(3);
        assertThat(test.minimizeXor(1, 12)).isEqualTo(3);
    }
}
