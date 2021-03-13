package leetcode;

import java.util.concurrent.Semaphore;

public class LC1114_PrintInOrder {
    Semaphore run2, run3;

    public LC1114_PrintInOrder() {
        run2 = new Semaphore(0);
        run3 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        run2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        run2.acquire();
        printSecond.run();
        run3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        run3.acquire(); 
        printThird.run();
    }
    
    public static void main(String[] args) {
    	LC1114_PrintInOrder lc = new LC1114_PrintInOrder();

    	try {
//    		while(false) {
	        	lc.first(() -> { System.out.print("1"); });
	        	lc.third(() -> { System.out.print("3"); });
	        	lc.second(() -> { System.out.print("2"); });
	        	System.out.println();
//    		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
}