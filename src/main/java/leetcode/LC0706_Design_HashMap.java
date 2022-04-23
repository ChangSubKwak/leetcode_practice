package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0706_Design_HashMap {
	class MyHashMap {
	    public Map<Integer, Integer> map;
	
	    public MyHashMap() {
	        map = new HashMap<>();
	    }
	    
	    public void put(int key, int value) {
	        map.put(key, value);
	    }
	    
	    public int get(int key) {
	        if (map.containsKey(key)) {
	            return map.get(key);
	        }
	        return -1;
	    }
	    
	    public void remove(int key) {
	        map.remove(key);
	    }
	}
}
