package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0880_Decoded_String_at_Index_Test {
    @Test
    void test() {
        LC0880_Decoded_String_at_Index test = new LC0880_Decoded_String_at_Index();
        assertThat(test.decodeAtIndex("leet2code3", 10)).isEqualTo("o");
        assertThat(test.decodeAtIndex("ha22", 5)).isEqualTo("h");
        assertThat(test.decodeAtIndex("a2345678999999999999999", 1)).isEqualTo("a");
    }
}
