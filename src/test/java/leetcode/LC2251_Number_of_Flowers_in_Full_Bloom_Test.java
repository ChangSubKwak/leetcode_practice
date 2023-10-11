package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC2251_Number_of_Flowers_in_Full_Bloom_Test {
    @Test
    void exampleTest() {
        LC2251_Number_of_Flowers_in_Full_Bloom test = new LC2251_Number_of_Flowers_in_Full_Bloom();
        assertThat(test.fullBloomFlowers(
            new int[][]{{1, 6}, {3, 7}, {9, 12}, {4, 13}},
            new int[]{2, 3, 7, 11})
        ).isEqualTo(new int[]{1, 2, 2, 2});
        
        assertThat(test.fullBloomFlowers(
            new int[][]{{1, 10}, {3, 3}},
            new int[]{3, 3, 2})
        ).isEqualTo(new int[]{2, 2, 1});
    }
}
