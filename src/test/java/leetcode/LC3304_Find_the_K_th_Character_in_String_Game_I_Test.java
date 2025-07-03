package leetcode;

import  org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3304_Find_the_K_th_Character_in_String_Game_I_Test {
    @Test
    void test() {
        LC3304_Find_the_K_th_Character_in_String_Game_I test = new LC3304_Find_the_K_th_Character_in_String_Game_I();

        assertThat(test.kthCharacter(5)).isEqualTo('b');
        assertThat(test.kthCharacter(10)).isEqualTo('c');

    }
}
