package leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1462_Course_Schedule_IV_Test {
    @Test
    void test() {
        LC1462_Course_Schedule_IV test = new LC1462_Course_Schedule_IV();

        assertThat(test.checkIfPrerequisite(2, new int[][]{{1, 0}}, new int[][]{{0, 1}, {1, 0}})).isEqualTo(Arrays.asList(false, true));
        assertThat(test.checkIfPrerequisite(2, new int[][]{}, new int[][]{{1, 0}, {0, 1}})).isEqualTo(Arrays.asList(false, false));
        assertThat(test.checkIfPrerequisite(3, new int[][]{{1, 2}, {1, 0}, {2, 0}}, new int[][]{{1, 0}, {1, 2}})).isEqualTo(Arrays.asList(true, true));
    }
}
