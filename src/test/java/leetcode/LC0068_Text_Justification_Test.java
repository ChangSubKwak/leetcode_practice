package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LC0068_Text_Justification_Test {
    @Test
    void test() {
        LC0068_Text_Justification test = new LC0068_Text_Justification();
        assertThat(test.fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification"}, 16)).isEqualTo(
            Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "
            )
        );

        assertThat(test.fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16)).isEqualTo(
            Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
            )
        );

        assertThat(test.fullJustify(new String[]{"Science", "is", "what", "we", "understand",
            "well", "enough", "to", "explain", "to", "a",
            "computer.", "Art", "is", "everything", "else", "we", "do"}, 20)).isEqualTo(
            Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
            )
        );
    }
}
