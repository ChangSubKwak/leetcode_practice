package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1921_Eliminate_Maximum_Number_of_Monsters_Test {
    @Test
    void exampleTest() {
        LC1921_Eliminate_Maximum_Number_of_Monsters test = new LC1921_Eliminate_Maximum_Number_of_Monsters();
        assertThat(test.eliminateMaximum(new int[]{1, 3, 4}, new int[]{1, 1, 1})).isEqualTo(3);
        assertThat(test.eliminateMaximum(new int[]{1, 1, 2, 3}, new int[]{1, 1, 1, 1})).isEqualTo(1);
        assertThat(test.eliminateMaximum(new int[]{3, 2, 4}, new int[]{5, 3, 2})).isEqualTo(1);
    }
}
