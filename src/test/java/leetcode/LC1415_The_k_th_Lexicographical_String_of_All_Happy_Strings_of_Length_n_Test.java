package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n_Test {
    @Test
    void test() {
        LC1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n test = new LC1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n();

        assertThat(test.getHappyString(1, 3)).isEqualTo("c");
        assertThat(test.getHappyString(1, 4)).isEqualTo("");
        assertThat(test.getHappyString(3, 9)).isEqualTo("cab");
    }
}
