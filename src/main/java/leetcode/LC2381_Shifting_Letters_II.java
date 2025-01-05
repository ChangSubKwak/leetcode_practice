package leetcode;

public class LC2381_Shifting_Letters_II {
    public String shiftingLetters(String s, int[][] shifts) {
        int length = s.length();
        int[] change = new int[length];

        for (int i = 0; i < shifts.length; i++) {
            if (shifts[i][2] == 1) {
                change[shifts[i][0]]++;
                if (shifts[i][1] + 1 < length) {
                    change[shifts[i][1] + 1]--;
                }
            } else {
                change[shifts[i][0]]--;
                if (shifts[i][1] + 1 < length) {
                    change[shifts[i][1] + 1]++;
                }
            }
        }

        StringBuilder result = new StringBuilder(s);
        int numberOfShifts = 0;

        for (int i = 0; i < length; i++) {
            numberOfShifts = (numberOfShifts + change[i]) % 26;

            if (numberOfShifts < 0) {
                numberOfShifts += 26;
            }

            char shiftedChar = (char)('a' + ((s.charAt(i) - 'a' + numberOfShifts) % 26));
            result.setCharAt(i, shiftedChar);
        }

        return result.toString();
    }
}
