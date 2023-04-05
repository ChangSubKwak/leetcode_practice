package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class LC2439_Minimize_Maximum_of_Array_Test {

    @Test
    void test() {
        LC2439_Minimize_Maximum_of_Array test = new LC2439_Minimize_Maximum_of_Array();
        Assertions.assertThat(test.minimizeArrayValue(new int[]{3, 7, 1, 6})).isEqualTo(5);
        Assertions.assertThat(test.minimizeArrayValue(new int[]{10, 1})).isEqualTo(10);
    }
}
