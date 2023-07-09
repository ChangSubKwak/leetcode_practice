package leetcode.biweekly.contest108;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem3 {

    private ArrayList<String> beautifulString;

    private void combination(char[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    // System.out.print(arr[i]);
                    sb.append(arr[i]);
                }
            }
            beautifulString.add(sb.toString());
            // System.out.println();
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    public int minimumBeautifulSubstrings(String s) {
        int min = 16;

        int n = s.length();
        for (int i = 1; i <= n; i++) {
            beautifulString = new ArrayList<>();
            combination(s.toCharArray(), new boolean[n], 0, n, i);
            System.out.println(beautifulString);
            System.out.println("-------------------------------");
        }
        return min == 16 ? -1 : min;
    }
}
