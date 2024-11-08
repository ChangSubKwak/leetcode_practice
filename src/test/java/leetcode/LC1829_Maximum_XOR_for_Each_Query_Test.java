package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1829_Maximum_XOR_for_Each_Query_Test {
    @Test
    void exampleTest() {
        LC1829_Maximum_XOR_for_Each_Query test = new LC1829_Maximum_XOR_for_Each_Query();

        assertThat(test.getMaximumXor(new int[]{0, 1, 1, 3}, 2)).isEqualTo(new int[]{0, 3, 2, 3});
        assertThat(test.getMaximumXor(new int[]{2, 3, 4, 7}, 3)).isEqualTo(new int[]{5, 2, 6, 5});
        assertThat(test.getMaximumXor(new int[]{0, 1, 2, 2, 5, 7}, 3)).isEqualTo(new int[]{4, 3, 6, 4, 6, 7});
    }
}
