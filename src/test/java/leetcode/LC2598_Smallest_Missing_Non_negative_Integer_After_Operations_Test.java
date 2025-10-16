package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2598_Smallest_Missing_Non_negative_Integer_After_Operations_Test {
    @Test
    void test() {
        LC2598_Smallest_Missing_Non_negative_Integer_After_Operations test = new LC2598_Smallest_Missing_Non_negative_Integer_After_Operations();

        assertThat(test.findSmallestInteger(new int[]{1, -10, 7, 13, 6, 8}, 5)).isEqualTo(4);
        assertThat(test.findSmallestInteger(new int[]{1, -10, 7, 13, 6, 8}, 7)).isEqualTo(2);

    }
}



