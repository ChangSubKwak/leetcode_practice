package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0462_LFU_Cache_Test {
    @Test
    void test() {
        LC0462_LFU_Cache_X.LFUCache test = new LC0462_LFU_Cache_X.LFUCache(2);
        test.put(1, 1);
        test.put(2, 2);
        assertThat(test.get(1)).isEqualTo(1);
        test.put(3, 3);
        assertThat(test.get(2)).isEqualTo(-1);
        assertThat(test.get(3)).isEqualTo(3);
        test.put(4, 4);
        assertThat(test.get(1)).isEqualTo(-1);
        assertThat(test.get(3)).isEqualTo(3);
        assertThat(test.get(4)).isEqualTo(4);
    }
}
