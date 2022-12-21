package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0886_Possible_Bipartition_Test {
    @Test
    void test() {
        LC0886_Possible_Bipartition test = new LC0886_Possible_Bipartition();
        assertThat(test.possibleBipartition(4, new int[][]{
            {1, 2}, {1, 3}, {2, 4}
        })).isTrue();
        assertThat(test.possibleBipartition(3, new int[][]{
            {1, 2}, {1, 3}, {2, 3}
        })).isFalse();
        assertThat(test.possibleBipartition(5, new int[][]{
            {1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}
        })).isFalse();
    }
}
