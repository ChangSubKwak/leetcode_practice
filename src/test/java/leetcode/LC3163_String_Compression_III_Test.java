package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3163_String_Compression_III_Test {
    @Test
    void test() {
        LC3163_String_Compression_III test = new LC3163_String_Compression_III();
        assertThat(test.compressedString("abcde")).isEqualTo("1a1b1c1d1e");
        assertThat(test.compressedString("aaaaaaaaaaaaaabb")).isEqualTo("9a5a2b");
    }
}
