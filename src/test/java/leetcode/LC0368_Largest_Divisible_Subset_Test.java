package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class LC0368_Largest_Divisible_Subset_Test {
    @Test
    void exampleTest() {
        LC0368_Largest_Divisible_Subset test = new LC0368_Largest_Divisible_Subset();

        assertThat(test.largestDivisibleSubset(new int[]{1, 2, 3})).isEqualTo(Arrays.asList(1, 2));
        assertThat(test.largestDivisibleSubset(new int[]{1, 2, 4, 8})).isEqualTo(Arrays.asList(1, 2, 4, 8));
    }

}
