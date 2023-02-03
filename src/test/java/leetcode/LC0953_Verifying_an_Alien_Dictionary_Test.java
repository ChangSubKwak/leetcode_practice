package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0953_Verifying_an_Alien_Dictionary_Test {

    @Test
    void test() {
        LC0953_Verifying_an_Alien_Dictionary test = new LC0953_Verifying_an_Alien_Dictionary();
        assertThat(test.isAlienSorted(new String[]{"hello", "leetcode"},"hlabcdefgijkmnopqrstuvwxyz")).isTrue();
        assertThat(test.isAlienSorted(new String[]{"word", "world", "row"},"worldabcefghijkmnpqstuvxyz")).isFalse();
        assertThat(test.isAlienSorted(new String[]{"apple", "app"},"abcdefghijklmnopqrstuvwxyz")).isFalse();
    }
}
