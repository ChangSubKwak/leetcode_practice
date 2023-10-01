package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0557_Reverse_Words_in_a_String_Test {
    @Test
    void test() {
        LC0557_Reverse_Words_in_a_String test = new LC0557_Reverse_Words_in_a_String();
    
        assertThat(test.reverseWords("Let's take LeetCode contest")).isEqualTo("s'teL ekat edoCteeL tsetnoc");
        assertThat(test.reverseWords("God Ding")).isEqualTo("doG gniD");
    }
}
