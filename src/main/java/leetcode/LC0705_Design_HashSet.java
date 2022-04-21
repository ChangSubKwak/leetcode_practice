package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LC0705_Design_HashSet {
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
