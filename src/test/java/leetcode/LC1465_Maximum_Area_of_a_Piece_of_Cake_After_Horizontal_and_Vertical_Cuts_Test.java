package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class LC1465_Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts_Test {
    LC1465_Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts test;

    @BeforeEach
    void setUp() {
        test = new LC1465_Maximum_Area_of_a_Piece_of_Cake_After_Horizontal_and_Vertical_Cuts();
    }

    @Test
    void test() {
        Assertions.assertThat(test.maxArea(5, 4, new int[] {1, 2, 4}, new int[] {1, 3})).isEqualTo(4);
        Assertions.assertThat(test.maxArea(5, 4, new int[] {3, 1}, new int[] {1})).isEqualTo(4);
        Assertions.assertThat(test.maxArea(5, 4, new int[] {3}, new int[] {3})).isEqualTo(9);
    }
}
