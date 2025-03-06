package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2965_Find_Missing_and_Repeated_Values_Test {

    @Test
    void test() {
        LC2965_Find_Missing_and_Repeated_Values test = new LC2965_Find_Missing_and_Repeated_Values();

        assertThat(test.findMissingAndRepeatedValues(new int[][]{{1, 3}, {2, 2}})).isEqualTo(new int[]{2, 4});
        assertThat(test.findMissingAndRepeatedValues(new int[][]{{9, 1, 7}, {8, 9, 2}, {3, 4, 6}})).isEqualTo(new int[]{9, 5});
    }
}
