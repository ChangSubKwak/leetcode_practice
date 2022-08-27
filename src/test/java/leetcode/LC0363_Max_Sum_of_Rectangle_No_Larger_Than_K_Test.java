package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0363_Max_Sum_of_Rectangle_No_Larger_Than_K_Test {
    LC0363_Max_Sum_of_Rectangle_No_Larger_Than_K test;
    
    @BeforeEach
    void setUp() {
        test = new LC0363_Max_Sum_of_Rectangle_No_Larger_Than_K();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.maxSumSubmatrix(new int[][]{{1, 0, 1},{0, -2, 3}}, 2)).isEqualTo(2);
        assertThat(test.maxSumSubmatrix(new int[][]{{2, 2, -1}}, 3)).isEqualTo(3);
    }
}
