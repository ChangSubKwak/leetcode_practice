package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2460_Apply_Operations_to_an_Array_Test {

    @Test
    void test() {
        LC2460_Apply_Operations_to_an_Array test = new LC2460_Apply_Operations_to_an_Array();

        assertThat(test.applyOperations(new int[]{1, 2, 2, 1, 1, 0})).isEqualTo(new int[]{1, 4, 2, 0, 0, 0});
        assertThat(test.applyOperations(new int[]{0, 1})).isEqualTo(new int[]{1, 0});
    }
}
