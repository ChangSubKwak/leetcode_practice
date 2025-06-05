package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3403_Find_the_Lexicographically_Largest_String_From_the_Box_I_Test {
    @Test
    void test() {
        LC3403_Find_the_Lexicographically_Largest_String_From_the_Box_I test = new LC3403_Find_the_Lexicographically_Largest_String_From_the_Box_I();

        assertThat(test.answerString("dbca", 2)).isEqualTo("dbc");
        assertThat(test.answerString("gggg", 4)).isEqualTo("g");
    }
}
