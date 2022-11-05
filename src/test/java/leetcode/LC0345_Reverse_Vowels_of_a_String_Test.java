package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0345_Reverse_Vowels_of_a_String_Test {
    @Test
    void minimumTotal() {
        LC0345_Reverse_Vowels_of_a_String test = new LC0345_Reverse_Vowels_of_a_String();
        assertThat(test.reverseVowels( "hello")).isEqualTo("holle");
        assertThat(test.reverseVowels( "leetcode")).isEqualTo("leotcede");
    }
}
