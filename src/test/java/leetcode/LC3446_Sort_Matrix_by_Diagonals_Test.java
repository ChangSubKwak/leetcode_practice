package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LC3446_Sort_Matrix_by_Diagonals_Test {
    @Test
    void test() {
        LC3446_Sort_Matrix_by_Diagonals test = new LC3446_Sort_Matrix_by_Diagonals();

        assertThat(test.sortMatrix(new int[][]{{1, 7, 3}, {9, 8, 2}, {4, 5, 6}}))
                .isEqualTo(new int[][]{{8, 2, 3}, {9, 6, 7}, {4, 5, 1}});
        assertThat(test.sortMatrix(new int[][]{{0, 1}, {1, 2}})).isEqualTo(new int[][]{{2, 1}, {1, 0}});
        assertThat(test.sortMatrix(new int[][]{{1}})).isEqualTo(new int[][]{{1}});
    }
}
