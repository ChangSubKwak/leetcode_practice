package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2244_Minimum_Rounds_to_Complete_All_Test {
    @Test
    void exampleTest() {
        LC2244_Minimum_Rounds_to_Complete_All test = new LC2244_Minimum_Rounds_to_Complete_All();
        assertThat(test.minimumRounds(new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4})).isEqualTo(4);
        assertThat(test.minimumRounds(new int[]{2, 3, 3})).isEqualTo(-1);
        assertThat(test.minimumRounds(new int[]{7, 7, 7, 7, 7, 7})).isEqualTo(2);
    }
}
