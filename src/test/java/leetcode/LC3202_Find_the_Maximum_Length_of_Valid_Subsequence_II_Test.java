package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3202_Find_the_Maximum_Length_of_Valid_Subsequence_II_Test {
    @Test
    void test() {
        LC3202_Find_the_Maximum_Length_of_Valid_Subsequence_II test = new LC3202_Find_the_Maximum_Length_of_Valid_Subsequence_II();

        assertThat(test.maximumLength(new int[]{1, 2, 3, 4, 5}, 2)).isEqualTo(5);
        assertThat(test.maximumLength(new int[]{1, 4, 2, 3, 1, 4}, 3)).isEqualTo(4);
    }
}
