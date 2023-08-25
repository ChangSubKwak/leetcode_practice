package leetcode;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class LC1117_Building_H2O {

    static class H2O {
        private Semaphore hydrogenSemaphore;
        private Semaphore oxygenSemaphore;
        private StringBuilder result;

        public String result() {
            return result.toString();
        }

        public void addResult(String molecule) {
            result.append(molecule);
        }

        public H2O() {
            hydrogenSemaphore = new Semaphore(2, true);
            oxygenSemaphore = new Semaphore(0, true);
            result = new StringBuilder();
        }

        public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
            hydrogenSemaphore.acquire();
            releaseHydrogen.run();
            oxygenSemaphore.release();
        }

        public void oxygen(Runnable releaseOxygen) throws InterruptedException {
            oxygenSemaphore.acquire(2);
            releaseOxygen.run();
            hydrogenSemaphore.release(2);
        }

    }
}
