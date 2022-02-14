package leetcode;

import java.util.Collections;
import java.util.LinkedList;

public class LC0155_Min_Stack {
    private LinkedList<Integer> list;

    public LC0155_Min_Stack() {
        list = new LinkedList<>();
    }
    
    public void push(int val) {
        list.addLast(val);
    }
    
    public void pop() {
        list.pollLast();

    }
    
    public int top() {
        return list.peekLast();
    }
    
    public int getMin() {
        return Collections.min(list);
    }
}
