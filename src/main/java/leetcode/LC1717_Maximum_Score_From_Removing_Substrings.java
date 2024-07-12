package leetcode;

public class LC1717_Maximum_Score_From_Removing_Substrings {
    public int maximumGain(String s, int x, int y) {
        String match = "";
        boolean isCaseOfX = true;

        if (x > y) {
            match = "ab";
        } else {
            match = "ba";
            isCaseOfX = false;
        }

        int score = 0;
        int i = 0;
        StringBuilder sb = new StringBuilder(s);
        int previousPosition = 0;

        while (true) {
            int position = sb.indexOf(match, previousPosition);

            if (position == -1) {
                break;
            }

            previousPosition = position - 1;

            String left  = sb.substring(0, position);
            String right = sb.substring(position + 2);
            sb.setLength(0);
            sb.append(left);
            sb.append(right);

            if (isCaseOfX) {
                score += x;
            } else {
                score += y;
            }
        }

        isCaseOfX = !isCaseOfX;
        if (isCaseOfX) {
            match = "ab";
        } else {
            match = "ba";
        }

        previousPosition = 0;
        while (true) {
            int position = sb.indexOf(match, previousPosition);

            if (position == -1) {
                break;
            }

            previousPosition = position - 1;

            String left  = sb.substring(0, position);
            String right = sb.substring(position + 2);
            sb.setLength(0);
            sb.append(left);
            sb.append(right);

            if (isCaseOfX) {
                score += x;
            } else {
                score += y;
            }
        }
        return score;
    }
}
