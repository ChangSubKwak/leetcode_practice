package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1900_The_Earliest_and_Latest_Rounds_Where_Players_Compete_Test {
    @Test
    void exampleTest() {
        LC1900_The_Earliest_and_Latest_Rounds_Where_Players_Compete test = new LC1900_The_Earliest_and_Latest_Rounds_Where_Players_Compete();

        assertThat(test.earliestAndLatest(11, 2, 4)).isEqualTo(new int[]{3, 4});
        assertThat(test.earliestAndLatest(5, 1, 5)).isEqualTo(new int[]{1, 1});
    }
}
