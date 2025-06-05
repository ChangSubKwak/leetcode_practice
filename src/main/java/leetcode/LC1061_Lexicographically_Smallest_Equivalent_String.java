package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LC1061_Lexicographically_Smallest_Equivalent_String {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<TreeSet<Character>> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            list.add(new TreeSet<>());
            list.get(i).add((char)('a' + i));
        }

        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);

            int index1 = s1.charAt(i) - 'a';
            int index2 = s2.charAt(i) - 'a';

            list.get(index1).add(char1);
            list.get(index1).add(char2);
            list.get(index2).add(char1);
            list.get(index2).add(char2);
        }

        for (int i = 0; i < 26; i++) {
            Set<Character> current = new TreeSet<>(list.get(i));
            Set<Character> next    = new TreeSet<>(list.get(i));

            for (Character item : current) {
                next.addAll(list.get(item - 'a'));
            }

            current = new TreeSet<>(next);
            for (Character item : current) {
                list.get(item - 'a').addAll(next);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < baseStr.length(); i++) {
            char character = baseStr.charAt(i);
            int index = character - 'a';

            sb.append(list.get(index).first());
        }

        return sb.toString();
    }
}
