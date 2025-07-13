package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2410_Maximum_Matching_of_Players_With_Trainers_Test {
    @Test
    void exampleTest1() {
        LC2410_Maximum_Matching_of_Players_With_Trainers test = new LC2410_Maximum_Matching_of_Players_With_Trainers();

        assertThat(test.matchPlayersAndTrainers(new int[]{4, 7, 9}, new int[]{8, 2, 5, 8})).isEqualTo(2);
        assertThat(test.matchPlayersAndTrainers(new int[]{1, 1, 1}, new int[]{10})).isEqualTo(1);
    }
}
