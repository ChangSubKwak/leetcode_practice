package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1383_Maximum_Performance_of_a_Team_Test {
    LC1383_Maximum_Performance_of_a_Team_X test;
    
    @BeforeEach
    void setUp() {
        test = new LC1383_Maximum_Performance_of_a_Team_X();
    }
    
    @Test
    void test() {
        assertThat(test.maxPerformance(6, new int[]{2, 10, 3, 1, 5, 8}, new int[]{5, 4, 3, 9, 7, 2}, 2)).isEqualTo(60);
        assertThat(test.maxPerformance(6, new int[]{2, 10, 3, 1, 5, 8}, new int[]{5, 4, 3, 9, 7, 2}, 3)).isEqualTo(68);
        assertThat(test.maxPerformance(6, new int[]{2, 10, 3, 1, 5, 8}, new int[]{5, 4, 3, 9, 7, 2}, 4)).isEqualTo(72);
    }
}
