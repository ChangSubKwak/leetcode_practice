package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC1406_Stone_Game_III_Test {
    @Test
    void test() {
        LC1406_Stone_Game_III test = new LC1406_Stone_Game_III();
        assertThat(test.stoneGameIII(new int[]{1, 2, 3, 7})).isEqualTo("Bob");
        assertThat(test.stoneGameIII(new int[]{1, 2, 3, -9})).isEqualTo("Alice");
        assertThat(test.stoneGameIII(new int[]{1, 2, 3, 6})).isEqualTo("Tie");
    }
}
