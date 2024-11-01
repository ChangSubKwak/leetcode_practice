package leetcode;

public class LC1957_Delete_Characters_to_Make_Fancy_String {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int length = s.length();

        if (length < 3) {
            return s;
        }

        int i = 0;
        while (i < length - 2) {
            char first  = s.charAt(i);
            char second = s.charAt(i + 1);
            char third  = s.charAt(i + 2);

            if (first != second || second != third) {
                sb.append(s.charAt(i));
                i++;
                continue;
            }

            int start = i;
            while (
                    start < length - 2 &&
                            s.charAt(start) == s.charAt(start + 1) &&
                            s.charAt(start + 1) == s.charAt(start + 2)
            ) {
                start++;
            }

            if (i != start) {
                sb.append(first);
                sb.append(first);
            }

            i = start + 2;
        }

        if (s.charAt(length - 3) == s.charAt(length - 2) &&
                s.charAt(length - 2) == s.charAt(length - 1)
        ) {
            return sb.toString();
        }

        if (length >= 4 && s.charAt(length - 4) == s.charAt(length - 3) &&
                s.charAt(length - 3) == s.charAt(length - 2)
        ) {
            return sb + s.substring(length - 1);
        }

        return sb + s.substring(length - 2);
    }
}
