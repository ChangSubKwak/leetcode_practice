package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LC1356_Sort_Integers_by_The_Number_of_1_Bits_Test {

    @Test
    void test() {
        LC1356_Sort_Integers_by_The_Number_of_1_Bits test = new LC1356_Sort_Integers_by_The_Number_of_1_Bits();

        assertThat(test.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}))
            .isEqualTo(new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7});
        assertThat(test.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}))
            .isEqualTo(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024});
    }
}
