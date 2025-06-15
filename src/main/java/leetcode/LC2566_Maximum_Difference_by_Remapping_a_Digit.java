package leetcode;

public class LC2566_Maximum_Difference_by_Remapping_a_Digit {
    public int minMaxDifference(int num) {
        StringBuilder numString = new StringBuilder(String.valueOf(num));

        char first = numString.charAt(0);
        if (first == '9') {
            int i = 0;
            while (i < numString.length() && first == '9') {
                first = numString.charAt(i);
                i++;
            }
        }

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == first) {
                numString.setCharAt(i, '9');
            }
        }

        StringBuilder max = new StringBuilder(numString);
        numString = new StringBuilder(String.valueOf(num));
        first = numString.charAt(0);

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == first) {
                numString.setCharAt(i, '0');
            }
        }

        StringBuilder min = new StringBuilder(numString);

        return Integer.valueOf(max.toString()) - Integer.valueOf(min.toString());
    }
}
