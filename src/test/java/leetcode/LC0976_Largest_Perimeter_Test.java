package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0976_Largest_Perimeter_Test {
    @Test
    void test() {
        LC0976_Largest_Perimeter test = new LC0976_Largest_Perimeter();
        assertThat(test.largestPerimeter(new int[]{2, 1, 2})).isEqualTo(5);
        assertThat(test.largestPerimeter(new int[]{1, 2, 1})).isEqualTo(0);
    }
}
