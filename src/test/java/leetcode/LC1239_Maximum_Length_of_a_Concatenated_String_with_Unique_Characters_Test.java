package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

class LC1239_Maximum_Length_of_a_Concatenated_String_with_Unique_Characters_Test {

    @Test
    void test() {
        LC1239_Maximum_Length_of_a_Concatenated_String_with_Unique_Characters test = new LC1239_Maximum_Length_of_a_Concatenated_String_with_Unique_Characters();

        assertThat(test.maxLength(Arrays.asList("un", "iq", "ue"))).isEqualTo(4);
        assertThat(test.maxLength(Arrays.asList("cha","r","act","ers"))).isEqualTo(6);
        assertThat(test.maxLength(Arrays.asList("abcdefghijklmnopqrstuvwxyz"))).isEqualTo(26);
    }
}
