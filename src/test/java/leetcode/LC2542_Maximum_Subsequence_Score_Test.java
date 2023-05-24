package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2542_Maximum_Subsequence_Score_Test {
    @Test
    void test() {
        LC2542_Maximum_Subsequence_Score test = new LC2542_Maximum_Subsequence_Score();
        assertThat(test.maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3)).isEqualTo(12);
        assertThat(test.maxScore(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1)).isEqualTo(30);
    }
}
