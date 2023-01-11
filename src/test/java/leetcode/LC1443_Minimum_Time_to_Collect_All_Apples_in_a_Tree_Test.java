package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC1443_Minimum_Time_to_Collect_All_Apples_in_a_Tree_Test {
    @Test
    void test() {
        LC1443_Minimum_Time_to_Collect_All_Apples_in_a_Tree test = new LC1443_Minimum_Time_to_Collect_All_Apples_in_a_Tree();
        assertThat(test.minTime(7,
            new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, Arrays.asList(false, false, true, false, true, true, false))
        ).isEqualTo(8);

        assertThat(test.minTime(7,
            new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, Arrays.asList(false, false, true, false, false, true, false))
        ).isEqualTo(6);

        assertThat(test.minTime(7,
            new int[][]{{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}}, Arrays.asList(false, false, false, false, false, false, false))
        ).isEqualTo(0);
    }
}
