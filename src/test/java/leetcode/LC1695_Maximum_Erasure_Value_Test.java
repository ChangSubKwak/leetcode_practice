package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1695_Maximum_Erasure_Value_Test {
    @Test
    void test() {
        LC1695_Maximum_Erasure_Value test = new LC1695_Maximum_Erasure_Value();

        assertThat(test.maximumUniqueSubarray(new int[]{4, 2, 4, 5, 6})).isEqualTo(17);
        assertThat(test.maximumUniqueSubarray(new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5})).isEqualTo(8);
    }
}
