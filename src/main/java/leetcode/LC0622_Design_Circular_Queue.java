package leetcode;

public class LC0622_Design_Circular_Queue {
    static class MyCircularQueue {
        private int[] queue;
        private int head;
        private int tail;
        private int size;

        public MyCircularQueue(int k) {
            queue = new int[k];
            head = -1;
            tail = 0;
            size = 0;
        }

        public boolean enQueue(int value) {
            if (size == queue.length) {
                return false;
            }
            head++;
            head %= queue.length;
            queue[head] = value;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (size == 0) {
                return false;
            }
            tail++;
            tail %= queue.length;
            size--;
            return true;
        }

        public int Front() {
            if (size == 0) {
                return -1;
            }
            return queue[tail];
        }

        public int Rear() {
            if (size == 0) {
                return -1;
            }
            return queue[head];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == queue.length;
        }
    }
}
