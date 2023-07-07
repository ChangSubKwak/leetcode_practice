package leetcode;

public class LC2024_Maximize_the_Confusion_of_an_Exam {
    private int getMaxLength(boolean mode, int start, int end, int max, int changeCount, String answerKey, int k) {
        int length = answerKey.length() - 1;

        char compareChar1 = mode ? 'T' : 'F';
        char compareChar2 = mode ? 'F' : 'T';

        while (start <= end && end <= length) {
            char c = answerKey.charAt(end);

            if (c == compareChar1) {
                max = Math.max(max, end - start + 1);
                end++;
                continue;
            }

            if (c == compareChar2 && changeCount < k) {
                max = Math.max(max, end - start + 1);
                changeCount++;
                end++;
                continue;
            }

            if (c == compareChar2 && answerKey.charAt(start) == compareChar2) {
                changeCount--;
                start++;
                continue;
            }
            start++;
        }
        return max;
    }

    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max = 0;

        max = getMaxLength(true, 0, 0, max, 0, answerKey, k);
        max = getMaxLength(false, 0, 0, max, 0, answerKey, k);

        return max;
    }
}
