package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2348_Number_of_Zero_Filled_Subarrays_Test {
    LC2348_Number_of_Zero_Filled_Subarrays test = new LC2348_Number_of_Zero_Filled_Subarrays();

    @Test
    void exampleTest() {
        assertThat(test.zeroFilledSubarray(new int[] {1, 3, 0, 0, 2, 0, 0, 4})).isEqualTo(6);
        assertThat(test.zeroFilledSubarray(new int[] {0, 0, 0, 2, 0, 0})).isEqualTo(9);
        assertThat(test.zeroFilledSubarray(new int[] {2, 10, 2019})).isEqualTo(0);

    }
}
