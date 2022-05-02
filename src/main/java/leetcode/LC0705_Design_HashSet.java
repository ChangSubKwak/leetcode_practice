package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LC0705_Design_HashSet {
	class MyHashSet {
	    Set<Integer> set;

	    public MyHashSet() {
	        set = new HashSet();
	    }
	    
	    public void add(int key) {
	        set.add(key);
	    }
	    
	    public void remove(int key) {
	        set.remove(key);
	    }
	    
	    public boolean contains(int key) {
	        return set.contains(key);
	    }
	}
}
