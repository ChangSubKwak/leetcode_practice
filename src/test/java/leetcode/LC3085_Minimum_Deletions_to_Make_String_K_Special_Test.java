package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3085_Minimum_Deletions_to_Make_String_K_Special_Test {
    @Test
    void test() {
        LC3085_Minimum_Deletions_to_Make_String_K_Special test = new LC3085_Minimum_Deletions_to_Make_String_K_Special();

        assertThat(test.minimumDeletions("aabcaba", 0)).isEqualTo(3);
        assertThat(test.minimumDeletions("dabdcbdcdcd", 2)).isEqualTo(2);
        assertThat(test.minimumDeletions("aaabaaa", 2)).isEqualTo(1);
    }
}
