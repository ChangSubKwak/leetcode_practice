package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0884_Uncommon_Words_from_Two_Sentences_Test {
    @Test
    void test() {
        LC0884_Uncommon_Words_from_Two_Sentences test = new LC0884_Uncommon_Words_from_Two_Sentences();

        assertThat(test.uncommonFromSentences("this apple is sweet", "this apple is sour")).isEqualTo(new String[]{"sweet", "sour"});
        assertThat(test.uncommonFromSentences("apple apple", "banana")).isEqualTo(new String[]{"banana"});
    }
}
