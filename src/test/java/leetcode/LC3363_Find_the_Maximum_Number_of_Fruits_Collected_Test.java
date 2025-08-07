package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3363_Find_the_Maximum_Number_of_Fruits_Collected_Test {
    @Test
    void test() {
        LC3363_Find_the_Maximum_Number_of_Fruits_Collected test = new LC3363_Find_the_Maximum_Number_of_Fruits_Collected();

        assertThat(test.maxCollectedFruits(new int[][]{{1, 2, 3, 4}, {5, 6, 8, 7}, {9, 10, 11, 12}, {13, 14, 15, 16}})).isEqualTo(100);
        assertThat(test.maxCollectedFruits(new int[][]{{1, 1}, {1, 1}})).isEqualTo(4);
    }
}
