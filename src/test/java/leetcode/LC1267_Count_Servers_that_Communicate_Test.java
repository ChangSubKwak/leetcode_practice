package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1267_Count_Servers_that_Communicate_Test {
    
    @Test
    void test() {
        LC1267_Count_Servers_that_Communicate test = new LC1267_Count_Servers_that_Communicate();

        assertThat(test.countServers(new int[][]{
                {1, 0},
                {0, 1}
        })).isEqualTo(0);

        assertThat(test.countServers(new int[][]{
                {1, 0},
                {1, 1}
        })).isEqualTo(3);

        assertThat(test.countServers(new int[][]{
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        })).isEqualTo(4);
    }
}
