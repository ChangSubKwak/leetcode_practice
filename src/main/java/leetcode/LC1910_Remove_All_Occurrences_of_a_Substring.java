package leetcode;

public class LC1910_Remove_All_Occurrences_of_a_Substring {
    public String removeOccurrences(String s, String part) {
        int i = 0;
        int partLength = part.length();
        StringBuilder sb = new StringBuilder(s);
        boolean isOccured = true;

        while (true) {
            // System.out.println(i + " ----> " + sb.toString());

            if (sb.toString().startsWith(part, i)) {
                sb = new StringBuilder(sb.substring(0, i) + sb.substring(i + partLength, sb.length()));
                isOccured = true;
                i = 0;
                continue;
            }

            if (sb.length() <= 0) {
                break;
            }

            if (i >= sb.length() - 1 && !isOccured) {
                break;
            }

            if (i >= sb.length() - 1) {
                isOccured = false;
            }

            i++;
            i %= sb.length();
        }

        return sb.toString();
    }
}
