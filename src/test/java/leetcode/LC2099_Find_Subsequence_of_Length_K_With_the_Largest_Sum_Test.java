package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2099_Find_Subsequence_of_Length_K_With_the_Largest_Sum_Test {
    @Test
    void exampleTest1() {
        LC2099_Find_Subsequence_of_Length_K_With_the_Largest_Sum test = new LC2099_Find_Subsequence_of_Length_K_With_the_Largest_Sum();

        assertThat(test.maxSubsequence(new int[]{2, 1, 3, 3}, 2)).isEqualTo(new int[]{3, 3});
        assertThat(test.maxSubsequence(new int[]{-1, -2, 3, 4}, 3)).isEqualTo(new int[]{-1, 3, 4});
        assertThat(test.maxSubsequence(new int[]{3, 4, 3, 3}, 2)).isEqualTo(new int[]{3, 4});
    }
}
