package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2097_Valid_Arrangement_of_Pairs_Test {
    @Test
    void exampleTest1() {
        LC2097_Valid_Arrangement_of_Pairs test = new LC2097_Valid_Arrangement_of_Pairs();
        assertThat(test.validArrangement(new int[][]{
            {5, 1}, {4, 5}, {11, 9}, {9, 4}
        })).isEqualTo(new int[][]{
            {11, 9}, {9, 4}, {4, 5}, {5, 1}
        });
    }
}
