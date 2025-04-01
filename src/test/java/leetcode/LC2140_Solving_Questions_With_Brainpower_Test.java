package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2140_Solving_Questions_With_Brainpower_Test {
    @Test
    void exampleTest() {
        LC2140_Solving_Questions_With_Brainpower test = new LC2140_Solving_Questions_With_Brainpower();

        assertThat(test.mostPoints(new int[][]{{3, 2}, {4, 3}, {4, 4}, {2, 5}})).isEqualTo(5);
        assertThat(test.mostPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}, {4, 4}})).isEqualTo(7);
    }
}
