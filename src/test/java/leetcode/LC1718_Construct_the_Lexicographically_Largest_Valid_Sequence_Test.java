package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1718_Construct_the_Lexicographically_Largest_Valid_Sequence_Test {
    LC1718_Construct_the_Lexicographically_Largest_Valid_Sequence test = new LC1718_Construct_the_Lexicographically_Largest_Valid_Sequence();

    @Test
    void exampleTest() {
        assertThat(test.constructDistancedSequence(3)).isEqualTo(new int[]{3, 1, 2, 3, 2});
        assertThat(test.constructDistancedSequence(5)).isEqualTo(new int[]{5, 3, 1, 4, 3, 5, 2, 4, 2});
    }
}
