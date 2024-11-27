package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3243_Shortest_Distance_After_Road_Addition_Queries_I_Test {
    @Test
    void test() {
        LC3243_Shortest_Distance_After_Road_Addition_Queries_I test = new LC3243_Shortest_Distance_After_Road_Addition_Queries_I();

        assertThat(test.shortestDistanceAfterQueries(5, new int[][]{
            {2, 4}, {0, 2}, {0, 4}
        })).isEqualTo(new int[]{3, 2, 1});

        assertThat(test.shortestDistanceAfterQueries(4, new int[][]{
                {0, 3}, {0, 2}
        })).isEqualTo(new int[]{1, 1});
    }
}
