package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC0944_Delete_Columns_to_Make_Sorted {
    public int minDeletionSize(String[] strs) {
        List<String> original = new ArrayList<>();
        List<String> sorted = new ArrayList<>();

        for (int i = 0; i < strs[0].length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < strs.length; j++) {
                sb.append(strs[j].charAt(i));
            }
            original.add(sb.toString());

            char[] chars = sb.toString().toCharArray();
            Arrays.sort(chars);
            sorted.add(new String(chars));
        }

        int count = 0;
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i).equals(sorted.get(i))) {
                continue;
            }
            count++;
        }
        return count;
    }
}
