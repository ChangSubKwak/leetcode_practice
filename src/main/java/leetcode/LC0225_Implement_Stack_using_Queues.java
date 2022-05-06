package leetcode;

public class LC0225_Implement_Stack_using_Queues {
    private int[] stack;
    private int topIndex;
    
    class MyStack {
    
	    public MyStack() {
	        stack = new int[100];
	        topIndex = 0;
	    }
	    
	    public void push(int x) {
	        stack[topIndex++] = x;
	    }
	    
	    public int pop() {
	        return stack[--topIndex];
	    }
	    
	    public int top() {
	        return stack[topIndex - 1];
	    }
	    
	    public boolean empty() {
	        return topIndex == 0;
	    }
    }
}
