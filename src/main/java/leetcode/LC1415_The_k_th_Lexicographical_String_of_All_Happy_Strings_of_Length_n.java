package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC1415_The_k_th_Lexicographical_String_of_All_Happy_Strings_of_Length_n {
    List<String> happyStrings;

    public String getHappyString(int n, int k) {
        String currentString = "";
        happyStrings = new ArrayList<>();
        generateHappyStrings(n, currentString);

        if (happyStrings.size() < k) {
            return "";
        }

        Collections.sort(happyStrings);

        return happyStrings.get(k - 1);
    }

    protected void generateHappyStrings(int n, String currentString) {
        if (currentString.length() == n) {
            happyStrings.add(currentString);
            return;
        }

        for (char currentChar = 'a'; currentChar <= 'c'; currentChar++) {
            if (
                currentString.length() > 0 &&
                currentString.charAt(currentString.length() - 1) == currentChar
            ) continue;

            generateHappyStrings(n, currentString + currentChar);
        }
    }
}
