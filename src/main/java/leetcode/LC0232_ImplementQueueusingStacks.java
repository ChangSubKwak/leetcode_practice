package leetcode;

import java.util.LinkedList;

public class LC0232_ImplementQueueusingStacks {
	class MyQueue {
	    LinkedList<Integer> data;

	    /** Initialize your data structure here. */
	    public MyQueue() {
	        data = new LinkedList<>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        data.add(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        return data.pollFirst();
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	        return data.peek();
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return data.size() == 0;
	    }
	}
}
