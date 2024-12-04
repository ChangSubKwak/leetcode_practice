package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2825_Make_String_a_Subsequence_Using_Cyclic_Increments_Test {
    @Test
    void test() {
        LC2825_Make_String_a_Subsequence_Using_Cyclic_Increments test = new LC2825_Make_String_a_Subsequence_Using_Cyclic_Increments();

        assertThat(test.canMakeSubsequence("abc", "ad")).isEqualTo(true);
        assertThat(test.canMakeSubsequence("zc", "ad")).isEqualTo(true);
        assertThat(test.canMakeSubsequence("ab", "d")).isEqualTo(false);
    }
}
