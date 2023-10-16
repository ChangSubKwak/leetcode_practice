package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC0119_Pascals_Triangle_II_Test {

    @Test
    void test() {
        LC0119_Pascals_Triangle_II test = new LC0119_Pascals_Triangle_II();
        assertThat(test.getRow(3)).isEqualTo(Arrays.asList(1, 3, 3, 1));
        assertThat(test.getRow(0)).isEqualTo(Arrays.asList(1));
        assertThat(test.getRow(1)).isEqualTo(Arrays.asList(1, 1));
    }
}