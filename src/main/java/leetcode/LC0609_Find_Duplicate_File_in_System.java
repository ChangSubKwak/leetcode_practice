package leetcode;

import java.util.*;

public class LC0609_Find_Duplicate_File_in_System {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s: paths) {
            String[] temp = s.split(" ");
            String path = temp[0];
            for (int i = 1; i < temp.length; i++) {
                int left  = temp[i].indexOf('(');
                int right = temp[i].indexOf(')');
                String content = temp[i].substring(left, right);

                List<String> tempList = new ArrayList<>();
                if (!map.containsKey(content)) {
                    tempList.add(path + "/" + temp[i].substring(0, left));
                    map.put(content, tempList);
                    continue;
                }
                tempList = map.get(content);
                tempList.add(path + "/" + temp[i].substring(0, left));
                map.put(content, tempList);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key).size() <= 1) {
                continue;
            }
            result.add(map.get(key));
        }

        return result;
    }
}
