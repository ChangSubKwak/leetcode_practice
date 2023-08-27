package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LC0403_Frog_Jump_Test {
    @Test
    void minimumTotal() {
        LC0403_Frog_Jump test = new LC0403_Frog_Jump();

        assertThat(test.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17})).isEqualTo(true);
        assertThat(test.canCross(new int[]{0, 1, 2, 3, 4, 8, 9, 11})).isEqualTo(false);
    }
}
