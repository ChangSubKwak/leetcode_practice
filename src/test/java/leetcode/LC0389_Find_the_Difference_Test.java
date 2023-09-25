package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0389_Find_the_Difference_Test {
    @Test
    void test() {
        LC0389_Find_the_Difference test = new LC0389_Find_the_Difference();
        assertThat(test.findTheDifference("abcd", "abcde")).isEqualTo('e');
        assertThat(test.findTheDifference("", "abcde")).isEqualTo('e');
    }
}
