package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2563_Count_the_Number_of_Fair_Pairs_Test {
    @Test
    void test() {
        LC2563_Count_the_Number_of_Fair_Pairs test = new LC2563_Count_the_Number_of_Fair_Pairs();

        assertThat(test.countFairPairs(new int[]{0, 1, 7, 4, 4, 5}, 3, 6)).isEqualTo(6);
        assertThat(test.countFairPairs(new int[]{1, 7, 9, 2, 5}, 11, 11)).isEqualTo(1);

    }
}
