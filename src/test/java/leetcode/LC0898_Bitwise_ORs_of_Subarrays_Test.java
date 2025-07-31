package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC0898_Bitwise_ORs_of_Subarrays_Test {
    @Test
    void test() {
        LC0898_Bitwise_ORs_of_Subarrays test = new LC0898_Bitwise_ORs_of_Subarrays();

        assertThat(test.subarrayBitwiseORs(new int[]{0})).isEqualTo(1);
        assertThat(test.subarrayBitwiseORs(new int[]{1, 1, 2})).isEqualTo(3);
        assertThat(test.subarrayBitwiseORs(new int[]{1, 2, 4})).isEqualTo(6);
    }
}
