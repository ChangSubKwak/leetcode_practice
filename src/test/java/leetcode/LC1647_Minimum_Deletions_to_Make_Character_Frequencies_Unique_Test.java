package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1647_Minimum_Deletions_to_Make_Character_Frequencies_Unique_Test {
    LC1647_Minimum_Deletions_to_Make_Character_Frequencies_Unique test = new LC1647_Minimum_Deletions_to_Make_Character_Frequencies_Unique();

    @Test
    void exampleTest() {
        assertThat(test.minDeletions("aab")).isEqualTo(0);
        assertThat(test.minDeletions("aaabbbcc")).isEqualTo(2);
        assertThat(test.minDeletions("ceabaacb")).isEqualTo(2);
    }
}
