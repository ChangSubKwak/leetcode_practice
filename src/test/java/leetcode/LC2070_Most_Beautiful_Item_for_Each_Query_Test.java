package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2070_Most_Beautiful_Item_for_Each_Query_Test {
    LC2070_Most_Beautiful_Item_for_Each_Query test = new LC2070_Most_Beautiful_Item_for_Each_Query();

    @Test
    void exampleTest() {
        assertThat(test.maximumBeauty(
            new int[][]{{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}},
            new int[]{1, 2, 3, 4, 5, 6})
        ).isEqualTo(new int[]{2, 4, 5, 5, 6, 6});

        assertThat(test.maximumBeauty(
            new int[][]{{1, 2}, {1, 2}, {1, 3}, {1, 4}},
            new int[]{1})
        ).isEqualTo(new int[]{4});

        assertThat(test.maximumBeauty(
            new int[][]{{10, 1000}},
            new int[]{5})
        ).isEqualTo(new int[]{0});
    }
}
