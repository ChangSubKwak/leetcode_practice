package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LC1684_Count_the_Number_of_Consistent_Strings_Test {

    @Test
    void test() {
        LC1684_Count_the_Number_of_Consistent_Strings test = new LC1684_Count_the_Number_of_Consistent_Strings();

        assertThat(test.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"})).isEqualTo(2);
        assertThat(test.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"})).isEqualTo(7);
        assertThat(test.countConsistentStrings("cad", new String[]{"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"})).isEqualTo(4);
    }
}