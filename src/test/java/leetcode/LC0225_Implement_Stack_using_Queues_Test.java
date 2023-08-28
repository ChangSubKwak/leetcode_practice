package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LC0225_Implement_Stack_using_Queues_Test {
    @Test
    void test() {
        LC0225_Implement_Stack_using_Queues.MyStack test = new LC0225_Implement_Stack_using_Queues.MyStack();

        test.push(1);
        test.push(2);

        assertThat(test.top()).isEqualTo(2);
        assertThat(test.pop()).isEqualTo(2);
        assertThat(test.empty()).isEqualTo(false);
    }
}
