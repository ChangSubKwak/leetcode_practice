package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC0006_Zigzag_Conversion {
    public String convert(String s, int numRows) {
        List<String> main = new ArrayList<>();
        List<String> zigzag = new ArrayList<>();

        if (numRows == 1) {
            return s;
        }

        int base = 0;
        while (base < numRows) {
            int moveSize = numRows + (numRows - 2);
            int index = base;
            StringBuilder mainPattern = new StringBuilder();
            while (index < s.length()) {
                mainPattern.append(s.charAt(index));
                index += moveSize;
            }
            main.add(mainPattern.toString());
            base++;
        }

        for (int i = 0; i < numRows - 2; i++) {
            int moveSize = numRows + (numRows - 2);
            int index = numRows + i;

            StringBuilder zigzagPattern = new StringBuilder();
            while (index < s.length()) {
                zigzagPattern.append(s.charAt(index));
                index += moveSize;
            }
            zigzag.add(zigzagPattern.toString());
        }

        Collections.reverse(zigzag);

        StringBuilder result = new StringBuilder();
        result.append(main.get(0));
        for (int i = 1; i < main.size() - 1; i++) {
            StringBuilder part = new StringBuilder();
            int j;
            for (j = 0; j < zigzag.get(i - 1).length(); j++) {
                part.append(main.get(i).charAt(j));
                part.append(zigzag.get(i - 1).charAt(j));
            }
            for (int k = j; k < main.get(i).length(); k++) {
                part.append(main.get(i).charAt(k));
            }

            result.append(part);
        }
        result.append(main.get(main.size() - 1));
        return result.toString();
    }
}
