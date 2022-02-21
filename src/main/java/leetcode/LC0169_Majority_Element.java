package leetcode;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.K;

public class LC0169_Majority_Element {
    static <K,V extends Comparable<? super V>> SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
        SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
            new Comparator<Map.Entry<K,V>>() {
                @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
                    int res = e2.getValue().compareTo(e1.getValue());
                    return res != 0 ? res : 1;
                }
            }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
    
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        return entriesSortedByValues(map)
            .iterator()
            .next()
            .getKey();
    }
}
