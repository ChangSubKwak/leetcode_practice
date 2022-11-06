package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class LC0899_Orderly_Queue_Test {
    @Test
    void test() {
        LC0899_Orderly_Queue test = new LC0899_Orderly_Queue();
        assertThat(test.orderlyQueue("cba", 1)).isEqualTo("acb");
        assertThat(test.orderlyQueue("baaca", 3)).isEqualTo("aaabc");
    }
}
