package leetcode;

import java.util.*;

public class LC0049_Group_Anagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
     int length = strs.length;

     Map<String, List<String>> map = new HashMap<>();
     for (String word : strs) {
         char[] wordCharArray = word.toCharArray();
         Arrays.sort(wordCharArray);
         String sorted = new String(wordCharArray);

         List<String> list = null;
         if (!map.containsKey(sorted)) {
             list = new ArrayList<>();
             list.add(word);
             map.put(sorted, list);
             continue;
         }
         list = map.get(sorted);
         list.add(word);
         map.put(sorted, list);
     }

     List<List<String>> result = new ArrayList<>();
     for (List<String> list : map.values()) {
         result.add(list);
     }

     return result;
 }
}
