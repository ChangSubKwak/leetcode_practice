package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class LC0207_Course_Schedule_Test {
    @Test
    void test() {
        LC0207_Course_Schedule test = new LC0207_Course_Schedule();
        assertThat(test.canFinish(2, new int[][]{
            {1, 0}
        })).isEqualTo(true);

        assertThat(test.canFinish(2, new int[][]{
            {1, 0}, {0, 1}
        })).isEqualTo(false);
    }
}
