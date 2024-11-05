package leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC2914_Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful_Test {

    LC2914_Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful test;

    @BeforeEach
    void setUp() {
        test = new LC2914_Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful();
    }

    @Test
    void test() {
        assertThat(test.minChanges("1001")).isEqualTo(2);
        assertThat(test.minChanges("10")).isEqualTo(1);
        assertThat(test.minChanges("0000")).isEqualTo(0);
    }
}
