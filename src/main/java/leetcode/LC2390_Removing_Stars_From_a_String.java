package leetcode;

public class LC2390_Removing_Stars_From_a_String {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        int starLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*') {
                starLength++;
                continue;
            }

            if (starLength > 0) {
                result.setLength(result.length() - starLength);
                starLength = 0;
            }

            result.append(c);
        }

        if (starLength > 0) {
            result.setLength(result.length() - starLength);
        }

        return result.toString();
    }
}
