package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC1286_IteratorforCombination {
	class CombinationIterator {
	    private List<String> list;
	    private int head;
	    private int length;
	    private int combinationLength;
	    
	    private void recursive(String characters, int depth, int start, StringBuilder current) {
	        if (depth == combinationLength) {
	            list.add(current.toString());
	        }
	        
	        for (int i = start; i < length; i++) {
	            current.append(characters.charAt(i));
	            recursive(characters, depth + 1, i + 1, current);
	            current.deleteCharAt(current.length() - 1);
	        }
	    }

	    public CombinationIterator(String characters, int combinationLength) {
	        list = new ArrayList<>();
	        head = 0;
	        length = characters.length();
	        this.combinationLength = combinationLength;
	        recursive(characters, 0, 0, new StringBuilder());
	    }
	    
	    public String next() {
	        String response = list.get(head);
	        head++;
	        return response;
	    }
	    
	    public boolean hasNext() {
	        return head < list.size();
	    }
	}
}
