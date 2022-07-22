package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC0820_Short_Encoding_of_Words {
    public int minimumLengthEncoding(String[] words) {
        int length = words.length;
        if (length == 1) {
            return words[0].length() + 1;
        }
        
        List<String> list = new ArrayList<>();
        for (String s: words) {
            list.add(s);
        }
        boolean isContinue = true;

        start:
        while(isContinue) {
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.size(); j++) {
                    if (i == j) {
                        continue;
                    }
                    if (list.get(j).endsWith(list.get(i))) {
                        list.remove(i);
                        continue start;
                    }
                }
            }
            isContinue = false;
        }
        
        int sum = list.size();
        for (String s: list) {
            sum += s.length();
        }
        
        return sum;
    }
}
