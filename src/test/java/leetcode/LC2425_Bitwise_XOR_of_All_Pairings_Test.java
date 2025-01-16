package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2425_Bitwise_XOR_of_All_Pairings_Test {
    LC2425_Bitwise_XOR_of_All_Pairings test = new LC2425_Bitwise_XOR_of_All_Pairings();

    @Test
    void exampleTest() {
        assertThat(test.xorAllNums(new int[]{2, 1, 3}, new int[]{10, 2, 5, 0})).isEqualTo(13);
        assertThat(test.xorAllNums(new int[]{1, 2}, new int[]{3, 4})).isEqualTo(0);
    }
}
