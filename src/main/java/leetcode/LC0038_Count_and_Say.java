package leetcode;

public class LC0038_Count_and_Say {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");

        int count = 1;
        int i;
        while (count < n) {
            count++;
            StringBuilder temp = new StringBuilder();
            i = 0;
            while (i < sb.length()) {
                int j = 0;
                while (i + j + 1 < sb.length() && sb.charAt(i + j) == sb.charAt(i + j + 1)) {
                    j++;
                }
                j++;
                temp.append(j);
                temp.append(sb.charAt(i));
                i += j;
            }
            sb = temp;
        }
        return sb.toString();
    }
}
