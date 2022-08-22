package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0936_Stamping_The_Sequence_Test {
    LC0936_Stamping_The_Sequence test;
    
    @BeforeEach
    void setUp() {
        test = new LC0936_Stamping_The_Sequence();
    }
    
    @Test
    void test() {
        assertThat(test.movesToStamp("abc", "ababc")).isEqualTo(new int[]{0, 2});
        assertThat(test.movesToStamp("abca", "aabcaca")).isEqualTo(new int[]{3, 0, 1});
    }
}
