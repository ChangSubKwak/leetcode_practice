package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC1048_Longest_String_Chain_Test {
    
    private LC1048_Longest_String_Chain lc;
    
    @BeforeEach
    void setUp() {
        lc = new LC1048_Longest_String_Chain();
    }
    
    @Test
    void test1() {
        String[] words = new String[] { "a", "b", "ba", "bca", "bda", "bdca" };
        Assertions.assertThat(lc.longestStrChain(words)).isEqualTo(4);
    }
    
    @Test
    void test2() {
        String[] words = new String[] { "xbc", "pcxbcf", "xb", "cxbc", "pcxbc" };
        Assertions.assertThat(lc.longestStrChain(words)).isEqualTo(5);
    }
    
    @Test
    void test3() {
        String[] words = new String[] { "abcd","dbqca" };
        Assertions.assertThat(lc.longestStrChain(words)).isEqualTo(1);
    }
}
