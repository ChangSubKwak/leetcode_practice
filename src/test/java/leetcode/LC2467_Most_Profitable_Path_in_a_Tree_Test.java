package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC2467_Most_Profitable_Path_in_a_Tree_Test {

    @Test
    void test() {
        LC2467_Most_Profitable_Path_in_a_Tree test = new LC2467_Most_Profitable_Path_in_a_Tree();

        assertThat(test.mostProfitablePath(new int[][]{
            {0, 1}, {1, 2}, {1, 3}, {3, 4}
        }, 3, new int[]{-2, 4, 2, -4, 6})).isEqualTo(6);

        assertThat(test.mostProfitablePath(new int[][]{
                {0, 1}
        }, 1, new int[]{-7280, 2350})).isEqualTo(-7280);
    }
}
