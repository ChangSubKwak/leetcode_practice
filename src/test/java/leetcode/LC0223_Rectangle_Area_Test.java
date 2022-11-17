package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0223_Rectangle_Area_Test {
    @Test
    void minimumTotal() {
        LC0223_Rectangle_Area test = new LC0223_Rectangle_Area();
        assertThat(test.computeArea(-3, 0, 3, 4, 0, -1, 9, 2)).isEqualTo(45);
        assertThat(test.computeArea(-2, -2, 2, 2, -2, -2, 2, 2)).isEqualTo(16);
    }
}
