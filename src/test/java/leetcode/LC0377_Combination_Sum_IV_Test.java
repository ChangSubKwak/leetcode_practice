package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0377_Combination_Sum_IV_Test {

    @Test
    void test() {
        LC0377_Combination_Sum_IV test = new LC0377_Combination_Sum_IV();
        assertThat(test.combinationSum4(new int[] {1, 2, 3}, 4)).isEqualTo(7);
        assertThat(test.combinationSum4(new int[] {9}, 3)).isEqualTo(0);
    }
}
