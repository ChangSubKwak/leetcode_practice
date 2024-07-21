package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2391_Build_a_Matrix_With_Conditions_Test {
    @Test
    void exampleTest() {
        LC2391_Build_a_Matrix_With_Conditions  test = new LC2391_Build_a_Matrix_With_Conditions();
        
        assertThat(test.buildMatrix(
            3,
            new int[][]{{1, 2}, {3, 2}},
            new int[][]{{2, 1}, {3, 2}}
        )).isEqualTo(
            new int[][]{{3, 0, 0}, {0, 0, 1}, {0, 2, 0}}
        );

        assertThat(test.buildMatrix(
            3,
            new int[][]{{1, 2}, {2, 3}, {3, 1}, {2, 3}},
            new int[][]{{2, 1}}
        )).isEqualTo(
            new int[][]{{}}
        );
        
    }
}
