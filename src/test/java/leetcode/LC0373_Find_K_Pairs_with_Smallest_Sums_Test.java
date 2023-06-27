package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.*;

public class LC0373_Find_K_Pairs_with_Smallest_Sums_Test {

    @Test
    void test() {
        LC0373_Find_K_Pairs_with_Smallest_Sums test = new LC0373_Find_K_Pairs_with_Smallest_Sums();
        assertThat(test.kSmallestPairs(new int[]{1, 7, 11}, new int[]{2, 4, 6}, 3)).isEqualTo(
            Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(1, 4),
                Arrays.asList(1, 6)
            )
        );

        assertThat(test.kSmallestPairs(new int[]{1, 1, 2}, new int[]{1, 2, 3}, 2)).isEqualTo(
            Arrays.asList(
                Arrays.asList(1, 1),
                Arrays.asList(1, 1)
            )
        );

        assertThat(test.kSmallestPairs(new int[]{1, 2}, new int[]{3}, 3)).isEqualTo(
            Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 3)
            )
        );
    }
}
