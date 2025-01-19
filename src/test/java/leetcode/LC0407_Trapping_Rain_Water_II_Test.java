package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0407_Trapping_Rain_Water_II_Test {
    LC0407_Trapping_Rain_Water_II test;
    
    @BeforeEach
    void setUp() {
        test = new LC0407_Trapping_Rain_Water_II();
    }
    
    @Test
    void test() {
        assertThat(test.trapRainWater(new int[][]{
                {1, 4, 3, 1, 3, 2},
                {3, 2, 1, 3, 2, 4},
                {2, 3, 3, 2, 3, 1}
        })).isEqualTo(4);

        assertThat(test.trapRainWater(new int[][]{
                {3, 3, 3, 3, 3},
                {3, 2, 2, 2, 3},
                {2, 2, 1, 2, 3},
                {3, 2, 2, 2, 3},
                {3, 3, 3, 3, 3}
        })).isEqualTo(10);
    }
}
