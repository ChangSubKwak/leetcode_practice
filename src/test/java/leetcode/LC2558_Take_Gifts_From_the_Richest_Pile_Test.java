package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2558_Take_Gifts_From_the_Richest_Pile_Test {
    @Test
    void test() {
        LC2558_Take_Gifts_From_the_Richest_Pile test = new LC2558_Take_Gifts_From_the_Richest_Pile();

        assertThat(test.pickGifts(new int[]{25, 64, 9, 4, 100}, 4)).isEqualTo(29);
        assertThat(test.pickGifts(new int[]{1, 1, 1, 1}, 4)).isEqualTo(4);
    }
}
