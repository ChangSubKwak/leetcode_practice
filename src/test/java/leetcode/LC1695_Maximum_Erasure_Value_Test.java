package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1695_Maximum_Erasure_Value_Test {

    LC1695_Maximum_Erasure_Value lc = new LC1695_Maximum_Erasure_Value();

    @Test
    void exampleTest() {
        assertThat(lc.maximumUniqueSubarray(new int[] {4, 2, 4, 5, 6})).isEqualTo(17);
        assertThat(lc.maximumUniqueSubarray(new int[] {5, 2, 1, 2, 5, 2, 1, 2, 5})).isEqualTo(8);
    }
}
