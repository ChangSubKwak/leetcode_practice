package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LC0146_LRU_Cache {
    private LinkedHashMap<Integer, Integer> map;
    @SuppressWarnings("serial")
	public LC0146_LRU_Cache(int capacity) {
        map = new LinkedHashMap<Integer, Integer> (capacity, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };        
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }
}
