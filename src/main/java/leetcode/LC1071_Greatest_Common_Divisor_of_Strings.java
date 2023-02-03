package leetcode;

public class LC1071_Greatest_Common_Divisor_of_Strings {
    public String gcdOfStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();

        if (length1 < length2) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if (!str1.startsWith(str2)) {
            return "";
        }

        while (length2 != 0) {
            int n = length1 % length2;
            length1 = length2;
            length2 = n;
        }

        String gcdString = str2.substring(0, length1);
        boolean isGcd = true;
        String newStr1 = new String(str1);
        while (newStr1.length() > 0) {
            if (newStr1.startsWith(gcdString)) {
                newStr1 = newStr1.substring(gcdString.length());
                continue;
            }
            isGcd = false;
            break;
        }

        return isGcd ? gcdString : "";
    }
}
