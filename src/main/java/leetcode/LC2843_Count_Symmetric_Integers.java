package leetcode;

public class LC2843_Count_Symmetric_Integers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String num = String.valueOf(i);
            if (num.length() % 2 != 0) {
                continue;
            }

            int first = 0;
            for (int j = 0; j < num.length() / 2; j++) {
                first += num.charAt(j) - '0';
            }

            int second = 0;
            for (int j = num.length() / 2; j < num.length(); j++) {
                second += num.charAt(j) - '0';
            }

            //System.out.println(i + " - " + first + " - " + second);

            if (first == second) {
                count++;
            }
        }

        return count;
    }
}
