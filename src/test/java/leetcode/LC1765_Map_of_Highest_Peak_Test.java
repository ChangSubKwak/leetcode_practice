package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LC1765_Map_of_Highest_Peak_Test {

    @Test
    void exampleTest() {
        LC1765_Map_of_Highest_Peak test = new LC1765_Map_of_Highest_Peak();

        assertThat(test.highestPeak(new int[][]{
                {0, 1}, {0, 0}
        })).isEqualTo(new int[][]{
                {1, 0}, {2, 1}
        });

        assertThat(test.highestPeak(new int[][]{
                {0, 0, 1}, {1, 0, 0}, {0, 0, 0}
        })).isEqualTo(new int[][]{
                {1, 1, 0}, {0, 1, 1}, {1, 2, 2}
        });
    }
}
