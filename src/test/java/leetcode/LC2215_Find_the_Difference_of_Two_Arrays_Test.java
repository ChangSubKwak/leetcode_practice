package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class LC2215_Find_the_Difference_of_Two_Arrays_Test {

    @Test
    void test() {
        LC2215_Find_the_Difference_of_Two_Arrays test = new LC2215_Find_the_Difference_of_Two_Arrays();
        Assertions.assertThat(test.findDifference(new int[]{1, 2, 3}, new int[]{4, 5, 6})).isEqualTo(
            Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(4, 6)
            )
        );

        Assertions.assertThat(test.findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2})).isEqualTo(
            Arrays.asList(
                Arrays.asList(3),
                Arrays.asList()
            )
        );
    }
}
