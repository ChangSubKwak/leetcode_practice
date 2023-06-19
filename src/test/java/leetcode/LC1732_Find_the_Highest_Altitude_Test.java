package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1732_Find_the_Highest_Altitude_Test {

    @Test
    void exampleTest() {
        LC1732_Find_the_Highest_Altitude test = new LC1732_Find_the_Highest_Altitude();

        assertThat(test.largestAltitude(new int[]{-5, 1, 5, 0, -7})).isEqualTo(1);
        assertThat(test.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})).isEqualTo(0);
    }
}
