package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2780_Minimum_Index_of_a_Valid_Split_Test {
    @Test
    void test() {
        LC2780_Minimum_Index_of_a_Valid_Split test = new LC2780_Minimum_Index_of_a_Valid_Split();

        assertThat(test.minimumIndex(Arrays.asList(1, 2, 2, 2))).isEqualTo(2);
        assertThat(test.minimumIndex(Arrays.asList(2, 1, 3, 1, 1, 1, 7, 1, 2, 1))).isEqualTo(4);
        assertThat(test.minimumIndex(Arrays.asList(3, 3, 3, 3, 7, 2, 2))).isEqualTo(-1);
    }
}
