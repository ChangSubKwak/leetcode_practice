package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class LC1424_Diagonal_Traverse_II_Test {
    @Test
    void test() {
        LC1424_Diagonal_Traverse_II test = new LC1424_Diagonal_Traverse_II();
        assertThat(test.findDiagonalOrder(Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        ))).isEqualTo(new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9});
        
        assertThat(test.findDiagonalOrder(Arrays.asList(
            Arrays.asList(1, 2, 3, 4, 5),
            Arrays.asList(6, 7),
            Collections.singletonList(8),
            Arrays.asList(9, 10, 11),
            Arrays.asList(12, 13, 14, 15, 16)
        ))).isEqualTo(new int[]{1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16});
    }
}
