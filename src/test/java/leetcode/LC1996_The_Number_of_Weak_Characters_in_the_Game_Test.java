package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC1996_The_Number_of_Weak_Characters_in_the_Game_Test {
    LC1996_The_Number_of_Weak_Characters_in_the_Game_X test = new LC1996_The_Number_of_Weak_Characters_in_the_Game_X();

    @Test
    void exampleTest() {
        assertThat(test.numberOfWeakCharacters(new int[][] { {5, 5}, {6, 3}, {3, 6} })).isEqualTo(0);
        assertThat(test.numberOfWeakCharacters(new int[][] { {2, 2}, {3, 3} })).isEqualTo(1);
        assertThat(test.numberOfWeakCharacters(new int[][] { {1, 5}, {10, 4}, {4, 3} })).isEqualTo(1);
    }
}
