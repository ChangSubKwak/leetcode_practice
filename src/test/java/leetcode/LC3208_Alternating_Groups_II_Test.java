package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LC3208_Alternating_Groups_II_Test {
    @Test
    void test() {
        LC3208_Alternating_Groups_II test = new LC3208_Alternating_Groups_II();

        assertThat(test.numberOfAlternatingGroups(new int[]{0, 1, 0, 1, 0}, 3)).isEqualTo(3);
        assertThat(test.numberOfAlternatingGroups(new int[]{0, 1, 0, 0, 1, 0, 1}, 6)).isEqualTo(2);
        assertThat(test.numberOfAlternatingGroups(new int[]{1, 1, 0, 1}, 4)).isEqualTo(0);
    }
}
