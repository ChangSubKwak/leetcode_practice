package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1980_Find_Unique_Binary_String_Test {
    @Test
    void test() {
        LC1980_Find_Unique_Binary_String test = new LC1980_Find_Unique_Binary_String();
        assertThat(test.findDifferentBinaryString(new String[]{"01", "10"})).containsAnyOf("00", "11");
        assertThat(test.findDifferentBinaryString(new String[]{"00", "01"})).containsAnyOf("10", "11");
        assertThat(test.findDifferentBinaryString(new String[]{"111", "011", "001"})).containsAnyOf("101", "000", "010", "100", "110");
    }
}
