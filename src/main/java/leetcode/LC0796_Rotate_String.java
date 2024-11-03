package leetcode;

public class LC0796_Rotate_String {
    public boolean rotateString(String s, String goal) {
        char first = s.charAt(0);
        int current = goal.indexOf(first);
        String converted = null;

        System.out.println("first : " + first);
        while (current >= 0) {
            converted = goal.substring(current) + goal.substring(0, current);

            if (s.equals(converted)) {
                return true;
            }
            int previous = current;
            current = goal.indexOf(first, current + 1);

            if (previous == current) {
                return false;
            }
        }

        return false;
    }
}
