package leetcode;

public class LC0744_Find_Smallest_Letter_Greater_Than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1, middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (letters[middle] <= target) {
                left  = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        System.gc();

        return left == letters.length ? letters[0] : letters[left];
    }
}
