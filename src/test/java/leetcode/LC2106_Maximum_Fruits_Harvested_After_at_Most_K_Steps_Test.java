package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2106_Maximum_Fruits_Harvested_After_at_Most_K_Steps_Test {
    @Test
    void exampleTest() {
        LC2106_Maximum_Fruits_Harvested_After_at_Most_K_Steps test = new LC2106_Maximum_Fruits_Harvested_After_at_Most_K_Steps();
        
        assertThat(test.maxTotalFruits(new int[][]{{2, 8}, {6, 3}, {8, 6}}, 5, 4)).isEqualTo(9);
        assertThat(test.maxTotalFruits(new int[][]{{0, 9}, {4, 1}, {5, 7}, {6, 2}, {7, 4}, {10, 9}}, 5, 4)).isEqualTo(14);
        assertThat(test.maxTotalFruits(new int[][]{{0, 3}, {6, 4}, {8, 5}}, 3, 2)).isEqualTo(0);
    }
}
