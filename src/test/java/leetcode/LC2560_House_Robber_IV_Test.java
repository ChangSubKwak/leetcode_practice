package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2560_House_Robber_IV_Test {
    @Test
    void test() {
        LC2560_House_Robber_IV test = new LC2560_House_Robber_IV();

        assertThat(test.minCapability(new int[]{2, 3, 5, 9}, 2)).isEqualTo(5);
        assertThat(test.minCapability(new int[]{2, 7, 9, 3, 1}, 2)).isEqualTo(2);

    }
}
