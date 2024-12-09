package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3152_Special_Array_II_Test {
    @Test
    void test() {
        LC3152_Special_Array_II test = new LC3152_Special_Array_II();

        assertThat(test.isArraySpecial(
            new int[]{3, 4, 1, 2, 6},
            new int[][]{{0, 4}}
        )).isEqualTo(new boolean[]{false});

        assertThat(test.isArraySpecial(
                new int[]{4, 3, 1, 6},
                new int[][]{{0, 2}, {2, 3}}
        )).isEqualTo(new boolean[]{false, true});
    }
}
