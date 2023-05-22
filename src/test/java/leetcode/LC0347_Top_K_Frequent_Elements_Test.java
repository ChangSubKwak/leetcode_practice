package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0347_Top_K_Frequent_Elements_Test {
    @Test
    void minimumTotal() {
        LC0347_Top_K_Frequent_Elements test = new LC0347_Top_K_Frequent_Elements();
        assertThat(test.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)).isEqualTo(new int[]{1, 2});
        assertThat(test.topKFrequent(new int[]{1}, 1)).isEqualTo(new int[]{1});
    }
}
