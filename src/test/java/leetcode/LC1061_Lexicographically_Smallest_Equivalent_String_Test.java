package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1061_Lexicographically_Smallest_Equivalent_String_Test {
    @Test
    void test() {
        LC1061_Lexicographically_Smallest_Equivalent_String test = new LC1061_Lexicographically_Smallest_Equivalent_String();
        assertThat(test.smallestEquivalentString("parker", "morris", "parser")).isEqualTo("makkek");
        assertThat(test.smallestEquivalentString("hello", "world", "hold")).isEqualTo("hdld");
        assertThat(test.smallestEquivalentString("leetcode", "programs", "sourcecode")).isEqualTo("aauaaaaada");
    }
}
