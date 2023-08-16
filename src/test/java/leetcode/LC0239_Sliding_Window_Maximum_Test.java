package leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class LC0239_Sliding_Window_Maximum_Test {
    @Test
    void test() {
        LC0239_Sliding_Window_Maximum test = new LC0239_Sliding_Window_Maximum();

        assertThat(test.maxSlidingWindow(new int[]{0, 1, 2, 4, 5, 7}, 3)).isEqualTo(new int[]{3, 3, 5, 5, 6, 7});
        assertThat(test.maxSlidingWindow(new int[]{1}, 1)).isEqualTo(new int[]{1});
    }
}
