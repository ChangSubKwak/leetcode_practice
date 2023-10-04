package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC2038_Remove_Colored_Pieces_if_Both_Neighbors_are_the_Same_Color_Test {
    @Test
    void exampleTest() {
        LC2038_Remove_Colored_Pieces_if_Both_Neighbors_are_the_Same_Color test = new LC2038_Remove_Colored_Pieces_if_Both_Neighbors_are_the_Same_Color();
        assertThat(test.winnerOfGame("AAABABB")).isTrue();
        assertThat(test.winnerOfGame("AA")).isFalse();
        assertThat(test.winnerOfGame("ABBBBBBBAAA")).isFalse();
    }
}
