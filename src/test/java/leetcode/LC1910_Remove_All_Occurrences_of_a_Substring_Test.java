package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1910_Remove_All_Occurrences_of_a_Substring_Test {
    @Test
    void exampleTest() {
        LC1910_Remove_All_Occurrences_of_a_Substring test = new LC1910_Remove_All_Occurrences_of_a_Substring();

        assertThat(test.removeOccurrences("daabcbaabcbc", "abc")).isEqualTo("dab");
        assertThat(test.removeOccurrences("axxxxyyyyb", "xy")).isEqualTo("ab");
    }
}
