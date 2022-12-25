package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC2389_Longest_Subsequence_With_Limited_Sum_Test {
    LC2389_Longest_Subsequence_With_Limited_Sum test = new LC2389_Longest_Subsequence_With_Limited_Sum();

    @Test
    void exampleTest() {
        assertThat(test.answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21})).isEqualTo(new int[]{2, 3, 4});
        assertThat(test.answerQueries(new int[]{2, 3, 4, 5}, new int[]{1})).isEqualTo(new int[]{0});
    }
}
