package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LC2493_Divide_Nodes_Into_the_Maximum_Number_of_Groups_Test {
    @Test
    void test() {
        LC2493_Divide_Nodes_Into_the_Maximum_Number_of_Groups test = new LC2493_Divide_Nodes_Into_the_Maximum_Number_of_Groups();

        assertThat(test.magnificentSets(6, new int[][]{{1, 2}, {1, 4}, {1, 5}, {2, 6}, {2, 3}, {4, 6}})).isEqualTo(4);
        assertThat(test.magnificentSets(6, new int[][]{{1, 2}, {2, 3}, {3, 1}})).isEqualTo(-1);
    }
}
