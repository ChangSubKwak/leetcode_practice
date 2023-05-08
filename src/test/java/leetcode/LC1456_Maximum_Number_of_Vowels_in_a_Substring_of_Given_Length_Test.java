package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length_Test {
    @Test
    void test() {
        LC1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length test = new LC1456_Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length();
        Assertions.assertThat(test.maxVowels("abciiidef", 3)).isEqualTo(3);
        Assertions.assertThat(test.maxVowels("aeiou", 2)).isEqualTo(2);
        Assertions.assertThat(test.maxVowels("leetcode", 3)).isEqualTo(2);
    }
}
