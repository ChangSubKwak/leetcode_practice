package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class LC0118_Pascals_Triangle_Test {

    @Test
    void test() {
        LC0118_Pascals_Triangle test = new LC0118_Pascals_Triangle();
        assertThat(test.generate(5)).isEqualTo(Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(1, 1),
            Arrays.asList(1, 2, 1),
            Arrays.asList(1, 3, 3, 1),
            Arrays.asList(1, 4, 6, 4, 1)
        ));
    }
}