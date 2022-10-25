package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1662_Check_If_Two_String_Arrays_are_Equivalent_Test {

    @Test
    void test() {
        LC1662_Check_If_Two_String_Arrays_are_Equivalent test = new LC1662_Check_If_Two_String_Arrays_are_Equivalent();
        assertThat(test.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"})).isTrue();
    }
}