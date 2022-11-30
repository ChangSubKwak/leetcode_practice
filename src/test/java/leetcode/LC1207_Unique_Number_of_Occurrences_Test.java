package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1207_Unique_Number_of_Occurrences_Test {
    
    @Test
    void test() {
        LC1207_Unique_Number_of_Occurrences test = new LC1207_Unique_Number_of_Occurrences();
        assertThat(test.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3})).isTrue();
        assertThat(test.uniqueOccurrences(new int[]{1, 2})).isFalse();
        assertThat(test.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0})).isTrue();
    }
}
