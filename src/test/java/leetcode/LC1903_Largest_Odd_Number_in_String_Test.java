package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1903_Largest_Odd_Number_in_String_Test {
    @Test
    void exampleTest() {
        LC1903_Largest_Odd_Number_in_String test = new LC1903_Largest_Odd_Number_in_String();
        assertThat(test.largestOddNumber("52")).isEqualTo("5");
        assertThat(test.largestOddNumber("4206")).isEqualTo("");
        assertThat(test.largestOddNumber("35427")).isEqualTo("35427");
    }
}
