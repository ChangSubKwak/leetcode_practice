package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC1072_Flip_Columns_For_Maximum_Number_of_Equal_Rows_Test {
    @Test
    void test() {
        LC1072_Flip_Columns_For_Maximum_Number_of_Equal_Rows test = new LC1072_Flip_Columns_For_Maximum_Number_of_Equal_Rows();

        assertThat(test.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 1}})).isEqualTo(1);
        assertThat(test.maxEqualRowsAfterFlips(new int[][]{{0, 1}, {1, 0}})).isEqualTo(2);
        assertThat(test.maxEqualRowsAfterFlips(new int[][]{{0, 0, 0}, {0, 0, 1}, {1, 1, 0}})).isEqualTo(0);
    }
}
