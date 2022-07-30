package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0914_Word_Subsets_Test {
    LC0914_Word_Subsets test;
    
    @BeforeEach
    void setUp() {
        test = new LC0914_Word_Subsets();
    }
    
    @Test
    void test() {
        assertThat(test.wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[] {"e", "o"}))
            .isEqualTo(Arrays.asList("facebook", "google", "leetcode"));
        assertThat(test.wordSubsets(new String[]{"amazon", "apple", "facebook", "google", "leetcode"}, new String[] {"l", "e"}))
            .isEqualTo(Arrays.asList("apple", "google", "leetcode"));
    }
}
