package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2226_Maximum_Candies_Allocated_to_K_Children_Test {
    @Test
    void exampleTest() {
        LC2226_Maximum_Candies_Allocated_to_K_Children test = new LC2226_Maximum_Candies_Allocated_to_K_Children();

        assertThat(test.maximumCandies(new int[]{5, 8, 6}, 3)).isEqualTo(5);
        assertThat(test.maximumCandies(new int[]{2, 5}, 11)).isEqualTo(0);
    }
}
