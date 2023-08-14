package leetcode;

import static java.lang.System.*;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class LC1116_Print_Zero_Even_Odd {

    static class ZeroEvenOdd {
        private int n;
        private int x;
        private Semaphore s1;
        private Semaphore s2;
        private Semaphore s3;
        
        private StringBuilder result;

        public ZeroEvenOdd(int n) {
            this.n = n;
            x = 1;
            s1 = new Semaphore(1, true);
            s2 = new Semaphore(0, true);
            s3 = new Semaphore(0, true);
            result = new StringBuilder();
        }
        
        public String result() {
            return result.toString();
        }
        
        public void addResult(int output) {
            result.append(output);
        }

        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i < n; i++) {
                s1.acquire();
                printNumber.accept(0);

                if (x % 2 == 0) {
                    s2.release();
                } else {
                    s3.release();
                }
            }
        }

        public void even(IntConsumer printNumber) throws InterruptedException {
            for (int i = 2; i <= n; i++) {
                if (i % 2 == 0) {
                    s2.acquire();
                    printNumber.accept(x);
                    x++;
                    s1.release();
                }
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    s3.acquire();
                    printNumber.accept(x);
                    x++;
                    s1.release();
                }
            }
        }
    }
}
