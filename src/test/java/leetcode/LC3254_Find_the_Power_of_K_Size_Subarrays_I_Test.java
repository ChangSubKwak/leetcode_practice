package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC3254_Find_the_Power_of_K_Size_Subarrays_I_Test {
    @Test
    void test() {
        LC3254_Find_the_Power_of_K_Size_Subarrays_I test = new LC3254_Find_the_Power_of_K_Size_Subarrays_I();

        assertThat(test.resultsArray(new int[]{1, 2, 3, 4, 3, 2, 5}, 3)).isEqualTo(new int[]{3, 4, -1, -1, -1});
        assertThat(test.resultsArray(new int[]{2, 2, 2, 2, 2}, 4)).isEqualTo(new int[]{-1, -1});
        assertThat(test.resultsArray(new int[]{3, 2, 3, 2, 3, 2}, 2)).isEqualTo(new int[]{-1, 3, -1, 3, -1});
    }
}
