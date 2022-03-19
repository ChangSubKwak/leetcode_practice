package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LC0895_Maximum_Frequency_Stack_X {
	class FreqStack {
	    Map<Integer, LinkedList<Integer>> st;
	    Map<Integer, Integer> countMap = new HashMap<>();
	    int maxFreq;
	    
	    public FreqStack() {
	        st = new HashMap<>();
	        countMap = new HashMap<>();
	        maxFreq = 0;
	    }
	    
	    public void push(int val) {
	        int currFreq = countMap.getOrDefault(val, 0);
	        
	        currFreq++;
	        countMap.put(val, currFreq);
	        
	        if (st.containsKey(currFreq) == false) {
	            st.put(currFreq, new LinkedList<Integer>());
	        }
	        st.get(currFreq).addFirst(val);
	        maxFreq = Math.max(maxFreq, currFreq);
	    }
	    
	    public int pop() {
	        int ans = st.get(maxFreq).removeFirst();
	        int currFreq = countMap.get(ans);
	        
	        currFreq--;
	        countMap.put(ans, currFreq);
	        
	        if (st.get(maxFreq).size() == 0) {
	            maxFreq--;
	        }
	        return ans;
	    }
	}
}
