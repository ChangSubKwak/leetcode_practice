package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0967_Numbers_With_Same_Consecutive_Differences_Test {
    LC0967_Numbers_With_Same_Consecutive_Differences test;
    
    @BeforeEach
    void setUp() {
        test = new LC0967_Numbers_With_Same_Consecutive_Differences();
    }
    
    @Test
    void test() {
        assertThat(test.numsSameConsecDiff(3, 7)).isEqualTo(new int[] {181, 292, 707, 818, 929});
        // assertThat(test.numsSameConsecDiff(2, 1)).isEqualTo(new int[] {10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98});
    }
}
