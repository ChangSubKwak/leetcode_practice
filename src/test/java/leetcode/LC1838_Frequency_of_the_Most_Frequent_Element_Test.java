package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1838_Frequency_of_the_Most_Frequent_Element_Test {
    @Test
    void exampleTest() {
        LC1838_Frequency_of_the_Most_Frequent_Element test = new LC1838_Frequency_of_the_Most_Frequent_Element();
        assertThat(test.maxFrequency(new int[]{1, 2, 4}, 5)).isEqualTo(3);
        assertThat(test.maxFrequency(new int[]{1, 4, 8, 13}, 5)).isEqualTo(2);
    }
}
