package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC1416_Restore_The_Array_Test {
    @Test
    void test() {
        LC1416_Restore_The_Array test = new LC1416_Restore_The_Array();
        assertThat(test.numberOfArrays("1000", 10000)).isEqualTo(1);
        assertThat(test.numberOfArrays("1000", 10)).isEqualTo(0);
        assertThat(test.numberOfArrays("1000", 2000)).isEqualTo(8);
    }
}
