package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC3005_Count_Elements_With_Maximum_Frequency_Test {

    @Test
    void test() {
        LC3005_Count_Elements_With_Maximum_Frequency test = new LC3005_Count_Elements_With_Maximum_Frequency();

        assertThat(test.maxFrequencyElements(new int[]{1, 2, 2, 3, 1, 4})).isEqualTo(4);
        assertThat(test.maxFrequencyElements(new int[]{1, 2, 3, 4, 5})).isEqualTo(5);
    }
}
