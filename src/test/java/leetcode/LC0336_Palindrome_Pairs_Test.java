package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0336_Palindrome_Pairs_Test {
    LC0336_Palindrome_Pairs test;

    @BeforeEach
    void setUp() {
        test = new LC0336_Palindrome_Pairs();
    }
    
    @Test
    void test() {
        assertThat(test.palindromePairs(new String[]{"abcd","dcba","lls","s","sssll"})).isEqualTo(
            Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0),
                Arrays.asList(3, 2),
                Arrays.asList(2, 4)
            )
        );

        assertThat(test.palindromePairs(new String[]{"bat","tab","cat"})).isEqualTo(
            Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
            )
        );

        assertThat(test.palindromePairs(new String[]{"a",""})).isEqualTo(
            Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 0)
                )
        );
    }
}
