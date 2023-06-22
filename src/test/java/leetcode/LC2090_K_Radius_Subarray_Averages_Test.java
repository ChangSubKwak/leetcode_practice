package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2090_K_Radius_Subarray_Averages_Test {
    LC2090_K_Radius_Subarray_Averages test = new LC2090_K_Radius_Subarray_Averages();

    @Test
    void exampleTest() {
        assertThat(test.getAverages(new int[]{7, 4, 3, 9, 1, 8, 6, 2, 6}, 3)).isEqualTo(new int[]{-1, -1, -1, 5, 4, 4, -1, -1, -1});
        assertThat(test.getAverages(new int[]{10000}, 0)).isEqualTo(new int[]{10000});
        assertThat(test.getAverages(new int[]{8}, 100000)).isEqualTo(new int[]{-1});
    }
}
