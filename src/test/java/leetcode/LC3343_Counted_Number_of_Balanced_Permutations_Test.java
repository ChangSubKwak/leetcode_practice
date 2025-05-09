package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3343_Counted_Number_of_Balanced_Permutations_Test {
    @Test
    void test() {
        LC3343_Counted_Number_of_Balanced_Permutations test = new LC3343_Counted_Number_of_Balanced_Permutations();

        assertThat(test.countBalancedPermutations("123")).isEqualTo(2);
        assertThat(test.countBalancedPermutations("112")).isEqualTo(1);
        assertThat(test.countBalancedPermutations("12345")).isEqualTo(0);
    }
}
