package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class LC1381_Design_a_Stack_With_Increment_Operation_Test {

    @Test
    void test() {
        LC1381_Design_a_Stack_With_Increment_Operation.CustomStack test = new LC1381_Design_a_Stack_With_Increment_Operation.CustomStack(3);

        test.push(1);
        test.push(2);

        assertThat(test.pop()).isEqualTo(2);

        test.push(2);
        test.push(3);
        test.push(4);
        test.increment(5, 100);
        test.increment(2, 100);

        assertThat(test.pop()).isEqualTo(103);
        assertThat(test.pop()).isEqualTo(202);
        assertThat(test.pop()).isEqualTo(201);
        assertThat(test.pop()).isEqualTo(-1);
    }
}
