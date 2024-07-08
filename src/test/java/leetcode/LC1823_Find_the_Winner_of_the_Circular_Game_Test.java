package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1823_Find_the_Winner_of_the_Circular_Game_Test {
    @Test
    void exampleTest() {
        LC1823_Find_the_Winner_of_the_Circular_Game test = new LC1823_Find_the_Winner_of_the_Circular_Game();
        assertThat(test.findTheWinner(5, 2)).isEqualTo(3);
        assertThat(test.findTheWinner(6, 5)).isEqualTo(1);
    }
}
