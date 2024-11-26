package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC2924_Find_Champion_II_Test {

    @Test
    void test() {
        LC2924_Find_Champion_II test = new LC2924_Find_Champion_II();

        assertThat(test.findChampion(3, new int[][]{
            {0, 1}, {1, 2}
        })).isEqualTo(0);

        assertThat(test.findChampion(4, new int[][]{
                {0, 2}, {1, 3}, {1, 2}
        })).isEqualTo(-1);
    }
}
