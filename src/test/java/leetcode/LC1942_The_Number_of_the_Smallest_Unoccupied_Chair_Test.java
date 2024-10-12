package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1942_The_Number_of_the_Smallest_Unoccupied_Chair_Test {
    @Test
    void exampleTest() {
        LC1942_The_Number_of_the_Smallest_Unoccupied_Chair test = new LC1942_The_Number_of_the_Smallest_Unoccupied_Chair();

        assertThat(test.smallestChair(new int[][]{{1, 4}, {2, 3}, {4, 6}}, 1)).isEqualTo(1);
        assertThat(test.smallestChair(new int[][]{{3, 10}, {1, 5}, {2, 6}}, 0)).isEqualTo(7);
    }
}
