package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2322_Minimum_Score_After_Removals_on_a_Tree_Test {
    @Test
    void test1() {
        LC2322_Minimum_Score_After_Removals_on_a_Tree test = new LC2322_Minimum_Score_After_Removals_on_a_Tree();

        assertThat(test.minimumScore(new int[]{1, 5, 5, 4, 11}, new int[][]{
                {0, 1}, {1, 2}, {1, 3}, {3, 4}}
        )).isEqualTo(9);

        assertThat(test.minimumScore(new int[]{5, 5, 2, 4, 4, 2}, new int[][]{
                {0, 1}, {1, 2}, {5, 2}, {4, 3}, {1, 3}}
        )).isEqualTo(0);
    }
}
