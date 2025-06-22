package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2138_Divide_a_String_Into_Groups_of_Size_k_Test {
    @Test
    void exampleTest() {
        LC2138_Divide_a_String_Into_Groups_of_Size_k test = new LC2138_Divide_a_String_Into_Groups_of_Size_k();

        assertThat(test.divideString("abcdefghi", 3, 'x')).isEqualTo(new String[]{"abc", "def", "ghi"});
        assertThat(test.divideString("abcdefghij", 3, 'x')).isEqualTo(new String[]{"abc", "def", "ghi", "jxx"});
    }
}
