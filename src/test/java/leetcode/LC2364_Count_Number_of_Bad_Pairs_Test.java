package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2364_Count_Number_of_Bad_Pairs_Test {

    @Test
    void exampleTest() {
        LC2364_Count_Number_of_Bad_Pairs test = new LC2364_Count_Number_of_Bad_Pairs();

        assertThat(test.countBadPairs(new int[]{4, 1, 3, 3})).isEqualTo(5);
        assertThat(test.countBadPairs(new int[]{1, 2, 3, 4, 5})).isEqualTo(0);

    }
}
