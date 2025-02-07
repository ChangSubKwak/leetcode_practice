package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls_Test {
    @Test
    void test() {
        LC3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls test = new LC3160_Find_the_Number_of_Distinct_Colors_Among_the_Balls();

        assertThat(test.queryResults(4, new int[][]{
                {1, 4}, {2, 5}, {1, 3}, {3, 4}
        })).isEqualTo(new int[]{1, 2, 2, 3});

        assertThat(test.queryResults(4, new int[][]{
                {0, 1}, {1, 2}, {2, 2}, {3, 4}, {4, 5}
        })).isEqualTo(new int[]{1, 2, 2, 3, 4});
    }
}
