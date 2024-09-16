package leetcode;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LC1371_Find_the_Longest_Substring_Containing_Vowels_in_Even_Counts_Test {

    @Test
    void test1() {
        LC1371_Find_the_Longest_Substring_Containing_Vowels_in_Even_Counts test = new LC1371_Find_the_Longest_Substring_Containing_Vowels_in_Even_Counts();

        assertThat(test.findTheLongestSubstring("eleetminicoworoep")).isEqualTo(13);
        assertThat(test.findTheLongestSubstring("leetcodeisgreat")).isEqualTo(5);
        assertThat(test.findTheLongestSubstring("bcbcbc")).isEqualTo(6);
    }
}
