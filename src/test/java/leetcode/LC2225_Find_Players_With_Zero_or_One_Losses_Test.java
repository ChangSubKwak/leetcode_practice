package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2225_Find_Players_With_Zero_or_One_Losses_Test {
    @Test
    void exampleTest() {
        LC2225_Find_Players_With_Zero_or_One_Losses test = new LC2225_Find_Players_With_Zero_or_One_Losses();
        assertThat(test.findWinners(new int[][]{
            {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}
        })).isEqualTo(
            Arrays.asList(
                Arrays.asList(1, 2, 10),
                Arrays.asList(4, 5, 7, 8)
            )
        );

        assertThat(test.findWinners(new int[][]{
            {2, 3}, {1, 3}, {5, 4}, {6, 4}
        })).isEqualTo(
            Arrays.asList(
                Arrays.asList(1, 2, 5, 6),
                Arrays.asList()
            )
        );
    }
}
