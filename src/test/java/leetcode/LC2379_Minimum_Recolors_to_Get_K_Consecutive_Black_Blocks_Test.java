package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks_Test {
    @Test
    void exampleTest() {
        LC2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks test = new LC2379_Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks();

        assertThat(test.minimumRecolors("WBBWWBBWBW", 7)).isEqualTo(3);
        assertThat(test.minimumRecolors("WBWBBBW", 2)).isEqualTo(0);

    }
}
