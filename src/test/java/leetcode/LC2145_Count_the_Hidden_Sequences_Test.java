package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2145_Count_the_Hidden_Sequences_Test {
    @Test
    void exampleTest() {
        LC2145_Count_the_Hidden_Sequences test = new LC2145_Count_the_Hidden_Sequences();

        assertThat(test.numberOfArrays(new int[]{1, -3, 4}, 1, 6)).isEqualTo(2);
        assertThat(test.numberOfArrays(new int[]{3, -4, 5, 1, -2}, -4, 5)).isEqualTo(4);
        assertThat(test.numberOfArrays(new int[]{4, -7, 2}, 3, 5)).isEqualTo(0);
    }
}
