package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC1046_Last_Stone_Weight_Test {
    @Test
    void test() {
        LC1046_Last_Stone_Weight test = new LC1046_Last_Stone_Weight();

        assertThat(test.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1})).isEqualTo(1);
        assertThat(test.lastStoneWeight(new int[]{1})).isEqualTo(1);
    }
}
