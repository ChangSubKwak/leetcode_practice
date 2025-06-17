package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3405_Count_the_Number_of_Arrays_with_K_Matching_Adjacent_Elements_Test {
    @Test
    void test() {
        LC3405_Count_the_Number_of_Arrays_with_K_Matching_Adjacent_Elements test = new LC3405_Count_the_Number_of_Arrays_with_K_Matching_Adjacent_Elements();

        assertThat(test.countGoodArrays(3, 2, 1)).isEqualTo(4);
        assertThat(test.countGoodArrays(4, 2, 2)).isEqualTo(6);
        assertThat(test.countGoodArrays(5, 2, 0)).isEqualTo(2);
    }
}
