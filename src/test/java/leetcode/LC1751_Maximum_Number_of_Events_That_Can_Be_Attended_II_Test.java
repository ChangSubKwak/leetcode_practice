package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1751_Maximum_Number_of_Events_That_Can_Be_Attended_II_Test {

    @Test
    void exampleTest() {
        LC1751_Maximum_Number_of_Events_That_Can_Be_Attended_II test = new LC1751_Maximum_Number_of_Events_That_Can_Be_Attended_II();

        assertThat(test.maxValue(new int[][]{{1, 2, 4}, {3, 4, 3}, {2, 3, 1}}, 2)).isEqualTo(7);
        assertThat(test.maxValue(new int[][]{{1, 2, 4}, {3, 4, 3}, {2, 3, 10}}, 2)).isEqualTo(10);
        assertThat(test.maxValue(new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}}, 3)).isEqualTo(9);
    }
}
