package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2109_Adding_Spaces_to_a_String_Test {
    @Test
    void exampleTest() {
        LC2109_Adding_Spaces_to_a_String test = new LC2109_Adding_Spaces_to_a_String();
        
        assertThat(test.addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15})).isEqualTo("Leetcode Helps Me Learn");
        assertThat(test.addSpaces("icodeinpython", new int[]{1, 5, 7, 9})).isEqualTo("i code in py thon");
        assertThat(test.addSpaces("spacing", new int[]{0, 1, 2, 3, 4, 5, 6})).isEqualTo(" s p a c i n g");
    }
}
