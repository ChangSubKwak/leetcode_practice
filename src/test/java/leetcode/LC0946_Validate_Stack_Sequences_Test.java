package leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LC0946_Validate_Stack_Sequences_Test {
    @Test
    void test() {
        LC0946_Validate_Stack_Sequences test = new LC0946_Validate_Stack_Sequences();
        assertThat(test.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 2, 1})).isTrue();
        assertThat(test.validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4, 5, 3, 1, 2})).isFalse();
    }
}
