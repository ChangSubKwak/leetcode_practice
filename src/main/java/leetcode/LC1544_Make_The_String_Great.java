package leetcode;

public class LC1544_Make_The_String_Great {
    public String makeGood(String s) {
        while (true) {
            boolean isChanged = false;
            for (int i = 0; i < s.length() - 1; i++) {
                char one = s.charAt(i);
                char two = s.charAt(i + 1);
                if (Character.isUpperCase(one) && Character.isLowerCase(two) && ((one - 'A') == (two - 'a'))) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    isChanged = true;
                    break;
                }

                if (Character.isLowerCase(one) && Character.isUpperCase(two) && ((one - 'a') == (two - 'A'))) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    isChanged = true;
                    break;
                }
            }

            if (!isChanged) {
                break;
            }
        }

        return s;
    }
}
