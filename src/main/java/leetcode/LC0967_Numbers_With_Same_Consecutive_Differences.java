package leetcode;

import java.util.*;

public class LC0967_Numbers_With_Same_Consecutive_Differences {
    private Set<String> set;

    private void recur(int n, int k, StringBuilder sb) {
        if (n == 0) {
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i <= 9; i++) {
            int lastNumber = sb.charAt(sb.length() - 1) - '0';
            if (Math.abs(lastNumber - i) == k) {
                sb.append(i);
                recur(n - 1, k, sb);
                sb.setLength(sb.length() - 1);
            }

        }
    }

    public int[] numsSameConsecDiff(int n, int k) {
        set = new HashSet<>();

        for (int i = 1; i <= 9; i++) {
            recur(n - 1, k, new StringBuilder(i + ""));
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        int[] result = new int[set.size()];
        int i = 0;
        for (String s: list) {
            result[i++] = Integer.valueOf(s);
        }

        System.out.println(list);

        return result;
    }
}
