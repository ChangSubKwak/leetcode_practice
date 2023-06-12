package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0228_Summary_Ranges_Test {
    @Test
    void test() {
        LC0228_Summary_Ranges test = new LC0228_Summary_Ranges();

        assertThat(test.summaryRanges(new int[]{0, 1, 2, 4, 5, 7})).isEqualTo(
            Arrays.asList("0->2", "4->5", "7")
        );

        assertThat(test.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9})).isEqualTo(
            Arrays.asList("0", "2->4", "6", "8->9")
        );

        assertThat(test.summaryRanges(new int[]{})).isEqualTo(
            Arrays.asList()
        );
    }
}
