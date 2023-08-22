package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC0168_Excel_Sheet_Column_Title_Test {
    @Test
    void test() {
        LC0168_Excel_Sheet_Column_Title test = new LC0168_Excel_Sheet_Column_Title();
        assertThat(test.convertToTitle(1)).isEqualTo("A");
        assertThat(test.convertToTitle(28)).isEqualTo("AB");
        assertThat(test.convertToTitle(701)).isEqualTo("ZY");
    }
}