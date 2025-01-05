package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2381_Shifting_Letters_II_Test {
    LC2381_Shifting_Letters_II test = new LC2381_Shifting_Letters_II();

    @Test
    void exampleTest() {
        assertThat(test.shiftingLetters("abc", new int[][]{{0, 1, 0}, {1, 2, 1}, {0, 2, 1}})).isEqualTo("ace");
        assertThat(test.shiftingLetters("dztz", new int[][]{{0, 0, 0}, {1, 1, 1}})).isEqualTo("catz");
    }
}
