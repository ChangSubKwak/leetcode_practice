package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0315_Count_of_Smaller_Numbers_After_Self_Test {
    LC0315_Count_of_Smaller_Numbers_After_Self_X test;
    
    @BeforeEach
    void setUp() {
        test = new LC0315_Count_of_Smaller_Numbers_After_Self_X();
    }
    
    @Test
    void minimumTotal() {
        assertThat(test.countSmaller(new int[] {5, 2, 6, 1})).isEqualTo(Arrays.asList(2, 1, 1, 0));
        assertThat(test.countSmaller(new int[] {-1})).isEqualTo(Arrays.asList(0));
        assertThat(test.countSmaller(new int[] {-1, -1})).isEqualTo(Arrays.asList(0, 0));
    }
}
