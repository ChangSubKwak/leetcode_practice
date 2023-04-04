package leetcode;

public class LC2405_Optimal_Partition_of_String {
    public int partitionString(String s) {
        int i = 0;
        int answer = 1;
        int bitmask = 0;

         int prev = 0;

        while (i < s.length()) {
            int code = s.charAt(i) - 'a';
            if ((bitmask & (1 << code)) != 0) {
                bitmask = 0;
                answer++;
                 System.out.println(s.substring(prev, i));
                 prev = i;
            }

            bitmask = bitmask | (1 << code);
            i++;
        }

         System.out.println(s.substring(prev, i));

        return answer;
    }
}
