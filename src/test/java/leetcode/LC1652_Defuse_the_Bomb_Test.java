package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1652_Defuse_the_Bomb_Test {
    LC1652_Defuse_the_Bomb test = new LC1652_Defuse_the_Bomb();

    @Test
    void exampleTest() {
        assertThat(test.decrypt(new int[]{5, 7, 1, 4}, 3)).isEqualTo(new int[]{12, 10, 16, 13});
        assertThat(test.decrypt(new int[]{1, 2, 3, 4}, 0)).isEqualTo(new int[]{0, 0, 0, 0});
        assertThat(test.decrypt(new int[]{2, 4, 9, 3}, -2)).isEqualTo(new int[]{12, 5, 6, 13});
    }
}
