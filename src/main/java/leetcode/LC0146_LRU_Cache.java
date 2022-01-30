package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LC0146_LRU_Cache {
    private Map<Integer, Integer> map;
    private int capacity;
    private int recentKey;

    public LC0146_LRU_Cache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }
    
    public int get(int key) {
        recentKey = key;
        if (map.containsKey(key)) {
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if (map.size() >= capacity) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                // System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                if (recentKey != entry.getKey()) {
                    map.remove(entry.getKey());
                    break;
                }
            }
        }
        // System.out.println(map);
        map.put(key, value);
    }
}
