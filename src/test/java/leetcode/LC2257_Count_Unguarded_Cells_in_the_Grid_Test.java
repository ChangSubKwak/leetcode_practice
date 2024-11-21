package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2257_Count_Unguarded_Cells_in_the_Grid_Test {
    @Test
    void exampleTest() {
        LC2257_Count_Unguarded_Cells_in_the_Grid test = new LC2257_Count_Unguarded_Cells_in_the_Grid();
        assertThat(test.countUnguarded(
            4, 6,
            new int[][]{{0, 0}, {1, 1}, {2, 3}},
            new int[][]{{0, 1}, {2, 2}, {1, 4}})
        ).isEqualTo(7);
        
    }
}
