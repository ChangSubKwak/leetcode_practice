package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0443_String_Compression_Test {

    @Test
    void minimumTotal() {
        LC0443_String_Compression test = new LC0443_String_Compression();

        assertThat(test.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'})).isEqualTo(6);
        assertThat(test.compress(new char[]{'a'})).isEqualTo(1);
        assertThat(test.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'})).isEqualTo(4);
    }
}
