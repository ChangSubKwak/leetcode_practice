package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC1639_Number_of_Ways_to_Form_a_Target_String_Given_a_Dictionary_Test {
    @Test
    void test() {
        LC1639_Number_of_Ways_to_Form_a_Target_String_Given_a_Dictionary test = new LC1639_Number_of_Ways_to_Form_a_Target_String_Given_a_Dictionary();

        assertThat(test.numWays(Arrays.asList("acca", "bbbb", "caca"), "aba")).isEqualTo(6);
        assertThat(test.numWays(Arrays.asList("abba", "baab"), "bab")).isEqualTo(4);
    }
}
