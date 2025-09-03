package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC3027_Find_the_Number_of_Ways_to_Place_People_II_Test {
    @Test
    void test() {
        LC3027_Find_the_Number_of_Ways_to_Place_People_II test = new LC3027_Find_the_Number_of_Ways_to_Place_People_II();

        assertThat(test.numberOfPairs(new int[][]{{1, 1}, {2, 2}, {3, 3}})).isEqualTo(0);
        assertThat(test.numberOfPairs(new int[][]{{6, 2}, {4, 4}, {2, 6}})).isEqualTo(2);
        assertThat(test.numberOfPairs(new int[][]{{3, 1}, {1, 3}, {1, 1}})).isEqualTo(2);
    }
}
