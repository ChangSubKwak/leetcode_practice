package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2101_Detonate_the_Maximum_Test {
    @Test
    void exampleTest() {
        LC2101_Detonate_the_Maximum test = new LC2101_Detonate_the_Maximum();
        
        assertThat(test.maximumDetonation(new int[][]{
            {2, 1, 3},
            {6, 1, 4}
        })).isEqualTo(2);

        assertThat(test.maximumDetonation(new int[][]{
            {1, 1, 5},
            {10, 10, 5}
        })).isEqualTo(1);

        assertThat(test.maximumDetonation(new int[][]{
            {1, 2, 3},
            {2, 3, 1},
            {3, 4, 2},
            {4, 5, 3},
            {5, 6, 4}
        })).isEqualTo(2);
    }
}
