package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

public class LC0376_Wiggle_Subsequence_Test {
    LC0376_Wiggle_Subsequence test;

    @BeforeEach
    void setUp() {
        test = new LC0376_Wiggle_Subsequence();
    }

    @Test
    void test() {
        assertThat(test.wiggleMaxLength(new int[] {1, 7, 4, 9, 2, 5})).isEqualTo(6);
        assertThat(test.wiggleMaxLength(new int[] {1, 17, 5, 10, 13, 15, 10, 5, 16, 8})).isEqualTo(7);
        assertThat(test.wiggleMaxLength(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(2);
        assertThat(test.wiggleMaxLength(new int[] {0, 0})).isEqualTo(1);
        assertThat(test.wiggleMaxLength(new int[] {0, 0, 0})).isEqualTo(1);
    }
}
