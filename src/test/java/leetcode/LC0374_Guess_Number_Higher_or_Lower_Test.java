package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0374_Guess_Number_Higher_or_Lower_Test {

    @Test
    void test() {
        LC0374_Guess_Number_Higher_or_Lower.Solution test;;
        int pick = 6;
        test = new LC0374_Guess_Number_Higher_or_Lower.Solution(pick);
        assertThat(test.guessNumber(10)).isEqualTo(pick);

        pick = 1;
        test = new LC0374_Guess_Number_Higher_or_Lower.Solution(pick);
        assertThat(test.guessNumber(1)).isEqualTo(pick);

        pick = 1;
        test = new LC0374_Guess_Number_Higher_or_Lower.Solution(pick);
        assertThat(test.guessNumber(2)).isEqualTo(pick);
    }
}
