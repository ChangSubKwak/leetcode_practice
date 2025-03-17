package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

class LC2206_Divide_Array_Into_Equal_Pairs_Test {

    @Test
    void test() {
        LC2206_Divide_Array_Into_Equal_Pairs test = new LC2206_Divide_Array_Into_Equal_Pairs();

        assertThat(test.divideArray(new int[]{3, 2, 3, 2, 2, 2})).isEqualTo(true);
        assertThat(test.divideArray(new int[]{1, 2, 3, 4})).isEqualTo(false);
    }
}
