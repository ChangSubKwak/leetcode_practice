package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0948_Bag_of_Tokens_Test {
    LC0948_Bag_of_Tokens test;
    
    @BeforeEach
    void setUp() {
        test = new LC0948_Bag_of_Tokens();
    }
    
    @Test
    void test() {
        assertThat(test.bagOfTokensScore(new int[]{100}, 50)).isEqualTo(0);
        assertThat(test.bagOfTokensScore(new int[]{100, 200}, 150)).isEqualTo(1);
        assertThat(test.bagOfTokensScore(new int[]{100, 200, 300, 400}, 200)).isEqualTo(2);
    }
}
