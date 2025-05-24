package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LC2942_Find_Words_Containing_Character_Test {

    @Test
    void test() {
        LC2942_Find_Words_Containing_Character test = new LC2942_Find_Words_Containing_Character();

        assertThat(test.findWordsContaining(new String[]{"leet", "code"}, 'e')).isEqualTo(List.of(0, 1));
        assertThat(test.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a')).isEqualTo(List.of(0, 2));
        assertThat(test.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z')).isEqualTo(List.of());
    }
}
