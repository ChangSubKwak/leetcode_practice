package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2141_Maximum_Running_Time_of_N_Computers_Test {
    @Test
    void exampleTest() {
        LC2141_Maximum_Running_Time_of_N_Computers test = new LC2141_Maximum_Running_Time_of_N_Computers();
        assertThat(test.maxRunTime(2, new int[]{3, 3, 3})).isEqualTo(4);
        assertThat(test.maxRunTime(2, new int[]{1, 1, 1, 1})).isEqualTo(2);
    }
}
