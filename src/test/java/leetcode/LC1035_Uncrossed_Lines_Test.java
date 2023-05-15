package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1035_Uncrossed_Lines_Test {
    @Test
    void test() {
        LC1035_Uncrossed_Lines test = new LC1035_Uncrossed_Lines();
        assertThat(test.maxUncrossedLines(new int[]{1, 4, 2}, new int[]{1, 2, 4})).isEqualTo(2);
        assertThat(test.maxUncrossedLines(new int[]{2, 5, 1, 2, 5}, new int[]{10, 5, 2, 1, 5, 2})).isEqualTo(3);
        assertThat(test.maxUncrossedLines(new int[]{1, 3, 7, 1, 7, 5}, new int[]{1, 9, 2, 5, 1})).isEqualTo(2);
    }

}
