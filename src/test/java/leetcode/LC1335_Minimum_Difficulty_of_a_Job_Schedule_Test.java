package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1338_Minimum_Difficulty_of_a_Job_Schedule_Test {
    @Test
    void test() {
        LC1338_Minimum_Difficulty_of_a_Job_Schedule test = new LC1338_Minimum_Difficulty_of_a_Job_Schedule();
        assertThat(test.minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2)).isEqualTo(7);
        assertThat(test.minDifficulty(new int[]{9, 9, 9}, 4)).isEqualTo(-1);
        assertThat(test.minDifficulty(new int[]{1, 1, 1}, 3)).isEqualTo(3);
    }
}
