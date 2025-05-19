package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3024_Type_of_Triangle_Test {
    @Test
    void test() {
        LC3024_Type_of_Triangle test = new LC3024_Type_of_Triangle();

        assertThat(test.triangleType(new int[]{3, 3, 3})).isEqualTo("equilateral");
        assertThat(test.triangleType(new int[]{3, 4, 5})).isEqualTo("scalene");
    }
}
