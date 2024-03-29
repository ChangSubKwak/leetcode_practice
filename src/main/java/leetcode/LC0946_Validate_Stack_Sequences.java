package leetcode;

import java.util.Stack;

public class LC0946_Validate_Stack_Sequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        for (int pushedValue : pushed) {
            stack.push(pushedValue);
            while(!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }

        return stack.isEmpty();
    }

    public boolean validateStackSequences_V1(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        
        int pushIndex = 0;
        int popIndex = 0;
        while(true) {
            if (pushIndex < pushed.length) {
                do {
                    st.push(pushed[pushIndex]);
                    pushIndex++;
                } while(pushIndex < pushed.length && st.peek() != popped[popIndex]);
            }
            
            boolean isFlag = false;
            while(st.size() > 0 && st.peek() == popped[popIndex]) {
                st.pop();
                popIndex++;
                isFlag = true;
            }
            
            if (pushIndex == pushed.length && popIndex == popped.length) {
                return true;
            }
            
            if (isFlag) {
                continue;
            }
            break;
        }
        
        return false;
    }
}
