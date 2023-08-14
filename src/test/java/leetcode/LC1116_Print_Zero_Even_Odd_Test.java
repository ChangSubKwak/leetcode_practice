package leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LC1116_Print_Zero_Even_Odd_Test {
    
    @Test
    void test() throws InterruptedException {
        LC1116_Print_Zero_Even_Odd.ZeroEvenOdd test = new LC1116_Print_Zero_Even_Odd.ZeroEvenOdd(5);
        
        Thread zero = new Thread(() -> {
            try {
                test.zero(test::addResult);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        
        Thread even = new Thread(() -> {
            try {
                test.even(test::addResult);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        
        Thread odd = new Thread(() -> {
            try {
                test.odd(test::addResult);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        
        zero.start();
        even.start();
        odd.start();
        
        zero.join();
        even.join();
        odd.join();
        
        assertThat(test.result()).isEqualTo("0102030405");
    }
}
